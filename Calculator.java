import javax.swing.*;
import java.awt.*;

public class Calculator {

//���������� ���� ����������� ������������.
	JPanel windowContent;
	JTextField displayField;
	JButton buttons[] = new JButton[10];

	JButton buttonPoint, buttonEqual; 
	
	JButton buttontPlus, buttonMinus, buttonMult, buttonDiv; 
	
	JPanel p1, p2;


//� ������������ ��������� ��� ���������� � ����������� �� ����� � ������� ����������
//BorderLayout and GridLayout	
	Calculator(){

		windowContent = new JPanel();
		CalculatorEngine calcEngine = new CalculatorEngine(this);
	//������ ����� ��� ���� ������	
		BorderLayout b1 = new BorderLayout();
		windowContent.setLayout(b1);
	
	//������ � ���������� ���� � ��������� ��� � �������� ������� ����
		displayField = new JTextField(30);
		displayField.setText("");
		windowContent.add("North", displayField);

	//������ ������, ��������� ����������� ������ JButton, ������� ���������
	//����� ������ � �������� ���������
		for(int i=0; i<10; i++){

			buttons[i]= new JButton(i+"");

		}


		buttonPoint = new JButton("."); 
		buttonPoint.addActionListener(calcEngine);

		buttonEqual = new JButton("="); 
		buttonEqual.addActionListener(calcEngine);

		buttontPlus = new JButton("+");
		buttontPlus.addActionListener(calcEngine);

		buttonMinus = new JButton("-");
		buttonMinus.addActionListener(calcEngine);

		buttonMult = new JButton("*");
		buttonMult.addActionListener(calcEngine);

		buttonDiv = new JButton("/");
		buttonDiv.addActionListener(calcEngine);
		

	//������ ������ � GridLayout ������� �������� 12 ������ - 10 ������ � 
	// ������� � ������ � ������ � ������ �����

		p1 = new JPanel();
		GridLayout gl = new GridLayout(4, 3);
		p1.setLayout(gl);

	//��������� ������ �� ������ p1
		for(int i=9; i>-1; i--){
	
			p1.add(buttons[i]);
			buttons[i].addActionListener(calcEngine);

		}

		p1.add(buttonPoint);
		p1.add(buttonEqual);

	//������ ������ � GridLayout ������� �������� 4 ������ - �������� ��� �������
	// and ��������� ������ �� ������ p2
		p2 = new JPanel();
		GridLayout g2 = new GridLayout(4, 1);
		p2.setLayout(g2);
		p2.add(buttontPlus);
		p2.add(buttonMinus);
		p2.add(buttonMult);
		p2.add(buttonDiv);
		p2.setPreferredSize(new Dimension(50, 300));


	//�������� ������ �1 � ����������� ������� ����
		windowContent.add("Center", p1);
	
	//�������� ������ �2 � ��������� ������� ����
		windowContent.add("East", p2);	
		

	//������� ����� � ����� ��� �������� ������
		JFrame frame = new JFrame("CALCULATOR");
		frame.setContentPane(windowContent);
		frame.setDefaultCloseOperation(3);

	//������ ������ ���� ����������� ��� ���� ����� �������� ��� ����������
		frame.pack();
		frame.setSize(300, 300);
	
	//�������, ���������� ����  �� ������
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	
	

	}
	
	public static void main (String[] args){

		Calculator calc = new Calculator();

	}

}