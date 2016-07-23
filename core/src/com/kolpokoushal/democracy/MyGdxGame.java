package com.kolpokoushal.democracy;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.kolpokoushal.democracy.Screens.PlayScreen;


public class MyGdxGame extends Game {
	public SpriteBatch batch;
	Texture img1;
	Sprite scene1;
	TextureAtlas walkAtlas;
	Animation walkAnimation;
	float timePassed =0;
	int x;

	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new PlayScreen(this));

//		img1 = new Texture("background1.jpg");
//		scene1= new Sprite(img1);
//		x=300;
//		walkAtlas = new TextureAtlas(Gdx.files.internal("walk.atlas"));
//		walkAnimation = new Animation(1/10f,walkAtlas.getRegions());

	}

	@Override
	public void render () {
		super.render();


//		Gdx.gl.glClearColor(1, 1, 1, 1);
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//		batch.begin();
//		scene1.draw(batch);
//
//		timePassed+= Gdx.graphics.getDeltaTime();
//		batch.draw(walkAnimation.getKeyFrame(timePassed,true),x,150);
//		x+=10;
//		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img1.dispose();
	}
}
