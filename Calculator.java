import javax.swing.*;
import java.awt.*;

public class Calculator {

//Объявление всех компонентов калькулятора.
	JPanel windowContent;
	JTextField displayField;
	JButton buttons[] = new JButton[10];

	JButton buttonPoint, buttonEqual; 
	
	JButton buttontPlus, buttonMinus, buttonMult, buttonDiv; 
	
	JPanel p1, p2;


//В конструкторе создаются все компоненты и добавляются на фрейм с помощью комбинации
//BorderLayout and GridLayout	
	Calculator(){

		windowContent = new JPanel();
		CalculatorEngine calcEngine = new CalculatorEngine(this);
	//Задаем схему для этой панели	
		BorderLayout b1 = new BorderLayout();
		windowContent.setLayout(b1);
	
	//Создаём и отображаем поле и Добавляем его в Северную область окна
		displayField = new JTextField(30);
		displayField.setText("");
		windowContent.add("North", displayField);

	//Создаём кнопки, используя конструктор класса JButton, который принимает
	//текст кнопки в качестве параметра
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
		

	//Создаём панель с GridLayout которая содержит 12 кнопок - 10 кнопок с 
	// числами и кнопки с точкой и знаком равно

		p1 = new JPanel();
		GridLayout gl = new GridLayout(4, 3);
		p1.setLayout(gl);

	//Добавляем кнопки на панель p1
		for(int i=9; i>-1; i--){
	
			p1.add(buttons[i]);
			buttons[i].addActionListener(calcEngine);

		}

		p1.add(buttonPoint);
		p1.add(buttonEqual);

	//Создаём панель с GridLayout которая содержит 4 кнопок - операция над числами
	// and Добавляем кнопки на панель p2
		p2 = new JPanel();
		GridLayout g2 = new GridLayout(4, 1);
		p2.setLayout(g2);
		p2.add(buttontPlus);
		p2.add(buttonMinus);
		p2.add(buttonMult);
		p2.add(buttonDiv);
		p2.setPreferredSize(new Dimension(50, 300));


	//Помещаем панель р1 в центральную область окна
		windowContent.add("Center", p1);
	
	//Помещаем панель р2 в восточную область окна
		windowContent.add("East", p2);	
		

	//Создаем фрейм и задаём его основную панель
		JFrame frame = new JFrame("CALCULATOR");
		frame.setContentPane(windowContent);
		frame.setDefaultCloseOperation(3);

	//делаем размер окна достаточным для того чтобы вместить все компоненты
		frame.pack();
		frame.setSize(300, 300);
	
	//Наконец, отображаем окно  по центру
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	
	

	}
	
	public static void main (String[] args){

		Calculator calc = new Calculator();

	}

}