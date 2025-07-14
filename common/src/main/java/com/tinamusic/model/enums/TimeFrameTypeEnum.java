package com.tinamusic.model.enums;

public enum TimeFrameTypeEnum {
    DAY("DAY"), MONTH("MONTH"), YEAR("YEAR");

    public final String value;

    TimeFrameTypeEnum(String i) {
        value = i;
    }
}
