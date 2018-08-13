import java.awt.*;
import java.util.*;
import javax.swing.*;

public class GraphPanel extends JPanel{

	private Vector<Double> data;

	public GraphPanel(Vector<Double> data){
		this.data = data;
	}

	public void paintComponent(Graphics g){

		super.paintComponent(g);
		
		//максимальная ширина графика - 2*Р!
		//максимальная высота = 1, минимальная = -1
		//вычисляем коэффициенты

		double Kx = getWidth()/(2*Math.PI);
		double Ky = getHeight()/2.0;

		double x0 = -1;
		double y0 = -1;

		double x = 0;
		for(Iterator<Double> it = data.iterator(); it.hasNext();){

			double y = it.next().doubleValue();

			//Рисование начинаем для второй точки
			if(x0>=0.0){

				int x1 = (int) (x0*Kx);				
				int x2 = (int) (x*Kx);

				//Учитываем, что координаты идут сверху вниз и максимальное число = 1
				int y1 = (int)(getHeight() - (y0+1)*Ky);				
				int y2 = (int)(getHeight() - (y+1)*Ky);
				g.drawLine(x1, y1, x2, y2);		
	
			}

			x0 = x;
			y0 = y;
			x += 0.1;
		}

	}

}