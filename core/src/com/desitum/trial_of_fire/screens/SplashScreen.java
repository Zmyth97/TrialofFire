package com.desitum.trial_of_fire.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.desitum.trial_of_fire.TrialofFire;
import com.desitum.trial_of_fire.data.Assets;
import com.desitum.trial_of_fire.data.Settings;

/**
 * Created by Zmyth97 on 3/10/2015.
 */
public class SplashScreen implements Screen {

    private OrthographicCamera cam;
    private SpriteBatch batch;
    private TrialofFire game;

    private Sprite desitum;

    private boolean beenThrough = false;
    private boolean hasLoaded = false;
    private float timeElapsed = 0;

    public SplashScreen(TrialofFire game){

        cam = new OrthographicCamera(MenuScreen.SCREEN_WIDTH, MenuScreen.SCREEN_HEIGHT);
        cam.position.set(MenuScreen.SCREEN_WIDTH/2, MenuScreen.SCREEN_HEIGHT/2, 0);
        batch = new SpriteBatch();

        this.game = game;

        Texture desitumTexture = new Texture(Gdx.files.internal("menu/desitum.png"));
        desitum = new Sprite(desitumTexture);
        desitum.setSize(10, 15);
        desitum.setX(0);
        desitum.setY(MenuScreen.SCREEN_HEIGHT/2 - desitum.getHeight()/2);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        if (timeElapsed > 3){
            game.setScreen(new MenuScreen());
        } else if (beenThrough && !hasLoaded){
            hasLoaded = true;
            Assets.loadMenuTextures();
            Assets.loadGameTextures();
            Assets.loadBackgroundTextures();
            Assets.loadMapTextures();
            Assets.loadCharacterTextures();
            Assets.loadSounds();
            Settings.load();
        }
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Gdx.gl.glClearColor(0,0,0, 1);

        cam.update();

        batch.setProjectionMatrix(cam.combined);
        batch.begin();
        desitum.draw(batch);
        batch.end();
        timeElapsed += delta;
        beenThrough = true;
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
