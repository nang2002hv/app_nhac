package com.tinamusic.model.enums;

public enum TypePlaylistEnum {
    RECENTLY_HEARD(0),
    NORMAL(1),
//    FAVORITE(2)
    ;

    private final int value;

    TypePlaylistEnum(int value) {
        this.value = value;
    }
}
