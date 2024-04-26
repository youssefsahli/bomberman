package dev.bomberman;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;

import dev.bomberman.world.World;

public class BombermanApplication extends ApplicationAdapter {
  private FitViewport viewport;
  private Camera camera;
  private World ecs = new World();
  private AssetManager manager = new AssetManager();

  @Override
  public void create() {
    camera = new PerspectiveCamera();
    viewport = new FitViewport(800, 640, camera);
  }

  @Override
  public void render() {
    ScreenUtils.clear(0, 0, 0, 0);
  }

  @Override
  public void dispose() {
    ecs.removeAllEntities();
    ecs.removeAllSystems();
    manager.dispose();
  }
  @Override
  public void resize(int width,  int heigth) {
	 viewport.update(width, heigth);
  }
}
