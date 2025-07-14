package com.tinamusic.model.enums;

public enum TypeOfCountEnum {
    SONG("SONG"), ALBUM("ALBUM") , PLAYLIST("PLAYLIST");

    public final String value;

    TypeOfCountEnum(String i) {
        value = i;
    }
}