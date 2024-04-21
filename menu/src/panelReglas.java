
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class panelReglas extends JPanel implements ActionListener {
	
	JButton volver;
	JButton tatico;
	JLabel txt;

	public panelReglas(){
		setSize(1920,1080);

		volver = new JButton("");
		volver.setBounds(758, 21, 254, 55);
		volver.setIcon(new ImageIcon("D:\\pandemic\\pandemic\\assets\\button_volver-al-menu.png"));
		
		
		volver.addActionListener(this);
		setLayout(null);
		
		add(volver);
		

		txt = new JLabel("");
		txt.setIcon(new ImageIcon("D:\\pandemic\\pandemic\\assets\\autoresfondo .jpg"));
		txt.setBounds(5, 0, 1920, 1080);
		
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
