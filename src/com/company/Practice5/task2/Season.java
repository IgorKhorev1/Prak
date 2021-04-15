package com.company.Practice5.task2;

public enum Season {
    WINTER(Games.GAME_FOR_WINTER),
    SPRING(Games.GAME_FOR_SPRING),
    SUMMER(Games.GAME_FOR_SUMMER),
    AUTUMN(Games.GAME_FOR_AUTUMN);

    Games gameForSeason;

    Season(Games game) {
        this.gameForSeason = game;
    }
}
