import java.awt.*;
import java.util.*;
import javax.swing.*;

public class TG extends JFrame {

	private GraphPanel g;

	public TG(){
	
		Vector<Double> d = new Vector<Double>();

		//Заполняем вектор данными - например для функции

		double t = -2*Math.PI;			

		while(t<2*Math.PI){
	
			double s = Math.sin(t);					
			d.add(new Double(s));
			t+=0.1;
		}

		g = new GraphPanel(d);
		getContentPane().add(g);
		setBounds(100, 100, 300, 300);	

	}

	public static void main(String args[]){
		TG t = new TG();
		t.setDefaultCloseOperation(3);
		t.setVisible(true);
	}		

}