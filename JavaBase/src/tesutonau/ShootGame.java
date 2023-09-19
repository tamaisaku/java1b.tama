package tesutonau;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class ShootGame  {
	public Gum gun = new Gum();

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		//g2.clearRect(0, 0, getWidth(), getHeight());
		gun.draw(g2);
	}

	public void update(Graphics g) {
		paint(g);
	}
}
