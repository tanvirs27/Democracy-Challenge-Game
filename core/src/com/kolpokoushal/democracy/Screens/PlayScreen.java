package com.kolpokoushal.democracy.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.kolpokoushal.democracy.MyGdxGame;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;


/**
 * Created by Rifat on 23-Jul-16.
 */
public class PlayScreen implements Screen {

    private MyGdxGame game;
    private OrthographicCamera gamecam;
    private FitViewport gamePort;

    Texture img1;
    Sprite scene1;
    TextureAtlas walkAtlas;
    Animation walkAnimation;
    float timePassed =0;
    float x;

    public  PlayScreen (MyGdxGame game){
        this.game = game;
        gamecam = new OrthographicCamera();
        gamePort = new FitViewport(Gdx.graphics.getWidth(),Gdx.graphics.getHeight(),gamecam);

        gamecam.position.set(gamePort.getScreenWidth()/2,gamePort.getScreenHeight()/2,0);
        img1 = new Texture("background1.jpg");
		scene1= new Sprite(img1);
        scene1.setPosition(-scene1.getWidth()/2,-scene1.getHeight()/2);

		x=-scene1.getWidth()/2;
		walkAtlas = new TextureAtlas(Gdx.files.internal("walk.atlas"));
		walkAnimation = new Animation(1/10f,walkAtlas.getRegions());
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        game.batch.setProjectionMatrix(gamecam.combined);
		game.batch.begin();
		scene1.draw(game.batch);
        //game.batch.draw(img1,0,0);

		timePassed+= Gdx.graphics.getDeltaTime();
		game.batch.draw(walkAnimation.getKeyFrame(timePassed,true),x,-scene1.getHeight()/2);
		x+=10;
		game.batch.end();

    }

    @Override
    public void resize(int width, int height) {
        gamePort.update(width,height);
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
