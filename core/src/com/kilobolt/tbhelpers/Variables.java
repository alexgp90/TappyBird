package com.kilobolt.tbhelpers;

/**
 * Created by alexandru.pavel on 04.11.2016.
 */



public class Variables {


    private static int SCROLL_SPEED = -69;
    private static final int PIPE_GAP = 49;

    private static final int VERTICAL_GAP = 45;
    private static final int SKULL_WIDTH = 24;
    private static final int SKULL_HEIGHT = 11;

    public static int getScrollSpeed() {
        return SCROLL_SPEED;
    }

    public static int getPipeGap() {
        return PIPE_GAP;
    }

    public static int getVerticalGap() {
        return VERTICAL_GAP;
    }

    public static int getSkullWidth() {
        return SKULL_WIDTH;
    }

    public static int getSkullHeight() {
        return SKULL_HEIGHT;
    }

    public void increaseScrollSpeed(int speed) { SCROLL_SPEED = SCROLL_SPEED - speed; }


}
