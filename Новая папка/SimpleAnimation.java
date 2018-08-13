import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {

	int x = 10;	
	int y = 10;

	public static void main (String[] args){

		SimpleAnimation gui = new SimpleAnimation();
		gui.go();

	}

	public void go() {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(3);

		MyDrawPanel drawPanel = new MyDrawPanel();

		frame.getContentPane().add(drawPanel);
		frame.setSize(300, 300);
		frame.setVisible(true);

		for(int i = 0; i < 200; i++){
	
			x++; y++;

			drawPanel.repaint();

			
			try{
				Thread.sleep(50);
			}catch(Exception ex){}
			
			
		}

	}// end metod go;


	class MyDrawPanel extends JPanel {

		public void paintComponent(Graphics g){
			int red = (int)(Math.random()*255);
			int blue = (int)(Math.random()*255);
			int green = (int)(Math.random()*255);
				
			g.setColor(Color.white);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());

			g.setColor(new Color(red, blue, green));
			g.fillOval(x, y, 40, 40);
		}
		
	}
}