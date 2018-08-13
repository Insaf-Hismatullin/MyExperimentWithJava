import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

	public MyFrame() {

		super("График по точкам");
		JPanel jcp = new JPanel(new BorderLayout());
		setContentPane(jcp);
		jcp.add(new DrawingComponent(), BorderLayout.CENTER);
		//jcp.setBackground(Color.GRAY);
		setSize(500, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		
	}

	public static void main(String[] args){
		new MyFrame().setVisible(true);
	}
}