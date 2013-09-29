package ks;

import java.awt.Color;
import java.awt.Graphics;

public class Objects {

	public static final int SIZE = 600;
	public static final int ROUND = 0;
	public static final int DIAMOND = 1;
	public static final int MAX_FIGURES = 10;

	public int figureCount;

	public double[] xs;
	public double[] ys;
	public double[] zs;

	public double[] rs;
	public int[] shapes;
	public Color[] colors;

	public Objects() {
		this.figureCount = 0;
		this.xs = new double[MAX_FIGURES];
		this.ys = new double[MAX_FIGURES];
		this.zs = new double[MAX_FIGURES];
		this.rs = new double[MAX_FIGURES];
		this.shapes = new int[MAX_FIGURES];
		this.colors = new Color[MAX_FIGURES];
	}

	public void draw(Graphics g) {
		int[] order = new int[figureCount];
		for (int i = 0; i < figureCount; ++i) {
			order[i] = i;
		}

		for (int i = 0; i < figureCount; ++i) {
			for (int j = i + 1; j < figureCount; ++j) {
				if (zs[order[i]] < zs[order[j]]) {
					int temp = order[i];
					order[i] = order[j];
					order[j] = temp;
				}
			}
		}

		for (int i = 0; i < figureCount; ++i) {
			int id = order[i];

			final double CENTER = SIZE / 2.0;
			double d = CENTER / (zs[id] + CENTER);
			double r = rs[id] * d;
			double x = xs[id] * d - r + CENTER;
			double y = ys[id] * d - r + CENTER;

			g.setColor(colors[id]);

			if (shapes[id] == ROUND) {
				g.fillOval((int) x, (int) y, (int) r * 2, (int) r * 2);
			} else if (shapes[id] == DIAMOND) {
				g.fillRect((int) x, (int) y, (int) r * 2, (int) r * 2);
			}
		}
	}

	public int create(double x, double y, double z, double radius, int shape,
			Color color) {
		int id = figureCount;
		++figureCount;

		xs[id] = x;
		ys[id] = y;
		zs[id] = z;
		rs[id] = radius;
		shapes[id] = shape;
		colors[id] = color;

		return id;
	}

	public void move(int id, double x, double y, double z) {
		xs[id] = x;
		ys[id] = y;
		zs[id] = z;
	}
}
