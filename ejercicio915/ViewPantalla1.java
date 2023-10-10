package ejercicio915;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewPantalla1 extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5226810138978803176L;
	private JTextField txtPantalla;

	public ViewPantalla1(App appController) {
		super(appController);
		setLayout(null);

		txtPantalla = new JTextField();
		txtPantalla.setText("PANTALLA 1");
		txtPantalla.setBounds(155, 109, 93, 23);
		add(txtPantalla);
		txtPantalla.setColumns(10);

		JButton btn1 = new JButton("ir a pantalla1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appController.irPantalla2(txtPantalla.getText());
			}
		});
		btn2.setBounds(155, 202, 118, 23);
		add(btn2);

	}

	public void cambiarTexto(String eso) {
		 txtPantalla.setText(eso);
	}

}
