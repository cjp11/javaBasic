package ex03;

import java.awt.Choice;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComputeBtnListener implements ActionListener{

	Choice opChooser;
	TextField tf1;
	TextField tf2;
	TextField tf3;
	public ComputeBtnListener() {}
	public ComputeBtnListener(Choice opChooser,
			TextField tf1,TextField tf2, TextField tf3) {
		this.opChooser = opChooser;
		this.tf1 = tf1;
		this.tf2 = tf2;
		this.tf3 = tf3;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String op = opChooser.getSelectedItem();
		int a = Integer.parseInt(tf1.getText());
		int b = Integer.parseInt(tf2.getText());
		int result = 0;
		switch(op) {
		case "+": result = a + b; break;
		case "-": result = a - b; break;
		case "*": result = a * b; break;
		case "/": result = a / b; break;
		}
		tf3.setText(Integer.toString(result));
	}
	
}
