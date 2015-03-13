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
    public int turn;
    public int cooldown;

    private Character character;

    public CharacterSkills(Character character){
       this.character = character;
    }

    public void update(float delta){
        switch(skill){
            case LUCKY_STRIKE:
                luckyStrike();
                break;
            case SWIFT_SWORD:
                swiftSword();
                break;
            case DOUBLE_MOVE:
                doubleMove();
                break;
            case INVINCIBLE:
                invincible();
                break;
            case DOUBLE_STRIKE:
                doubleStrike();
                break;
            case RECHARGE:
                recharge();
                break;
            case DODGE:
                dodge();
                break;
            case SECOND_WIND:
                secondWind();
                break;
            case HEAL_SPLASH:
                healSplash();
                break;
            case RAGE:
                rage();
                break;
            case WARCRY:
                warcry();
                break;
            case RETREAT:
                retreat();
                break;
            case VENOM_STRIKE:
                venomStrike();
                break;
            case TELEPORT:
                teleport();
                break;
            case RALLY:
                rally();
                break;
            case RAID:
                raid();
                break;
        }
    }

    private void luckyStrike(){
        //One hit kill (only for bows) (2% chance)
        character.setStrength(2000);
    }

    private void swiftSword(){
        //Double Damage (3%)
        character.setStrength(character.getStrength() * 2);
    }

    private void doubleMove(){
        //Get double moves next turn
        character.setMovement(character.getMovement() * 2);
    }

    private void invincible(){
        //No damage for the next hit

    }

    private void doubleStrike(){
        //Attack twice
    }

    private void recharge(){
        //Instant recharge on your ability
        cooldown = 0;
    }

    private void dodge(){
        //Enemy misses his attack

    }

    private void secondWind(){
        //Small percentage of health restored
        int restoreAmount = character.getMaxHealth() / 8;
        character.setHealth(character.getHealth() + restoreAmount);
        if(character.getHealth() > character.getMaxHealth()){
            character.setHealth(character.getMaxHealth());
        }
    }

    private void healSplash(){
        //Heals up to 3 nearby people for 20% of health - (3 turn cooldown)

    }

    private void rage(){
        //Deal 20% more damage for 2 turns (3 turn cooldown)
        int rageAmount = (int)((float) character.getStrength() * 1.2f);
        character.setStrength(rageAmount);
    }

    private void warcry(){
        //Strength of nearby characters +5 for a turn (2 turn cooldown)

    }

    private void retreat(){
        //Moves you away from the nearest enemy (5 tiles) (4 turn cooldown)

    }

    private void venomStrike(){
        //Next strike poisons. Poisoned enemy gets 10% of their health taken for next 3 turns (4 turn cooldown)

    }

    private void teleport(){
        //Lets you  move to any spot on the battle map (7 turn cooldown)

    }

    private void rally(){
        //Defense of nearby characters +5 for a turn (2 turn cooldown)

    }

    private void raid(){
        //Speed of nearby characters +5 for a turn (2 turn cooldown)
    }

}
