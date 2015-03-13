package com.desitum.trial_of_fire.objects.World;

import java.util.ArrayList;

/**
 * Created by Zmyth97 on 3/10/2015.
 */
public class LevelMaps {

    ArrayList<ArrayList<GameTile>> maps;

    private static final int G = 1;

    public static ArrayList<GameTile> loadMap(int levelNum){
        int[][] mapToLoad = null;
        ArrayList<GameTile> returnMap = new ArrayList<GameTile>();
        switch (levelNum){
            case 1:
                mapToLoad = loadLevel1();
            case 2:
                mapToLoad = loadLevel1();

        }

        int rowNum = 0;
        int colNum = 0;
        for (int[] row: mapToLoad){
            for (int column: row){
                if (column == G){
                    returnMap.add(new GameTile(1, 1, 1));
                }
                colNum++;
            }
            rowNum++;
        }
        return null;
    }

    private static int[][] loadLevel1(){
        int[][] returnLevel = {
                {G, G, G, G},
                {G, G, G, G},
                {G, G, G, G}};
        return returnLevel;
    }
}
