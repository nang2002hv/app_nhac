package com.tinamusic.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum InteractionTypeEnum {
    LISTEN(0), LIKE(1), SHARE(2), DOWNLOAD(3), ADD(4);

    @JsonValue
    public final int value;

    InteractionTypeEnum(int i) {
        value = i;
    }

    public static InteractionTypeEnum fromValue(int value) {
        for (InteractionTypeEnum interactionTypeEnum : InteractionTypeEnum.values()) {
            if (interactionTypeEnum.value == value) {
                return interactionTypeEnum;
            }
        }
        throw new IllegalArgumentException("Invalid InteractionTypeEnum value: " + value);
    }
}
