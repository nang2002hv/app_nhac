package com.tinamusic.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum RankingTypeEnum {
    WEEKLY(0), MONTHLY(1), YEARLY(2);

    @JsonValue
    public final int value;

    RankingTypeEnum(int value) {
        this.value = value;
    }

    public static RankingTypeEnum fromValue(int value) {
        for (RankingTypeEnum rankingType : RankingTypeEnum.values()) {
            if (rankingType.value == value) {
                return rankingType;
            }
        }

        throw new IllegalArgumentException("Invalid GenreEnum value: " + value);
    }
}
