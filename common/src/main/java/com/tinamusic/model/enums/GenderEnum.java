package com.tinamusic.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum GenderEnum {
    MALE(0), FEMALE(1), UNKNOWN(2);

    @JsonValue
    public final int value;

    GenderEnum(int value) {
        this.value = value;
    }

    public static GenderEnum fromValue(int value) {
        for (GenderEnum gender : GenderEnum.values()) {
            if (gender.value == value) {
                return gender;
            }
        }

        throw new IllegalArgumentException("Invalid GenreEnum value: " + value);
    }
}
