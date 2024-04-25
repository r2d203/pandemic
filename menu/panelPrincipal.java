
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.applet.*;
import java.applet.*;
public class panelPrincipal extends JPanel implements ActionListener {
	
	JButton boton2;
	JButton boton3;
	JButton NuevaPartida;
	JTextField areadetxt;
	private JPanel panel;
	private Label label;
	private JButton btnNewButton;

	panelPrincipal(){
		setSize(1920,1080);
		setLayout(null);
				
				NuevaPartida = new JButton("");
				NuevaPartida.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						int i = JOptionPane.showConfirmDialog(null, "Estas seguro de crear una nueva partida?");
						if(i == 0) {
							JOptionPane.showMessageDialog(null, "Creando nueva partida");
						}

					}
				});
				NuevaPartida.setIcon(new ImageIcon("D:\\pandemic\\pandemic\\assets\\button_nueva-partida.png"));
				NuevaPartida.setBounds(912, 236, 257, 44);
				add(NuevaPartida);
						
						JButton CargarPartida = new JButton("");
						CargarPartida.setIcon(new ImageIcon("D:\\pandemic\\pandemic\\assets\\button_cargar-partida.png"));
						CargarPartida.setBounds(912, 313, 257, 44);
						add(CargarPartida);
								
								JButton Informacin = new JButton("");
								Informacin.addMouseListener(new MouseAdapter() {
									@Override
									public void mouseClicked(MouseEvent e) {
										reglas();
									}
								});
								Informacin.setIcon(new ImageIcon("D:\\pandemic\\pandemic\\assets\\button_informacion.png"));
								Informacin.setBounds(912, 393, 257, 44);
								add(Informacin);
										
										JButton ResumenPuntuacion = new JButton("");
										ResumenPuntuacion.setIcon(new ImageIcon("D:\\pandemic\\pandemic\\assets\\button_resumen-de-puntuacion.png"));
										ResumenPuntuacion.setBounds(861, 482, 374, 44);
										add(ResumenPuntuacion);
												
												JButton Autor = new JButton("");
												Autor.addMouseListener(new MouseAdapter() {
													@Override
													public void mouseClicked(MouseEvent e) {
														
														autores();
													}
												});
												Autor.setIcon(new ImageIcon("D:\\pandemic\\pandemic\\assets\\button_autor.png"));
												Autor.setBounds(940, 553, 199, 44);
												add(Autor);
														
														JButton Version = new JButton("");
														Version.addMouseListener(new MouseAdapter() {
															@Override
															public void mouseClicked(MouseEvent e) {
																JOptionPane.showMessageDialog(null, "La versión actual es la 1.0");
															}
														});
														Version.setIcon(new ImageIcon("D:\\pandemic\\pandemic\\assets\\button_version .png"));
														Version.setBounds(928, 621, 217, 44);
														add(Version);
																
																JButton Salir = new JButton("");
																Salir.addMouseListener(new MouseAdapter() {
																	@Override
																	public void mouseClicked(MouseEvent e) {
																		int i = JOptionPane.showConfirmDialog(null, "Estas seguro que queres cerrar el juego?");
																		if(i == 0) {
																			JOptionPane.showMessageDialog(null, "Cerrando juego");
																			System.exit(0);
																		}
																		

																	}
																});
																Salir.setIcon(new ImageIcon("D:\\pandemic\\pandemic\\assets\\button_salir.png"));
																Salir.setBounds(950, 691, 177, 44);
																add(Salir);
																		
																				JLabel Fondo = new JLabel("");
																				Fondo.setBounds(5, 0, 1920, 1080);
																				Fondo.setIcon(new ImageIcon("D:\\Pandemic\\Pandemoc\\assets\\fondomenu.jpg"));
																				add(Fondo);
	}
	
		
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== NuevaPartida) {
			reglas();
			
		}
		
		else if(e.getSource()==boton2) {
			
				JFrame marco = (JFrame)SwingUtilities.getWindowAncestor(this);
				marco.remove(this);
				marco.getContentPane().add(new panelReglas());
				marco.setVisible(true);
			
					}
		else if(e.getSource()==boton3) {
			
		}
	}
	
	public void reglas() {
		JFrame marco = (JFrame)SwingUtilities.getWindowAncestor(this);
		marco.remove(this);
		marco.getContentPane().add(new panelReglas());
		marco.setVisible(true);
	}
	public void autores() {
		JFrame marco = (JFrame)SwingUtilities.getWindowAncestor(this);
		marco.remove(this);
		marco.getContentPane().add(new autores());
		marco.setVisible(true);
	}
}