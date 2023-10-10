package ejercicio915;

import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ViewPantalla2 extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7319049492231641074L;
	private JTextField txtPantalla;

	public ViewPantalla2(App appController) {
		super(appController);
		setLayout(null);

		txtPantalla = new JTextField();
		txtPantalla.setText("PANTALLA 2");
		txtPantalla.setBounds(155, 109, 93, 23);
		add(txtPantalla);
		txtPantalla.setColumns(10);

		JButton btn1 = new JButton("ir a pantalla1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appController.irPantalla1(txtPantalla.getText());
			}
		});
		btn1.setBounds(10, 202, 118, 23);
		add(btn1);

		JButton btn3 = new JButton("ir a pantalla3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appController.irPantalla3(txtPantalla.getText());
			}
		});
		btn3.setBounds(304, 202, 111, 23);
		add(btn3);

		JButton btn2 = new JButton("ir a pantalla2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btn2.setBounds(155, 202, 118, 23);
		add(btn2);

		
	}
	public void cambiarTexto(String eso) {
			 txtPantalla.setText(eso);
		}

	
}
