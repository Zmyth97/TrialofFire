package com.desitum.trial_of_fire.screens;

import com.desitum.trial_of_fire.TrialofFire;

/**
 * Created by Zmyth97 on 3/10/2015.
 */
public class GameScreen {

    private TrialofFire gameToF;

    public static int state;
    public static final int STORY = 0;
    public static final int IN_BATTLE = 1;
    public static final int CONVERSATION = 2;
    public static final int GAME_PLAY = 3;
    public static final int PAUSED = 4;

    public GameScreen(TrialofFire game){
        gameToF = game;
    }
}
