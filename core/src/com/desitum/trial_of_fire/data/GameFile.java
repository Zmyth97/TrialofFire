package com.desitum.trial_of_fire.data;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.desitum.trial_of_fire.objects.Character.Character;

import java.util.ArrayList;

/**
 * Created by kody on 3/14/15.
 * can be used by kody and people in []
 */
public class GameFile {

    private static ArrayList<String> files = null;

    public void load(){
        files = new ArrayList<String>();

        Preferences gameFilesPrefs = Gdx.app.getPreferences("com.desitum.tof.game_files");

        String file1 = gameFilesPrefs.getString("File 1", "----");
        String file2 = gameFilesPrefs.getString("File 2", "----");
        String file3 = gameFilesPrefs.getString("File 3", "----");
    }

    public static ArrayList<String> getFiles(){
        return files;
    }

    public boolean loadFile(String file){
        if (!file.equals("----")){
            return false;
        } else {
            Preferences filePrefs = Gdx.app.getPreferences(file);


            return true;
        }
    }

    public static ArrayList<Character> getPlayableCharacters(){
        return new ArrayList<Character>();
    }
}
