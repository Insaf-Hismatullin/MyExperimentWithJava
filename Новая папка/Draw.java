import javax.swing.*;
import java.awt.*;

public class Draw extends JFrame {

	private int[] x;
	private double[] y;
	private int[] yTrue;
	private Dimension size = new Dimension(500, 300); //рабочая область
	private Dimension startPointXoY = new Dimension(40, 250); //начало координат
	private int scale = 30; //масштаб

	public Draw(int[]x, double[] y){

		this.x = x;
		this.y = y;
		yTrue = new int[x.length];
		reBuildArrays();
		initInterface();

	}

	public void paint(Graphics g){

		g.setColor(Color.BLACK);
		g.fillRect(0, 0, size.width, size.height);
		g.setColor(Color.WHITE);

		for ( int i = 1; i <= x.length; i++){

			g.drawString(String.valueOf(i), startPointXoY.width + (startPointXoY.width-10)*1, startPointXoY.height +(startPointXoY.width - 25)); 
			g.drawString(String.valueOf(i), 25, startPointXoY.height -(startPointXoY.width - 10)*i); 

		}

		g.drawLine(startPointXoY.width, startPointXoY.width, startPointXoY.width, startPointXoY.height); 
		g.drawLine(startPointXoY.width, startPointXoY.height, 400, startPointXoY.height); 
		
		g.drawPolyline(x, yTrue, x.length);

	}	
		
	private void initInterface(){
		
		setDefaultCloseOperation(3);
		setSize(size);
		setTitle("График функции");
		setVisible(true);

	}

	private void reBuildArrays(){
		
		for(int i = 0; i < x.length; i++){
			x[i] *= scale;
			x[i] += startPointXoY.width;
			y[i] *= scale;
			yTrue[i] = startPointXoY.height - ((int)y[i]);
		}

	}

}