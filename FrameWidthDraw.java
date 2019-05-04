import javax.swing.*;

public class FrameWidthDraw {


	public static void main(String[] args){

		JFrame frame = new JFrame("DRAW!");
		
		MyDrawPanel panel = new MyDrawPanel();

		frame.setContentPane(panel);
		
		frame.setDefaultCloseOperation(3);
		frame.setLocationRelativeTo(null);
		frame.setSize(300, 300);
		frame.setVisible(true);


	}

}