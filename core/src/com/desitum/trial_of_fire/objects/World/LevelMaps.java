package com.desitum.trial_of_fire.objects.World;

import java.util.ArrayList;

/**
 * Created by Zmyth97 on 3/10/2015.
 */
public class LevelMaps {

    ArrayList<ArrayList<GameTile>> maps;

    public static ArrayList<GameTile> loadMap(int levelNum){
        switch (levelNum){
            case 1:
                return loadLevel1();
            case 2:
                return loadLevel1();

        }
        return null;
    }

    private static ArrayList<GameTile> loadLevel1(){

    }
}
