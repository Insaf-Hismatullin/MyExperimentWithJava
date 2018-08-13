import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {

	public static void main(String[] args){

		//Создаем окно и панели для калькуляторы:
		JFrame frame = new JFrame("Мой Калькулятор");
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();		
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		
		//тектовый метки 		
		JLabel l1 = new JLabel("Число №1"); 
		JLabel l2 = new JLabel("Число №2"); 
		JLabel l3 = new JLabel("Результат"); 

		//поля ввода
		JTextField t1 = new JTextField(5);
		JTextField t2 = new JTextField(5);
		JTextField t3 = new JTextField(5);
		

		//кнопки для калькулятора
		JButton button1 = new JButton("Cложения");
		JButton button2 = new JButton("Вычитание");
		JButton button3 = new JButton("Умножение");
		JButton button4 = new JButton("Деление");
	
		//менеджеры расположение для панели:
		BoxLayout b1 = new BoxLayout(p1, BoxLayout.Y_AXIS);
		BoxLayout b2 = new BoxLayout(p2, BoxLayout.Y_AXIS);
		BoxLayout b3 = new BoxLayout(p3, BoxLayout.Y_AXIS);
		FlowLayout f1 = new FlowLayout();
		
		//установливаем менеджеры для панели:
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