package io.netbird.client.nativemodules.deviceinfo;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class DeviceInfoModule extends ReactContextBaseJavaModule {

    private final DeviceInfo deviceInfo;

    public DeviceInfoModule(ReactApplicationContext ctx) {
        super(ctx);
        this.deviceInfo = new DeviceInfo(ctx);
    }

    @ReactMethod
    public String getDeviceType() {
        return deviceInfo.getDeviceType().value;
    }

    @NonNull
    @Override
    public String getName() {
        return "NBDeviceInfo";
    }

}