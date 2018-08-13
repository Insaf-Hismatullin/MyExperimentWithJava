import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class F extends JFrame implements ActionListener{
	
	int x = 70;
	int y = 70;
	MyDrawPanel drawPanel = new MyDrawPanel();
	F(){
		JButton b  = new JButton("Change color");
		
		//setContentPane(new P());
		getContentPane().add(b, BorderLayout.NORTH);
		b.addActionListener(this);
		setSize(400, 400);
		setDefaultCloseOperation(3);
		setVisible(true);
		go();
	}
	
	public void go(){

		for (int i = 0; i < 130; i++){

			x++; y++;
			drawPanel.repaint();
			
			try{
				Thread.sleep(50);
			} catch(Exception ex){}

		}	

	}	

	public static void main(String [] args){
		
		new F();

	}

	public void actionPerformed(ActionEvent ae){
		repaint();
	}

	class MyDrawPanel extends JPanel{

		public void paintComponenet(Graphics g){

			int red = (int) (Math.random()*255);
			int green = (int) (Math.random()*255);
			int blue = (int) (Math.random()*255);
			Color startColor = new Color(red, green, blue);

			red = (int) (Math.random()*255);
			green = (int) (Math.random()*255);
			blue = (int) (Math.random()*255);
			Color endColor = new Color(red, green, blue);

			GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
			Graphics2D g2d = (Graphics2D) g;
			g2d.setPaint(gradient);
			g2d.fillOval(x, y, 40, 40);
		}

	}
	
}