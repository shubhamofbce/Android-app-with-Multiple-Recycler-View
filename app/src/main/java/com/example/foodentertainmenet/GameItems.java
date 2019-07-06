package com.example.foodentertainmenet;

public class GameItems {
    String GameName;
    int Gameimg;

    public GameItems(String gameName, int gameimg) {
        GameName = gameName;
        Gameimg = gameimg;
    }

    public String getGameName() {
        return GameName;
    }

    public int getGameimg() {
        return Gameimg;
    }
}
