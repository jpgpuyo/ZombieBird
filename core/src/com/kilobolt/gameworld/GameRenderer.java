package com.kilobolt.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class GameRenderer {

    private GameWorld myWorld;
    private OrthographicCamera cam;

    public GameRenderer(GameWorld world) {
        myWorld = world;
        cam = new OrthographicCamera();
        cam.setToOrtho(true, 136, 204);
    }

    public void render() {
        Gdx.app.log("GameRenderer", "render");
    }
}
