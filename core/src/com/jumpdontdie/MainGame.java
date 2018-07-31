package com.jumpdontdie;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MainGame extends ApplicationAdapter {

    private Texture square, pinchos;

    private TextureRegion pinchosRegion;

    private int width, height;
    private float squareWidth, squareHeight;

    private SpriteBatch batch;

    @Override
    public void create(){
        square = new Texture("square.png");
        pinchos = new Texture("pinchos.png");
        batch = new SpriteBatch();

        pinchosRegion = new TextureRegion(pinchos, 6, 16, 116, 106);

        width = Gdx.graphics.getWidth();
        height = Gdx.graphics.getHeight();

        squareWidth = square.getWidth();
        squareHeight = square.getHeight();
    }

    @Override
    public void dispose() {
        square.dispose();
        batch.dispose();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0.3f, 0.3f, 0.3f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(square, 0, 0);
        batch.end();
    }
}
