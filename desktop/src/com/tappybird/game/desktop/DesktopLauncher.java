package com.tappybird.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.tappybird.game.TBGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title="TappyBird";
		config.width=480;
		config.height=320;
		new LwjglApplication(new TBGame(), config);
	}
}
