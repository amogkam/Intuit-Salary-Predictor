package com.mygdx.main;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.main.graphics.Fonts;
import com.mygdx.main.page_stuff.PageManager;

public class Main extends ApplicationAdapter {
	
	SpriteBatch sb;
	PageManager pm;
	Fonts f;
	
	public static final int WIDTH = 400, HEIGHT = 500;
	public static final String TITLE = "Intuit - User Input Window";
	
	@Override
	public void create () {
		sb = new SpriteBatch();
		pm = new PageManager();
		f = new Fonts();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		pm.update();
		
		sb.begin();
		pm.draw(sb);
		sb.end();
	}
	
	@Override
	public void dispose () {
		sb.dispose();
	}
}