package com.tinamusic.model.enums;

public enum UserStatusEnum {
    LOCKED(0), ACTIVE(1), PENDING(2);

    public final int value;

    private UserStatusEnum(int value) {
        this.value = value;
    }
}
