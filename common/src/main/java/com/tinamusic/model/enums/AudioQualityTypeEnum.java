package com.tinamusic.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum AudioQualityTypeEnum {
    KBPS_128(0), KBPS_320(1);

    @JsonValue
    public final int value;

    private AudioQualityTypeEnum(int value) {
        this.value = value;
    }
}
