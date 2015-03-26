package com.desitum.trial_of_fire.objects.Character;

/**
 * Created by Zmyth97 on 3/13/2015.
 */
public class CharacterType {

    static final int ARCHER = 0;
    static final int INFANTRY = 1;
    static final int CALVARY = 2;
    static final int BOSS = 3;

    public CharacterType(){

    }

    public static CharacterType buildFromString(String parseFrom){
        //TODO needs to return a CharacterType from String
        return new CharacterType();
    }
}
