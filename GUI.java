import javax.swing.*;
import java.awt.FlowLayout;

public class GUI{

	public static void main (String[] args){
	
	/* ��� �������
		JFrame frame = new JFrame("��� ����");	
		JButton b = new JButton("CLICK ME!");
		
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(3);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());	
		

		frame.add(b);
		
		b.setSize(150, 30);

	*/
	// � ������

		JFrame frame = new JFrame("��� ����");	
		JPanel p = new JPanel();
		JButton b = new JButton("CLICK ME!");
		
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(3);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());	
		

		frame.add(p);
		p.add(b);
		b.setSize(180, 50);

			
	}

}