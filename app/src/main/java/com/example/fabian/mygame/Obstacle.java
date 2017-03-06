package com.example.fabian.mygame;

/**
 * Created by Fabian on 06.03.2017.
 */

public class Obstacle {
    float x = Game.screenWidth+100;
    int level;
    boolean height;

    Obstacle(int level, boolean hight){
        this.level = level;
        this.height = height;
    }
}
