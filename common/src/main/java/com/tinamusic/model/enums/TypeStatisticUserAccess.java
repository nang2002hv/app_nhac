package com.tinamusic.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TypeStatisticUserAccess {
    BY_DAY(0),
    BY_MONTH(1),
    BY_YEAR(2);

    @JsonValue
    public final int value;

    TypeStatisticUserAccess(int i) {
        value = i;
    }
}
