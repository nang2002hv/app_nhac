package com.tinamusic.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum PlaylistTypeEnum {
    PLAYLIST(0), ALBUM(1), TOP100(2);

    @JsonValue
    public final int value;

    PlaylistTypeEnum(int i) {
        value = i;
    }

    public static PlaylistTypeEnum fromValue(int value) {
        for (PlaylistTypeEnum playlistTypeEnum : PlaylistTypeEnum.values()) {
            if (playlistTypeEnum.value == value) {
                return playlistTypeEnum;
            }
        }

        throw new IllegalArgumentException("Invalid PlaylistTypeEnum value: " + value);
    }
}
