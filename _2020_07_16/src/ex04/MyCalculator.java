package ex04;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator extends Frame{
	

	
	public MyCalculator() {
		super("계산기");
		
		//레이아웃 매니저 교체: BorderLayout -> FlowLayout
		setLayout(new FlowLayout());
		
		TextField tf1 = new TextField();
		tf1.setPreferredSize(new Dimension(50,30));
		TextField tf2 = new TextField();
		tf2.setPreferredSize(new Dimension(50,30));
		
		Choice opChooser = new Choice();
		opChooser.add("+");
		opChooser.add("-");
		opChooser.add("*");
		opChooser.add("/");
		Button computeBtn = new Button("계산");
		TextField tf3 = new TextField();
		tf3.setPreferredSize(new Dimension(100,30));
		
		add(tf1);
		add(opChooser);
		add(tf2);
		add(computeBtn);
		add(tf3);
		setSize(640,200);
		addWindowListener(new MyWindowListener());
		ComputeBtnListener listener = new ComputeBtnListener(opChooser,tf1,tf2,tf3);
		
		computeBtn.addActionListener(listener);
	}
	public static void main(String[] args) {
		MyCalculator f = new MyCalculator();
		f.setVisible(true);
		
	}
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

}
