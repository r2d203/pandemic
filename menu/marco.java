
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class marco extends JFrame{
	
	panelPrincipal panel1;
	Dimension screenSize;
	  JButton b1;
	  JLabel l1;
	
	marco(){


		setTitle("Pandemic");
		setSize(1920,1080);
		setLocationRelativeTo(null);
		panel1 = new panelPrincipal();

		
		add(panel1);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	


	  }


	}