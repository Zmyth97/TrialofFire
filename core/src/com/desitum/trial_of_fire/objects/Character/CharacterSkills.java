package com.desitum.trial_of_fire.objects.Character;

/**
 * Created by Zmyth97 on 3/13/2015.
 */
public class CharacterSkills {
    //In Battle Skills
    public static final int LUCKY_STRIKE = 0;
    public static final int SWIFT_SWORD = 1;
    public static final int DOUBLE_MOVE = 2;
    public static final int INVINCIBLE = 3;
    public static final int DOUBLE_STRIKE = 4;
    public static final int RECHARGE = 5;
    public static final int DODGE = 6;
    public static final int SECOND_WIND = 7;

    //Out of Battle Abilities
    public static final int HEAL_SPLASH = 8;
    public static final int RAGE = 9;
    public static final int WARCRY = 10;
    public static final int RETREAT = 11;
    public static final int VENOM_STRIKE = 12;
    public static final int TELEPORT = 13;
    public static final int RALLY = 14;
    public static final int RAID = 15;

    public static int skill = 0;
    public float duration;
    public int cooldown;

    private Character character;

    public CharacterSkills(Character character){
       this.character = character;
    }

    public void update(float delta){
        switch(skill){
            case LUCKY_STRIKE:
                luckyStrike();
        }
    }
}
