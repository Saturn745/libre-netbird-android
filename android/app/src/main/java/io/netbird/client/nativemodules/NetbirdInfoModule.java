package io.netbird.client.nativemodules;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;

import io.netbird.client.BuildConfig;

public class NetbirdInfoModule extends ReactContextBaseJavaModule {

    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> c = new HashMap<>();
        c.put("VERSION", BuildConfig.VERSION_NAME);
        return c;
    }

    @NonNull
    @Override
    public String getName() {
        return "NBInfo";
    }

}
