package cs;

import java.net.URL;
import java.util.HashMap;

public class SpriteStore {
	private static SpriteStore single = new SpriteStore();
	
	public static SpriteStore get() {
		return single;
	}
	
	@SuppressWarnings("rawtypes")
	private HashMap sprites = new HashMap();
	
	@SuppressWarnings("unchecked")
	public Sprite getSprite(String ref) {
		if (sprites.get(ref) != null) {
			return (Sprite) sprites.get(ref);
		}
		
		URL url = this.getClass().getClassLoader().getResource(ref);
		
		if (url == null) {
			fail("Can't find ref: "+ref);
		}
		
		Sprite sprite = new Sprite();
		sprites.put(ref,sprite);
		
		return sprite;
	}
	
	private void fail(String message) {
		System.err.println(message);
		System.exit(0);
	}
}
