import javax.swing.*;
import java.awt.FlowLayout;

public class MyFrame extends JFrame {

	
	MyFrame(String S){
		super(S);
		JButton b = new JButton("click me!");

			
		super.add(b);
		super.setSize(300, 300);
		super.setDefaultCloseOperation(3);
		super.setLayout(new FlowLayout());
		super.setVisible(true);
		

	}
	
	public static void main(String[] args){

		new MyFrame("MY FRAME!");

	}	
}