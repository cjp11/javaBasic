package ex03;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

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

}
