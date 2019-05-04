import java.awt.event.*;
import javax.swing.*;


public class CalculatorEngine implements ActionListener{


	Calculator parent;


	CalculatorEngine(Calculator parent){

		this.parent = parent;

	} 

	
	public void actionPerformed(ActionEvent e){

	JTextField myDisplayField = parent.displayField;
	JButton clickedButton = null;
	String Action = "";
	String inputS="";
	double inputValue = 0;
	double result1 = 0; double result2 = 0;
		

	//Получаем источник события
		Object src = e.getSource();
	
	//Преобразуем его  в нужный объект
		clickedButton = (JButton) src;
			
		case("+"):
				result1 = Double.parseDouble(myDisplayField.getText());
				Action="A";
				System.out.println(Action);
				myDisplayField.setText("");
				break;
			case("-"):
				result1 = Double.parseDouble(myDisplayField.getText());
				Action="B";
				myDisplayField.setText("");
				break;
			case("*"):
				result1 = Double.parseDouble(myDisplayField.getText());
				Action="C";
				myDisplayField.setText("");
				break;
			case("/"):
				result1 = Double.parseDouble(myDisplayField.getText());
				Action="D";
				myDisplayField.setText("");
				break;
			case("."):
				result1 = Double.parseDouble(myDisplayField.getText())/10;	
				myDisplayField.setText(result1+"");
				parent.buttonPoint.setEnabled(false);
				break;

			

	
		}

/*
		if(clickedButton.getText() == "="){
			System.out.println(Action);
			
			switch(Action){
				
				case("A"):
					
					result1 += Double.parseDouble(myDisplayField.getText());	
					System.out.println(result1);
					myDisplayField.setText(result1+"");
					break;

				case("B"):
					System.out.println(Action);
					result1 -= Double.parseDouble(myDisplayField.getText());	
					myDisplayField.setText(result1+"");
					break;
				
				case("C"):
					System.out.println(Action);
					result1 *= Double.parseDouble(myDisplayField.getText());	
					myDisplayField.setText(result1+"");
					break;

				case("D"):
					result2 /= Double.parseDouble(myDisplayField.getText());	
					myDisplayField.setText(result1+"");
					break;	
	
		
			}

		}
*/

		//myDisplayField.setText(inputS);


		
		

	

	}

}