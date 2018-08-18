import javax.swing.*;
import java.awt.FlowLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.metal.MetalLookAndFeel;
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

		JFrame.setDefaultLookAndFeelDecorated(true);

		JFrame frame = new JFrame("��� ����");	
		JPanel p = new JPanel();
		JButton b = new JButton("CLICK ME!");
		
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(3);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());	
		frame.setLocationRelativeTo(null); // ��������� ���� (������������� �������������� � ������ ���������� ����� ����)
		frame.getContentPane().add(p);
		p.setBorder(BorderFactory.createLoweredBevelBorder());
		p.add(b);
		b.setSize(180, 50);

		


		try {
                	UIManager.setLookAndFeel(new MetalLookAndFeel());
           	} catch (UnsupportedLookAndFeelException ex) {
               	 	Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            	}

		

			
	}

}