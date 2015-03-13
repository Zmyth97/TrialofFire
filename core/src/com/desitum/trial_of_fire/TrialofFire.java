package com.desitum.trial_of_fire;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;;
import com.desitum.trial_of_fire.data.Assets;
import com.desitum.trial_of_fire.screens.SplashScreen;

public class TrialofFire extends Game {

	
	@Override
	public void create () {
        Screen splashScreen = new SplashScreen(this);
        this.setScreen(splashScreen);
	}

    @Override
    public void render () {
        super.render();
    }

    @Override
    public void dispose () {
        super.dispose();

        Assets.dispose();

        getScreen().dispose();
    }
}
