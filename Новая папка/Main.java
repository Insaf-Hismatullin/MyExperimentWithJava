import java.awt.*;
import java.util.Arrays;
import javax.swing.*;

public class Main {

	public static void main(String [] args){

		int[] x = new int[50];	

		double[] y = new double[50];

		for(int i = 0; i < x.length; i++){	
			
			x[i] = i+1;
			//y[i] = 1.0/2.0*Math.sin(x[i])+5;
			//y[i] = Math.sin(x[i]);
			System.out.print("x = " + x[i]);
			System.out.printf("%s %.3f %s", " y = ", +y[i], "\n");

		}

		System.out.println(Arrays.toString(y));
		new Draw(x, y);
		

	}

}