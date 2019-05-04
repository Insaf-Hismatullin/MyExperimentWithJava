import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyFrame extends JFrame{

	KeyFrame(){
		super("Коды клавиш");
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setFocusable(true);

		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();

		label1.setFont(new Font("Calibri", Font.PLAIN, 20));
		label1.setHorizontalAlignment(JLabel.CENTER);
	
		label2.setFont(new Font("Calibri", Font.PLAIN, 20));
		label2.setHorizontalAlignment(JLabel.CENTER);

		panel.add(label1, BorderLayout.NORTH);
		panel.add(label2, BorderLayout.SOUTH);

		panel.addKeyListener(new KeyAdapter(){
		
			public void keyReleased(KeyEvent e){

				label1.setText(e.getKeyText(e.getKeyCode()));
				label2.setText(e.getKeyCode()+" ");

		
			}

		});
		
		setContentPane(panel);

		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setVisible(true);

	}



	public static void main(String[] args){


		new KeyFrame();
		
	}

}