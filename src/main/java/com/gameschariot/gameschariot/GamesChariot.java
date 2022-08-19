package com.gameschariot.gameschariot;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class GamesChariot {
    private final JsonObject gamesList;

    public GamesChariot(JsonObject allGames) {
        this.gamesList = allGames;
    }
    public JsonObject getContent() {
        return gamesList;
    }
    public String welcomeMessage() {
        return "Welcome";
    }
}
