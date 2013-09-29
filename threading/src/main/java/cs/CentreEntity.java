package cs;

import java.awt.Color;

import cs2.PictureView;

public class CentreEntity extends Entity {
	private static Entity view;

	public CentreEntity() {
		super();
	}

	public static int createEntity() {
		return view.create(30, 0, 400, 40, PictureView.DIAMOND, Color.RED);
	}
}