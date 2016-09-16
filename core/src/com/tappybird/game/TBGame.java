package com.tappybird.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.kilobolt.screens.GameScreen;


public class TBGame extends Game {

	@Override
	public void create(){
		Gdx.app.log("TBGame","created");
		setScreen(new GameScreen());

	}

}