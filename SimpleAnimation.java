import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
	
	int x = 70; int  y = 70; //координаты х и у круга 

	public static void main (String[] args){

		SimpleAnimation gui = new SimpleAnimation();
		gui.go();

	}

	public void go(){

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyDrawPanel1 panel = new MyDrawPanel1();
		
		frame.setContentPane(panel);
		frame.setLocationRelativeTo(null);
		frame.setSize(400, 400);
		frame.setVisible(true);
	
	
		for(int i = 0; i < 130; i++){
		
			x++; y++;
			frame.repaint();
			try{Thread.sleep(50);} catch(Exception ex) {}
		}

	}

	class MyDrawPanel1 extends JPanel {
		
		public void paintComponent (Graphics g) {
			//g.setColor(Color.white);
			//g.fillRect(0,0, this.getWidth(), this.getHeight());

			int red = (int) (Math.random() * 255);
			int green = (int) (Math.random() * 255);
			int blue = (int) (Math.random() * 255);
			Color startColor = new Color(red, green, blue);

			red = (int) (Math.random() * 255);
			green = (int) (Math.random() * 255);
			blue = (int) (Math.random() * 255);
			Color endColor = new Color(red, green, blue);


			Graphics2D g2d = (Graphics2D) g;
		
			GradientPaint gradient = new GradientPaint(70, 70, startColor, 130, 130, endColor );

			
		
			g2d.setPaint(gradient);	
			g2d.fillOval(x, y, 100,100);
		
		}
	}
}