package com.company.Practice5.task2;

public enum Games {
    GAME_FOR_WINTER("snowball"),
    GAME_FOR_SPRING("launching boats on streams"),
    GAME_FOR_SUMMER("picking and eating berries"),
    GAME_FOR_AUTUMN("measuring depth of pool by method \"the boot\"");

    String game;

    Games(String game) {
        this.game = game;
    }
}
