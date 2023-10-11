package ej3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ejj3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejj3 window = new ejj3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ejj3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		

		JButton Calculadora = new JButton("");

		Calculadora.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}

		});

		Calculadora.setIcon(new ImageIcon("C:\\Users\\pmiranda0985\\Desktop\\Patricia\\programacion de servicios y procesos\\GNOME_Calculator_icon_2021.svg.png"));

		Calculadora.setBounds(40, 114, 159, 114);

		frame.getContentPane().add(Calculadora);

		

		JButton Notas = new JButton("");

		Notas.setIcon(new ImageIcon("C:\\Users\\pmiranda0985\\Desktop\\Patricia\\programacion de servicios y procesos\\7863172.png"));

		Notas.setBounds(260, 113, 164, 137);

		frame.getContentPane().add(Notas);

		

		JLabel lblNewLabel = new JLabel("PRACTICA");

		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel.setBounds(138, 40, 143, 93);

		frame.getContentPane().add(lblNewLabel);
		

		ActionListener action = new ActionListener() {

			

			@Override

			public void actionPerformed(ActionEvent e) {

				Clase ac = new Clase();

				String ruta = "C:\\WINDOWS\\system32\\notepad.exe";

				ac.EjecutarProceso(ruta);
				
			}

		};

		ActionListener acC = new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent e) {

				try {

					Process p= new ProcessBuilder("CMD", "/C", "CALC").start();

				} catch (IOException e1) {

					e1.printStackTrace();

				}

			}

		};
		

		Notas.addActionListener(action);

		Calculadora.addActionListener(acC);

	}

}
