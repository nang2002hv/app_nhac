package com.tinamusic.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum ArtistTypeEnum {
    SINGER(0), MUSICIAN(1), SINGER_MUSICIAN(2);

    @JsonValue
    private final int value;

    ArtistTypeEnum(int value) {
        this.value = value;
    }

    public static ArtistTypeEnum fromValue(int value) {
        for (ArtistTypeEnum type : ArtistTypeEnum.values()) {
            if (type.getValue() == value) {
                return type;
            }
        }

        throw new IllegalArgumentException("Unexpected value: " + value);
    }
}
