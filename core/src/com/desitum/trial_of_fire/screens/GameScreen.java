package com.desitum.trial_of_fire.screens;

import com.desitum.trial_of_fire.TrialofFire;

/**
 * Created by Zmyth97 on 3/10/2015.
 */
public class GameScreen {

    private TrialofFire gameToF;

    public static int state;
    public static final int STORY;
    public static final int IN_BATTLE;
    public static final int CONVERSATION;
    public static final int GAME_PLAY;
    public static final int PAUSED;

    public GameScreen(TrialofFire game){
        gameToF = game;
    }
}
