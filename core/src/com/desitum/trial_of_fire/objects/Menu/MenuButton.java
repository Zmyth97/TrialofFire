package com.desitum.trial_of_fire.objects.Menu;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by dvan6234 on 3/12/2015.
 */
public class MenuButton extends Sprite {

    private String command;
    private Texture baseTexture;
    private Texture activeTexture;

    public MenuButton(Texture texture, Texture activeTexture, String command, float sizeX, float sizeY, float x, float y){
        super(texture, 0, 0, texture.getWidth(), texture.getHeight());
        baseTexture = texture;
        activeTexture = texture;
        setSize(sizeX, sizeY);
        this.setX(x);
        this.setY(y);
        this.command = command;
    }

    public void update(float delta){

    }

    public void updateTouch(Vector3 touchPoint){

    }

    public String getCommand(){
        return command;
    }
}
