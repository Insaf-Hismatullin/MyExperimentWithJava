import javax.swing.*;
import java.awt.GridLayout;

public class SimpleCalculatorGrid {

	public static void main(String[] args){

	//		
		JPanel windowContent = new JPanel();

	//
		GridLayout g1 = new GridLayout(4,2);
		windowContent.setLayout(g1);

	//
		JLabel label1 = new JLabel("Number 1:");
		JTextField field1 = new JTextField(10);
		JLabel label2 = new JLabel("Number 2:");
		JTextField field2 = new JTextField(10);
		JLabel label3 = new JLabel("Number 1:");
		JTextField result = new JTextField(10);
		JButton go = new JButton("ADD");

	//
		windowContent.add(label1);
		windowContent.add(field1);
		windowContent.add(label2);
		windowContent.add(field2);
		windowContent.add(label3);
		windowContent.add(result);
		windowContent.add(go);

	//
		JFrame frame = new JFrame("MY CALCULATOR");
		frame.setContentPane(windowContent);
		frame.setDefaultCloseOperation(3);	

	//
		frame.setSize(400, 100);
		frame.setVisible(true);

	}

}