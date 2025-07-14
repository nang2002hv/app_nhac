package com.tinamusic.model.enums;

public enum LoginTypeEnum {
    EMAIL(0), FACEBOOK(1), GOOGLE(2);

    public final int value;

    LoginTypeEnum(int i) {
        value = i;
    }
}
