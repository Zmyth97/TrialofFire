package com.desitum.trial_of_fire.objects.World;

/**
 * Created by dvan6234 on 3/12/2015.
 */
public class GameTile {
    //needs to have attributes mentioned in outline we made

    public static final int GRASS = 1;
    public static final int PATH = 2;
    public static final int FOREST = 3;

    private int type;
    private int x, y;

    public GameTile(int x, int y, int type){
        this.type = type;
        this.x = x;
        this.y = y;
    }

}
