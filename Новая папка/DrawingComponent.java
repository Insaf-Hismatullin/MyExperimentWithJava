import javax.swing.*;
import java.awt.*;

class DrawingComponent extends JPanel {

	int x[] = {50, 100, 150, 200, 250};
	int y[] = {80, 200, 150, 320, 100};
	int n = 5;

	//@Override
	public void painComponent(Graphics gh){

		Graphics2D d = 	(Graphics2D) gh;
		d.drawLine(20, 340, 20, 20);
		d.drawLine(20, 340, 460, 340);
		d.drawPolyline(x, y, n);

	}


}