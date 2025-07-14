package com.tinamusic.model.enums;

public enum ProviderEnum {
    GOOGLE(0), FACEBOOK(1);

    public final int value;

    ProviderEnum(int i) {
        value = i;
    }
}
