import java.awt.*;
import javax.swing.*;

class MyDrawPanel extends JPanel{

	public void paintComponent (Graphics g){
	
	/*оранжевый прямогольник  начало левый верхний с координатами 20 и 50 длина 100на100(квадрат)

		g.setColor(Color.orange);
			
		g.fillRect(20,50, 100, 100);
		
	*/	

	/*черный фон  и белый круг  с началом 70 на 70  в координатном плоскости 

		g.fillRect(0,0, this.getWidth(), this.getHeight());
	
		g.setColor(Color.white);
		g.fillOval(70, 70, 100, 100);

	*/

	int red = (int) (Math.random() * 255);
	int green = (int) (Math.random() * 255);
	int blue = (int) (Math.random() * 255);
	Color startColor = new Color(red, green, blue);

	red = (int) (Math.random() * 255);
	green = (int) (Math.random() * 255);
	blue = (int) (Math.random() * 255);
	Color endColor = new Color(red, green, blue);


	Graphics2D g2d = (Graphics2D) g;
		
	GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor );

	g2d.setPaint(gradient);	
	g2d.fillOval(70,70, 100,100);

	}

}