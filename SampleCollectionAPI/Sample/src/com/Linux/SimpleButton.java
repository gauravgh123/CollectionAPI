package com.Linux;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleButton extends JFrame{

	private JFrame window=new  JFrame("Simple Button");
	private JButton button1=new JButton("Click Me");
	
	public SimpleButton() {
		window.setSize(300, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(button1);
		window.setVisible(true);
		
	}
}
