package com.tinamusic.model.enums;

public enum ActivityStatusEnum {
    ACTIVE(0), INACTIVE(1);

    public final int value;

    private ActivityStatusEnum(int value) {
        this.value = value;
    }
}
