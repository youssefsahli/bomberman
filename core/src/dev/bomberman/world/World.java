/**
 * Basic World representation
 */
package dev.bomberman.world;

import com.badlogic.ashley.core.Engine;
import com.badlogic.gdx.math.Vector2;

/**
 * Main ECS Game Loop
 * Implements the game grid
 */
public class World extends Engine {
	public static final Vector2 size = new Vector2(8,8);
	
	public World() {
		
	}
}
