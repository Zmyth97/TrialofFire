package com.desitum.trial_of_fire.world;

import com.badlogic.gdx.math.Vector3;
import com.desitum.trial_of_fire.data.GameFile;
import com.desitum.trial_of_fire.libraries.CollisionDetection;
import com.desitum.trial_of_fire.objects.Character.Character;
import com.desitum.trial_of_fire.objects.World.GameTile;

import java.util.ArrayList;

/**
 * Created by Zmyth97 on 3/10/2015.
 */
public class GameWorld {

    private ArrayList<Character> players;
    private ArrayList<GameTile> levelTiles;
    private Character playerSelected;
    //TODO for future chest and on level items

    public GameWorld(){
        players = GameFile.getPlayableCharacters();
    }

    public void onClick(Vector3 touchPosition){
        for (Character p: players){
            if (CollisionDetection.pointInRectangle(p.getBoundingRectangle(), touchPosition)){
                selectPlayer(p);
            }
        }
    }

    private void selectPlayer(Character player){
        player.select();
    }

}
