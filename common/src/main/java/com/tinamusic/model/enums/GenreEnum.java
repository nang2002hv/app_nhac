package com.tinamusic.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum GenreEnum {
    GENRE(0), THEME(1);

    @JsonValue
    public final int value;

    GenreEnum(int value) {
        this.value = value;
    }

    public static GenreEnum fromValue(int value) {
        for (GenreEnum genre : GenreEnum.values()) {
            if (genre.value == value) {
                return genre;
            }
        }

        throw new IllegalArgumentException("Invalid GenreEnum value: " + value);
    }
}
