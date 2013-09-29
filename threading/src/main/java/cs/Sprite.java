package cs;

import java.awt.Color;

public class Sprite {
	/** 画面の一辺の長さ */
	public static final int SIZE = 600;

	/** 図形の形：丸 */
	public static final int ROUND = 0;
	/** 図形の形：四角形 */
	public static final int DIAMOND = 1;

	/** 図形の最大個数 */
	public static final int MAX_FIGURES = 10;

	/** 発行された図形の個数 */
	public int figureCount;

	/** X座標 */
	public double[] xs;
	/** Y座標 */
	public double[] ys;
	/** Z座標 */
	public double[] zs;
	/** 大きさ */
	public double[] rs;
	/** 図形の形 */
	public int[] shapes;
	/** 図形の色 */
	public Color[] colors;

	public Sprite() {
		this.figureCount = 0;
		this.xs = new double[MAX_FIGURES];
		this.ys = new double[MAX_FIGURES];
		this.zs = new double[MAX_FIGURES];
		this.rs = new double[MAX_FIGURES];
		this.shapes = new int[MAX_FIGURES];
		this.colors = new Color[MAX_FIGURES];
	}

	public int getFigureCount() {
		return figureCount;
	}

	public void setFigureCount(int figureCount) {
		this.figureCount = figureCount;
	}

	public double[] getXs() {
		return xs;
	}

	public void setXs(double[] xs) {
		this.xs = xs;
	}

	public double[] getYs() {
		return ys;
	}

	public void setYs(double[] ys) {
		this.ys = ys;
	}

	public double[] getZs() {
		return zs;
	}

	public void setZs(double[] zs) {
		this.zs = zs;
	}

	public double[] getRs() {
		return rs;
	}

	public void setRs(double[] rs) {
		this.rs = rs;
	}

	public int[] getShapes() {
		return shapes;
	}

	public void setShapes(int[] shapes) {
		this.shapes = shapes;
	}

	public Color[] getColors() {
		return colors;
	}

	public void setColors(Color[] colors) {
		this.colors = colors;
	}

	public static int getSize() {
		return SIZE;
	}
}