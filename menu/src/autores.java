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
	private JTextField txtAutoresDelTrabajo;
	private JTextField txtAutoresDelTrabajo_1;
	private JTextField txtDenisOwusu;
	private JTextField txtPabloGuiral;

	public autores() {
		setSize(1920, 1080);

		volver = new JButton("");
		volver.setBounds(762, 11, 278, 63);
		volver.setIcon(new ImageIcon("D:\\pandemic\\pandemic\\assets\\button_volver-al-menu.png"));

		volver.addActionListener(this);
		setLayout(null);

		add(volver);

		txtAutoresDelTrabajo = new JTextField("Ayman Khammame / akhammamem8@alumnes.ilerna.com\r\n\r\n");
		txtAutoresDelTrabajo.setBounds(284, 228, 314, 35);
		add(txtAutoresDelTrabajo);
		txtAutoresDelTrabajo.setColumns(10);

		txtAutoresDelTrabajo_1 = new JTextField();
		txtAutoresDelTrabajo_1.setText(" Ridwan Boulahdaraj / rboulahdraj@alumnes.ilerna.com");
		txtAutoresDelTrabajo_1.setBounds(284, 157, 314, 35);
		add(txtAutoresDelTrabajo_1);
		txtAutoresDelTrabajo_1.setColumns(10);

		txtDenisOwusu = new JTextField();
		txtDenisOwusu.setText("Denis Owusu /  do7508012@alumnes.ilerna.com");
		txtDenisOwusu.setBounds(284, 301, 314, 40);
		add(txtDenisOwusu);
		txtDenisOwusu.setColumns(10);

		txtPabloGuiral = new JTextField();
		txtPabloGuiral.setText("Pablo Guiral / e.labrador9@alumnes.ilernalleida.com");
		txtPabloGuiral.setBounds(284, 370, 314, 40);
		add(txtPabloGuiral);
		txtPabloGuiral.setColumns(10);
		txt = new JLabel("");
		txt.setIcon(new ImageIcon("D:\\pandemic\\pandemic\\assets\\autoresfondo .jpg"));
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