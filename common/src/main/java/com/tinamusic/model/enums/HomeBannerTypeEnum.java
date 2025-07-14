package com.tinamusic.model.enums;

public enum HomeBannerTypeEnum {
    SONG(0), SINGER(1), ALBUM(2);

    public final int value;

    private HomeBannerTypeEnum(int value) {
        this.value = value;
    }
}
