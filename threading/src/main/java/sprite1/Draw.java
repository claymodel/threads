package sprite1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

class Draw extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6446412317534882211L;

	public void paintComponent(Graphics c) {
		Graphics2D c2D = (Graphics2D) c;
		c2D.setColor(Color.blue);
		Rectangle2D.Float bG = new Rectangle2D.Float(0F, 0F,
				(float) getSize().width, (float) getSize().height);
		c2D.fill(bG);

		GradientPaint fG = new GradientPaint(0F, 0F, Color.green, 1230F, 700F,
				Color.green.darker());

		c2D.setPaint(fG);
		GeneralPath o = new GeneralPath();

		o.moveTo(80F, 50F);
		o.lineTo(200F, 120F);
		o.lineTo(230F, 300F);
		// continues for a while...

		o.closePath();
		c2D.fill(o);

		c2D.setColor(Color.black);
		BasicStroke bPen = new BasicStroke();
		c2D.setStroke(bPen);
		Ellipse2D.Float ball = new Ellipse2D.Float(600, 350, 50, 50);

		c2D.fill(ball);
	}
}