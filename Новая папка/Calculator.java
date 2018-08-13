import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {

	public static void main(String[] args){

		//������� ���� � ������ ��� ������������:
		JFrame frame = new JFrame("��� �����������");
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();		
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		
		//�������� ����� 		
		JLabel l1 = new JLabel("����� �1"); 
		JLabel l2 = new JLabel("����� �2"); 
		JLabel l3 = new JLabel("���������"); 

		//���� �����
		JTextField t1 = new JTextField(5);
		JTextField t2 = new JTextField(5);
		JTextField t3 = new JTextField(5);
		

		//������ ��� ������������
		JButton button1 = new JButton("C�������");
		JButton button2 = new JButton("���������");
		JButton button3 = new JButton("���������");
		JButton button4 = new JButton("�������");
	
		//��������� ������������ ��� ������:
		BoxLayout b1 = new BoxLayout(p1, BoxLayout.Y_AXIS);
		BoxLayout b2 = new BoxLayout(p2, BoxLayout.Y_AXIS);
		BoxLayout b3 = new BoxLayout(p3, BoxLayout.Y_AXIS);
		FlowLayout f1 = new FlowLayout();
		
		//������������� ��������� ��� ������:
		p1.setLayout(b1);
		p2.setLayout(b2);
		p3.setLayout(b3);
		p4.setLayout(f1);

		p1.add(l1);
		p1.add(t1);
		p2.add(button1);
		p2.add(button2);
		p2.add(button3);
		p2.add(button4);
		p3.add(l2);
		p3.add(t2);
		p4.add(l3);
		p4.add(t3);


		frame.getContentPane().add(p1, BorderLayout.EAST);
		frame.getContentPane().add(p2, BorderLayout.CENTER);
		frame.getContentPane().add(p3, BorderLayout.WEST);
		frame.getContentPane().add(p4, BorderLayout.SOUTH);

		frame.pack();
		frame.setDefaultCloseOperation(3);
		frame.setMinimumSize(new Dimension(200,200));
		frame.setVisible(true);


	}

}