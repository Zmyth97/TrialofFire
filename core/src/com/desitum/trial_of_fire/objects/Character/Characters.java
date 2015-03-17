package com.desitum.trial_of_fire.objects.Character;

import java.util.ArrayList;
import java.util.Arrays;

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
        return new Character(Integer.parseIntcharacterAttributes.get(HEALTH)),
                Integer.parseInt(characterAttributes.get(STRENGTH)),
                Integer.parseInt(characterAttributes.get(LUCK)),
                Integer.parseInt(characterAttributes.get(SPEED)),
                Integer.parseInt(characterAttributes.get(MOVEMENT)));
    }

    public Character buildCharacterFromString(String characterString){
        ArrayList<String> returnArray = new ArrayList<String>(Arrays.asList(characterString.split(",")));
        return buildCharacterFromArray(returnArray);
    }
}
