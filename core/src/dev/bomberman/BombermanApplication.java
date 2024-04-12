package dev.bomberman;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;

public class BombermanApplication extends ApplicationAdapter {
  SpriteBatch batch;
  private FitViewport viewport;
  private Camera camera;
  private Texture player;
  private Texture block;
  private Texture bomb;

  @Override
  public void create() {
    batch = new SpriteBatch();
    camera = new PerspectiveCamera();
    viewport = new FitViewport(800, 640, camera);
  }

  @Override
  public void render() {
    ScreenUtils.clear(0, 0, 0, 0);
    batch.begin();
    batch.end();
  }

  @Override
  public void dispose() {
    batch.dispose();
  }
  @Override
  public void resize(int width,  int heigth) {
	 viewport.update(width, heigth);
  }
}
