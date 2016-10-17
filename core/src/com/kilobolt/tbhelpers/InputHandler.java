package com.kilobolt.tbhelpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.kilobolt.gameobjects.Bird;
import com.kilobolt.gameworld.GameWorld;

public class InputHandler implements InputProcessor {
    private Bird myBird;
    private GameWorld myWorld;

    // Ask for a reference to the Bird when InputHandler is created.
    public InputHandler(GameWorld myWorld) {
        // myBird now represents the gameWorld's bird.
        this.myWorld = myWorld;
        myBird = myWorld.getBird();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {

        if (myWorld.isReady()) {
            myWorld.start();
        }

        //myBird.onClick();

        if (myWorld.isGameOver() || myWorld.isHighScore()) {
            // Reset all variables, go to GameState.READ
            myWorld.restart();
        }
        if (screenX>136 && screenY>136) {
            Gdx.app.log("InputHandler", "right side");
         //   myBird.onClickRight();
            myBird.onStartclickRight();
            //cod pentru miscat la dreapta
        }
        if (screenX<136 && screenY>136) {
            Gdx.app.log("InputHandler", "left side");

           // myBird.onClickLeft();
            myBird.onStartclickLeft();
            //cod pentru miscat la stanga
        }
        return true;
    }

    @Override
    public boolean keyDown(int keycode) {
        myBird.onClickRight();
        ///http://badlogicgames.com/forum/viewtopic.php?t=3783&p=18408
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        myBird.onClickLeft();
        return true;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        if (screenX>136 && screenY>136) {
            Gdx.app.log("InputHandler", "right side");
            myBird.onStopclickRight();
            //cod pentru miscat la dreapta
        }
        if (screenX<136 && screenY>136) {
            Gdx.app.log("InputHandler", "left side");
            myBird.onStopclickLeft();;
            //cod pentru miscat la stanga
        }

        return true;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }

}
