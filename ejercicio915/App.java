package ejercicio915;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class App {

	private JFrame frame;

	private Bienve entrada;
	private ViewPantalla1 pantalla1;
	private ViewPantalla2 pantalla2;
	private ViewPantalla3 pantalla3;
	private JMenuBar menuBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
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
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		entrada = new Bienve(this);
		pantalla1 = new ViewPantalla1(this);
		pantalla2 = new ViewPantalla2(this);
		pantalla3 = new ViewPantalla3(this);

		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Navegar");
		menuBar.add(mnNewMenu);

		JMenuItem menu1 = new JMenuItem("Pantalla 1");
		mnNewMenu.add(menu1);
		ActionListener lis1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				irPantalla1("Pantalla 1");
			}
		};

		JMenuItem menu2 = new JMenuItem("Pantalla 2");
		mnNewMenu.add(menu2);
		ActionListener lis2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				irPantalla2("Pantalla 2");

			}
		};

		JMenuItem menu3 = new JMenuItem("Pantalla 3");
		mnNewMenu.add(menu3);
		ActionListener lis3 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				irPantalla3("Pantalla 3");

			}
		};

		JMenu salir = new JMenu("Salir");
		menuBar.add(salir);

		JMenuItem quedarse = new JMenuItem("Volver al inicio");
		ActionListener lisBien = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				irBienve();
				
			}
		};
		salir.add(quedarse);

		JMenuItem irse = new JMenuItem("Salir");
		salir.add(irse);
		ActionListener ac = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		};

		irBienve();

		menu1.addActionListener(lis1);
		menu2.addActionListener(lis2);
		menu3.addActionListener(lis3);
		irse.addActionListener(ac);
		quedarse.addActionListener(lisBien);
	}

	public void irPantalla1(String texto) {
		menuBar.setVisible(true);
		pantalla1.cambiarTexto(texto);
		frame.setContentPane(pantalla1);
		frame.revalidate();

	}

	public void irPantalla2(String texto2) {
		menuBar.setVisible(true);
		pantalla2.cambiarTexto(texto2);
		frame.setContentPane(pantalla2);
		frame.revalidate();
	}

	public void irPantalla3(String texto3) {
		menuBar.setVisible(true);
		pantalla3.cambiarTexto(texto3);
		frame.setContentPane(pantalla3);
		frame.revalidate();
	}

	public void irBienve() {
		menuBar.setVisible(false);
		frame.setContentPane(entrada);
		frame.revalidate();
	}

}
