package main;

import java.awt.Color;
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
		setLayout(null);
		setOpaque(true);
		setBackground(Color.white);
		add(start);
		add(hscores);
		add(exit);
		start.setBounds(w/4, h/4, w/2, h/12);
		hscores.setBounds(w/4, 5*h/12, w/2, h/12);
		exit.setBounds(w/4, 7*h/12, w/2, h/12);
	}
	public int height(){
		return h;
	}
	public int width(){
		return w;
	}
	public class MenuButton extends JButton{
		
	}
}
