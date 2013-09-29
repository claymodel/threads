package cs;

import java.awt.Color;

public class DiamondEntity extends Entity {
	private static Entity view;

	public DiamondEntity() {
		super();
	}

	public static int createEntity() {
		return view.create(-100, -150, 0, 20, Entity.DIAMOND, Color.BLUE);
	}
}