package com.tinamusic.model.enums;

public enum OtpDestinationEnum {
    DEFAULT(0), EMAIL(1) ;

    public final int value;

    OtpDestinationEnum(int i) {
        value = i;
    }
}
