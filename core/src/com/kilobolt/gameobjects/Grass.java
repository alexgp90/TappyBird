package com.kilobolt.gameobjects;

/**
 * Created by alexandru.pavel on 26.09.2016.
 */
public class Grass extends Scrollable {

    public Grass(float x, float y, int width, int height, float scrollSpeed) {
        super(x, y, width, height, scrollSpeed);
    }

    public void onRestart(float x, float scrollSpeed) {
        position.x = x;
        velocity.x = scrollSpeed;
    }

}
