package com.desitum.trial_of_fire.objects.Character;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by Zmyth97 on 3/10/2015.
 */
public class Character extends Sprite {

    private int health;
    private int strength;
    private int defense;
    private int luck;
    private int speed;
    private int movement;

    private int maxHealth; //Max is 150
    private int maxStrength; //Max is 50
    private int maxDefense; //Max is 45
    private int maxLuck; //Max is 25
    private int maxSpeed; //Max is 20
    private int maxMovement; //Max is 10

    private CharacterAnimation anim;

    public Character(int health, int strength, int defense, int luck, int speed, int movement, CharacterAnimation anim){
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        this.luck = luck;
        this.speed = speed;
        this.movement = movement;
        this.anim = anim;
    }

    public void update(float delta){

    }

}
