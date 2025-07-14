package com.tinamusic.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum RoleEnum {
    ADMIN(0), ARTIST(1), END_USER(2);

    @JsonValue
    public final int value;

    RoleEnum(int i) {
        value = i;
    }

    public static RoleEnum fromValue(int value) {
        for (RoleEnum role : RoleEnum.values()) {
            if (role.value == value) {
                return role;
            }
        }

        throw new IllegalArgumentException("Unexpected value: " + value);
    }
}
