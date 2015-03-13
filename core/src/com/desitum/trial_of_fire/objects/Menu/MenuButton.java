package com.desitum.trial_of_fire.objects.Menu;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by dvan6234 on 3/12/2015.
 */
public class MenuButton extends Sprite {

    private String command;

    public MenuButton(Texture texture, String command, float sizeX, float sizeY, float x, float y){
        super(texture, 0, 0, texture.getWidth(), texture.getHeight());
        setSize(sizeX, sizeY);
        this.command = command;
    }

    public String getCommand(){
        return command;
    }
}
