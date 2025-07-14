package com.tinamusic.model.enums;

public enum UserAccountTypeEnum {
    NORMAL("Normal"),
    PRO("Pro"),
    VIP("Vip")

    ;

    public final String value;

    private UserAccountTypeEnum(String value) {
        this.value = value;
    }
}
