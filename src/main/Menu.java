package main;

import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Menu extends JPanel {
	int h = Toolkit.getDefaultToolkit().getScreenSize().height;
	int w = Toolkit.getDefaultToolkit().getScreenSize().width;
	JButton start = new JButton("Start");
	JButton hscores=new JButton("High Scores");
	JButton exit=new JButton("Exit");
	
	public Menu(){
		setUpMenu();
		setVisible(true);
	}
	public void setUpMenu(){
		setFocusable(false);
		add(start);
		add(hscores);
		add(exit);
		start.setBounds(w/2, h/6, w/4, h/6);
		start.setVisible(true);
		hscores.setBounds(w/2, 3*h/6, w/4, h/6);
		exit.setBounds(w/2, 5*h/6, w/4, h/6);
		System.out.println("setup");
	}
	public int height(){
		return h;
	}
	public int width(){
		return w;
	}
	
}
