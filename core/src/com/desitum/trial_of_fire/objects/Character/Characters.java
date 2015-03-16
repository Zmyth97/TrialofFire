package com.desitum.trial_of_fire.objects.Character;

import java.util.ArrayList;

/**
 * Created by kody on 3/15/15.
 * can be used by kody and people in []
 */
public class Characters {

    public static final int HEALTH = 0;
    public static final int STRENGTH = 1;
    public static final int DEFENSE = 2;
    public static final int LUCK = 3;
    public static final int SPEED = 4;
    public static final int MOVEMENT = 5;

    public Character buildCharacterFromArray(ArrayList<String> characterAttributes){
        return new Character();
    }

    public Character buildCharacterFromString(String characterString){
        characterString.split(",");return new Character();
    }
}
