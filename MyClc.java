import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyClc { //Мой калькулятор (С1с)

	public static void main (String[] args) {

		BorderLayout BF = new BorderLayout();
	
		 JPanel panelWithInputs = new JPanel();
		//panelWithInputs.setPreferredSize(new Dimension(400, 100));
		
		JPanel panelWithButtons = new JPanel();
		//panelWithButtons.setPreferredSize(new Dimension(400, 200));

		JPanel panelWithResults = new JPanel();
		//panelWithResults.setPreferredSize(new Dimension(400, 100));

		JFrame f = new JFrame("Калькулятор!");
		f.setSize(400, 150);
		f.setResizable(false);
		f.setDefaultCloseOperation(3);
		f.setLayout(BF);
		f.setLocationRelativeTo(null);
		f.getContentPane().add(panelWithInputs, BorderLayout.NORTH);
		f.getContentPane().add(panelWithButtons, BorderLayout.CENTER);	
		f.getContentPane().add(panelWithResults,BorderLayout.SOUTH);
		
		
		JLabel l1 = new JLabel("№1");
		JTextField t1 = new JTextField(5);
		JLabel l2 = new JLabel("№2");
		JTextField t2 = new JTextField(5);

		
		panelWithInputs.add(l1); panelWithInputs.add(t1); 
		panelWithInputs.add(l2); panelWithInputs.add(t2);
		
		JButton b1 = new JButton("+");		
		JButton b2 = new JButton("-");
		JButton b3 = new JButton("*");
		JButton b4 = new JButton("/");
		
		

		panelWithButtons.add(b1); panelWithButtons.add(b2);
		panelWithButtons.add(b3); panelWithButtons.add(b4);

		JLabel r = new JLabel("Ответ:");
		JTextField result = new JTextField(5);
		result.setName("Результат");
		result.setEditable(false);
                result.setFocusable(false);		
	
		panelWithResults.add(r); panelWithResults.add(result);

		b1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

		      double r = Double.parseDouble(t1.getText()) + Double.parseDouble(t2.getText());
                      result.setText(r+" ");

                    }
                });
	
		b2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

		      double r = Double.parseDouble(t1.getText()) - Double.parseDouble(t2.getText());
                      result.setText(r+" ");

                    }
                });


		b3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

		      double r = Double.parseDouble(t1.getText()) * Double.parseDouble(t2.getText());
                      result.setText(r+" ");

                    }
                });

		b4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

		      double r = Double.parseDouble(t1.getText()) / Double.parseDouble(t2.getText());
                      result.setText(r+"");

                    }
                });

		f.setVisible(true);


		

	}


}