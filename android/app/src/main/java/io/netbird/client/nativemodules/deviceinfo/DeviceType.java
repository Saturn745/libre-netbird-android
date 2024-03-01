package io.netbird.client.nativemodules.deviceinfo;

public enum DeviceType {
    HANDSET("Handset"),
    TABLET("Tablet"),
    TV("Tv"),
    UNKNOWN("unknown");

    public final String value;

    DeviceType(String _value) {
        this.value = _value;
    }

    public String getValue() {
        return value;
    }
}