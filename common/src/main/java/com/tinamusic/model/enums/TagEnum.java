package com.tinamusic.model.enums;

public enum TagEnum {
    // Age
    ALL_AGES("6+"),
    TEENS("13+"),
    ADULTS("18+"),

    // Context
    WORKING("Working Music"),
    STUDYING("Studying Music"),
    RELAXING("Relaxing Music"),
    WORKOUT("Workout Music"),
    DRIVING("Driving Music"),
    PARTY("Party Music"),
    MORNING("Morning Music"),
    EVENING("Evening Music"),
    SLEEP("Sleep Music"),
    TRAVEL("Travel Music"),

    // Language
    VIETNAMESE("Vietnamese"),
    ENGLISH("English"),
    KOREAN("Korean"),
    JAPANESE("Japanese"),
    CHINESE("Chinese"),
    FRENCH("French"),
    SPANISH("Spanish"),

    ;

    public final String value;

    private TagEnum(String value) {
        this.value = value;
    }
}
