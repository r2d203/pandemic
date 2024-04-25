
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class panelReglas extends JPanel implements ActionListener {
	
	JButton volver;
	JButton tatico;
	JLabel txt;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;

	public panelReglas(){
		setSize(1920,1080);

		volver = new JButton("");
		volver.setBounds(810, 948, 254, 55);
		volver.setIcon(new ImageIcon("D:\\pandemic\\pandemic\\assets\\button_volver-al-menu.png"));
		
		
		volver.addActionListener(this);
		setLayout(null);
		
		add(volver);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Pandemic\\Pandemoc\\assets\\info.png"));
		lblNewLabel.setBounds(42, 144, 775, 304);
		add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Pandemic\\Pandemoc\\assets\\instrucions.png"));
		lblNewLabel_1.setBounds(32, 535, 775, 276);
		add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Pandemic\\Pandemoc\\assets\\instrucions4.png"));
		lblNewLabel_2.setBounds(1156, 100, 754, 177);
		add(lblNewLabel_2);
				
				lblNewLabel_3 = new JLabel("");
				lblNewLabel_3.setIcon(new ImageIcon("D:\\Pandemic\\Pandemoc\\assets\\instrucions3.png"));
				lblNewLabel_3.setBounds(1141, 363, 754, 177);
				add(lblNewLabel_3);
				
				lblNewLabel_4 = new JLabel("");
				lblNewLabel_4.setIcon(new ImageIcon("D:\\Pandemic\\Pandemoc\\assets\\instrucions2.png"));
				lblNewLabel_4.setBounds(1141, 652, 754, 177);
				add(lblNewLabel_4);
				

				txt = new JLabel("");
				txt.setHorizontalAlignment(SwingConstants.CENTER);
				txt.setIcon(new ImageIcon("C:\\Users\\Alumnat\\Downloads\\fondoReglas (1).jpg"));
				txt.setBounds(0, -13, 1920, 1100);
				
						add(txt);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== volver) {
		JOptionPane.showMessageDialog(null, "Volviendo al menu principal...");
		JFrame marco = (JFrame)SwingUtilities.getWindowAncestor(this);
		marco.remove(this);
		marco.getContentPane().add(new panelPrincipal());
		marco.setVisible(true);
		}
	}
}
