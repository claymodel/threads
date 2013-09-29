package cs;

import java.awt.Color;

public class RoundEntity extends Entity {
	private static Entity view;

	public RoundEntity(Application app) {
		super();
	}

	public static int createEntity() {
		return view.create(100, 100, 0, 20, Entity.ROUND, Color.YELLOW);

	}

}