package com.desitum.trial_of_fire.objects.World;

/**
 * Created by Zmyth97 on 3/10/2015.
 */
public class Farm {
    //Crop Types
    public static final int POTATO = 0;
    public static final int CORN = 1;
    public static final int LETTUCE = 2;
    public static final int TURNIP = 3;
    public static final int WHEAT = 4;

    //You move to another crop type after every 4 levels?
    public int type;
    public int cashValue;
    public int growTime; //In Turns or Levels?
    public int cost;

    public Farm(int type, int cost, int growTime, int cashValue){
        this.type = type;
        this.cost = cost;
        this.growTime = growTime;
        this.cashValue = cashValue;
    }

    public void buyCrops(){

    }

    public void growCrops(){

    }

    public void sellCrops(){

    }

}
