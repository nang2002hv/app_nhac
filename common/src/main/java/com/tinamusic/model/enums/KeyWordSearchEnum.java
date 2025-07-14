package com.tinamusic.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum KeyWordSearchEnum {
    USER(0), ALL_USER(1);

    @JsonValue
    private final int value;

    KeyWordSearchEnum(int value) {
        this.value = value;
    }

    public static KeyWordSearchEnum fromValue(int value) {
        for (KeyWordSearchEnum type : KeyWordSearchEnum.values()) {
            if (type.getValue() == value) {
                return type;
            }
        }

        throw new IllegalArgumentException("Unexpected value: " + value);
    }
}

