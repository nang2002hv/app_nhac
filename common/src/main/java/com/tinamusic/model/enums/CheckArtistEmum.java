package com.tinamusic.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CheckArtistEmum {
    ARTIST(0), ARTIST_YTB(1);
    @JsonValue
    public final int value;

    CheckArtistEmum(int value) {
        this.value = value;
    }

    public static CheckArtistEmum fromValue(int value) {
        for (CheckArtistEmum checkArtistEmum : CheckArtistEmum.values()) {
            if (checkArtistEmum.value == value) {
                return checkArtistEmum;
            }
        }

        throw new IllegalArgumentException("Invalid GenreEnum value: " + value);
    }
}
