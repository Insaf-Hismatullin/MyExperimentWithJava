import javax.swing.*;
import java.awt.*;

public class P extends JPanel{

	public void paint(Graphics g){
		//g.drawLine(10, 10, 360, 140); начертит пр€мую линию «десь 10, 10 - это координаты х, у начала линии,   а 360, 140 координаты конца линии
		
		Color oldC = g.getColor();
		Color newC = new Color(0, 255, 0);
		//g.setColor(newC);
		//g.drawRect(20, 40, 340, 20); пр€моугольник без заливка «десь: 20, 40 это координаты верхнего левого угла пр€моугольника 340 - длина  20 - высота пр€моугольника
		//g.fillRect(20, 40, 340, 20); пр€моугольник c заливка
		//g.drawOval(120,  40, 150, 60);oval без заливка «десь: аргументы определ€ют пр€моугольгик, в который вписан овал
		//g.fillOval(120,  40, 150, 60); oval c заливка 
		//g.drawOval(120, 40, 100, 100);


		/*
		int[] arrayX = {20, 100, 100, 250, 250, 20, 50,  20, 50};  это х-координаты вершин многоугольника,
		int[] arrayY = {180, 180, 200, 200, 220, 220, 210, 200, 190}; это у-координаты вершин многоугольника 
		Polygon poly = new Polygon(arrayX, arrayY, 9); здесь создаЄм объект класс Polygon
		//g.drawPolygon(poly);
		g.fillPolygon(poly);
		*/
	
		/*
		g.drawLine(20, 220, 20, 350);
		g.drawLine(20, 350, 360, 350);
		g.drawString("Y", 25, 230 );
		g.drawString("X", 350, 346);

		int[] xArray = {20, 40, 60, 80, 100, 120, 130, 140, 280, 332};
		int[] yArray = {350, 345, 340, 310, 290, 280, 275, 273, 271, 269};
		
		int nPoint = 10;

		g.drawPolyline(xArray, yArray, nPoint);
		*/

		/*
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
	
		int red = (int) (Math.random()*255);
		int green = (int) (Math.random()*255);
		int blue = (int) (Math.random()*255);

		Color randomColor = new Color(red, green, blue);
		g.setColor(randomColor);
		g.fillOval(70, 70, 100, 100);
		*/
		
		Graphics2D g2d = (Graphics2D) g;

		int red = (int) (Math.random()*255);
		int green = (int) (Math.random()*255);
		int blue = (int) (Math.random()*255);
		Color startColor = new Color(red, green, blue);

		red = (int) (Math.random()*255);
		green = (int) (Math.random()*255);
		blue = (int) (Math.random()*255);
		Color endColor = new Color(red, green, blue);

		GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
		g2d.setPaint(gradient);
		g2d.fillOval(70, 70, 100, 100);
		
	}

}