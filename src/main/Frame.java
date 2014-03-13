package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Frame extends JFrame {
	private boolean inmenu;
	Menu menu=new Menu();
	Grid grid;
	
	public Frame(){
		inmenu=true;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		add(menu);
		menu.setBounds(0, 0, menu.width(), menu.height());
		
		setVisible(true);
	}
	public void paint(Graphics g){
		
	}
}
