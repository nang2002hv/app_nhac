package com.tinamusic.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SongTypeEnum {
    SONG(0), YOUTUBE(1);
    @JsonValue
    public final int value;

    SongTypeEnum(int value) {
        this.value = value;
    }

    public static SongTypeEnum fromValue(int value) {
        for (SongTypeEnum songTypeEnum : SongTypeEnum.values()) {
            if (songTypeEnum.value == value) {
                return songTypeEnum;
            }
        }
        return null;
    }
}
