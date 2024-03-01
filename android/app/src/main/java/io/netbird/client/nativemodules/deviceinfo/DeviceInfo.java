package io.netbird.client.nativemodules.deviceinfo;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;

// https://github.com/react-native-device-info/react-native-device-info/blob/81362342e5da4d00dd81b27799e72dcbf0b54904/android/src/main/java/com/learnium/RNDeviceInfo/resolver/DeviceTypeResolver.java
public class DeviceInfo {
    private final Context ctx;

    public DeviceInfo(Context _ctx) {
        this.ctx = _ctx;
    }

    public DeviceType getDeviceType() {
        if (ctx.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")) {
            return DeviceType.TV;
        }
        UiModeManager uiManager = (UiModeManager) ctx.getSystemService(Context.UI_MODE_SERVICE);
        if (uiManager != null && uiManager.getCurrentModeType() == Configuration.UI_MODE_TYPE_TELEVISION) {
            return DeviceType.TV;
        }
        DeviceType deviceTypeFromConfig = getDeviceTypeFromResourceConfiguration();
        if (deviceTypeFromConfig != null && deviceTypeFromConfig != DeviceType.UNKNOWN) {
            return deviceTypeFromConfig;
        }
        WindowManager windowManager = (WindowManager) ctx.getSystemService(Context.WINDOW_SERVICE);
        if (windowManager == null) {
            return DeviceType.UNKNOWN;
        }
        DisplayMetrics metrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(metrics);
        double widthInches = metrics.widthPixels / (double) metrics.xdpi;
        double heightInches = metrics.heightPixels / (double) metrics.ydpi;
        double diagonalSizeInches = Math.sqrt(Math.pow(widthInches, 2) + Math.pow(heightInches, 2));
        if (diagonalSizeInches >= 3.0 && diagonalSizeInches <= 6.9) {
            return DeviceType.HANDSET;
        } else if (diagonalSizeInches > 6.9 && diagonalSizeInches <= 18.0) {
            return DeviceType.TABLET;
        } else {
            return DeviceType.UNKNOWN;
        }
    }

    private DeviceType getDeviceTypeFromResourceConfiguration() {
        int smallestScreenWidthDp = ctx.getResources().getConfiguration().smallestScreenWidthDp;

        if (smallestScreenWidthDp == Configuration.SMALLEST_SCREEN_WIDTH_DP_UNDEFINED) {
            return DeviceType.UNKNOWN;
        }

        return smallestScreenWidthDp >= 600 ? DeviceType.TABLET : DeviceType.HANDSET;
    }
}