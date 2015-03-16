package com.desitum.trial_of_fire.objects.Character;

import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by Zmyth97 on 3/10/2015.
 */
public class Character extends Sprite {

    public CharacterSkills charSkills;

    public String name;

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

    private CharacterType type;
    private CharacterAnimation anim;

    public Character(String name, int health, int strength, int defense, int luck, int speed, int movement, int maxHealth, int maxStrength,
                     int maxDefense, int maxLuck, int maxSpeed, int maxMovement, CharacterType type, CharacterAnimation anim){
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        this.luck = luck;
        this.speed = speed;
        this.movement = movement;
        this.maxHealth = maxHealth;
        this.maxStrength = maxStrength;
        this.maxDefense = maxDefense;
        this.maxLuck = maxLuck;
        this.maxSpeed = maxSpeed;
        this.maxMovement = maxMovement;
        this.anim = anim;
        this.type = type;
        this.charSkills = new CharacterSkills(this);
    }

    public void update(float delta){

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getMaxStrength() {
        return maxStrength;
    }

    public void setMaxStrength(int maxStrength) {
        this.maxStrength = maxStrength;
    }

    public int getMaxDefense() {
        return maxDefense;
    }

    public void setMaxDefense(int maxDefense) {
        this.maxDefense = maxDefense;
    }

    public int getMaxLuck() {
        return maxLuck;
    }

    public void setMaxLuck(int maxLuck) {
        this.maxLuck = maxLuck;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxMovement() {
        return maxMovement;
    }

    public void setMaxMovement(int maxMovement) {
        this.maxMovement = maxMovement;
    }

    public void select(){
        //TODO idk yet...
    }
}
