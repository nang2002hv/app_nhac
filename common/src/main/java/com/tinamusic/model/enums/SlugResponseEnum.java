package com.tinamusic.model.enums;

public enum SlugResponseEnum {
    BANNER(0), SUGGEST_ALBUM(1), FOLLOWING_ARTIST(2), SUGGEST_PLAYLIST(3), MUSIC_COLLECTION(4);

    public final int value;

    SlugResponseEnum(int value) {
        this.value = value;
    }
}
