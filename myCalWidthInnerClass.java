import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class myCalWidthInnerClass {

	private JPanel panelWithInputs;
	private JPanel panelWithButtons;
	private	JPanel panelWithResults;
	private JFrame f;
	private JLabel l1, l2, r;
	private JTextField t1, t2, result;
	private JButton b1, b2, b3, b4;

	public myCalWidthInnerClass(){
		
		BorderLayout BF = new BorderLayout();
	
		panelWithInputs = new JPanel();
		//panelWithInputs.setPreferredSize(new Dimension(400, 100));
		
		panelWithButtons = new JPanel();
		//panelWithButtons.setPreferredSize(new Dimension(400, 200));

		panelWithResults = new JPanel();
		//panelWithResults.setPreferredSize(new Dimension(400, 100));

		f = new JFrame("Калькулятор!");
		f.setSize(400, 150);
		f.setResizable(false);
		f.setDefaultCloseOperation(3);
		f.setLayout(BF);
		f.setLocationRelativeTo(null);
		f.getContentPane().add(panelWithInputs, BorderLayout.NORTH);
		f.getContentPane().add(panelWithButtons, BorderLayout.CENTER);	
		f.getContentPane().add(panelWithResults, BorderLayout.SOUTH);
		
		
		l1 = new JLabel("№1");
		t1 = new JTextField(5);
		l2 = new JLabel("№2");
		t2 = new JTextField(5);

		
		panelWithInputs.add(l1); panelWithInputs.add(t1); 
		panelWithInputs.add(l2); panelWithInputs.add(t2);
		
		b1 = new JButton("+");		
		b2 = new JButton("-");
		b3 = new JButton("*");
		b4 = new JButton("/");

		InnerClass IC = new InnerClass();

		b1.addActionListener(IC); b2.addActionListener(IC);
		b3.addActionListener(IC); b4.addActionListener(IC);
		

		panelWithButtons.add(b1); panelWithButtons.add(b2);
		panelWithButtons.add(b3); panelWithButtons.add(b4);

		r = new JLabel("Ответ:");
		result = new JTextField(5);
		result.setName("Результат");
		result.setEditable(false);
                result.setFocusable(false);		
	
		panelWithResults.add(r); panelWithResults.add(result);

		f.setVisible(true);


	}	

	class InnerClass implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			

			JButton b1 = (JButton) e.getSource();
			double r;

                        switch(b1.getText()){

                        case ("+"):
                            r = Double.parseDouble(t1.getText()) + Double.parseDouble(t2.getText());
                            result.setText(r+" ");
                            break;
                           
                        case ("-"):
                            r = Double.parseDouble(t1.getText()) - Double.parseDouble(t2.getText());
                            result.setText(r+" ");
                            break;
                           
                        case ("*"):
                            r = Double.parseDouble(t1.getText()) * Double.parseDouble(t2.getText());
                            result.setText(r+" ");
                            break;
                            
                        case ("/"):
                            r = Double.parseDouble(t1.getText()) / Double.parseDouble(t2.getText());
                            result.setText(r+" ");
                            break;    

                   	}
		 	


		}

	}


	public static void main (String[] args){

		myCalWidthInnerClass c = new myCalWidthInnerClass();
		
	
	}
}