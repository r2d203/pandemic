import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;

public class autores extends JPanel implements ActionListener {

	JButton volver;
	JButton tatico;
	JLabel txt;

	public autores() {
		setSize(1920, 1080);

		volver = new JButton("");
		volver.setBounds(762, 11, 278, 63);
		volver.setIcon(new ImageIcon("D:\\pandemic\\pandemic\\assets\\button_volver-al-menu.png"));

		volver.addActionListener(this);
		setLayout(null);

		add(volver);
		txt = new JLabel("");
		txt.setIcon(new ImageIcon("D:\\Pandemic\\Pandemoc\\assets\\bombres.jpg"));
		txt.setBounds(5, 0, 1920, 1080);

		add(txt);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == volver) {
			JOptionPane.showMessageDialog(null, "Volviendo al menu principal...");
			JFrame marco = (JFrame) SwingUtilities.getWindowAncestor(this);
			marco.remove(this);
			marco.getContentPane().add(new panelPrincipal());
			marco.setVisible(true);
		}
	}
}