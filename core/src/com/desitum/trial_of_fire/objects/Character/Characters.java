package com.desitum.trial_of_fire.objects.Character;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kody on 3/15/15.
 * can be used by kody and people in []
 */
public class Characters {

    public static final int NAME = 0;
    public static final int HEALTH = 1;
    public static final int STRENGTH = 2;
    public static final int DEFENSE = 3;
    public static final int LUCK = 4;
    public static final int SPEED = 4;
    public static final int MOVEMENT = 5;
    public static final int MAX_HEALTH = 6;
    public static final int MAX_STRENGTH = 7;
    public static final int MAX_DEFENSE = 8;
    public static final int MAX_LUCK = 9;
    public static final int MAX_SPEED = 10;
    public static final int MAX_MOVEMENT = 11;
    public static final int CHAR_TYPE = 12;
    public static final int CHAR_ANIM = 13;

    public Character buildCharacterFromArray(ArrayList<String> characterAttributes){
        return new Character(characterAttributes.get(NAME),
                Integer.parseInt(characterAttributes.get(HEALTH)),
                Integer.parseInt(characterAttributes.get(STRENGTH)),
                Integer.parseInt(characterAttributes.get(DEFENSE)),
                Integer.parseInt(characterAttributes.get(LUCK)),
                Integer.parseInt(characterAttributes.get(SPEED)),
                Integer.parseInt(characterAttributes.get(MOVEMENT)),
                Integer.parseInt(characterAttributes.get(MAX_HEALTH)),
                Integer.parseInt(characterAttributes.get(MAX_STRENGTH)),
                Integer.parseInt(characterAttributes.get(MAX_DEFENSE)),
                Integer.parseInt(characterAttributes.get(MAX_LUCK)),
                Integer.parseInt(characterAttributes.get(MAX_SPEED)),
                Integer.parseInt(characterAttributes.get(MAX_MOVEMENT)),
                CharacterType.buildFromString(characterAttributes.get(CHAR_TYPE)),
                CharacterAnimation.buildFromString(characterAttributes.get(CHAR_ANIM)));
    }

    public Character buildCharacterFromString(String characterString){
        ArrayList<String> returnArray = new ArrayList<String>(Arrays.asList(characterString.split(",")));
        return buildCharacterFromArray(returnArray);
    }
}
