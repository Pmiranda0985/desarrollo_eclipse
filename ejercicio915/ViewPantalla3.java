package ejercicio915;

import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ViewPantalla3 extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2857526454679870545L;
	private JTextField txtPant;

	public ViewPantalla3(App appController) {
		super(appController);
		setLayout(null);

		txtPant = new JTextField();
		txtPant.setText("PANTALLA 3");
		txtPant.setBounds(155, 109, 93, 23);
		add(txtPant);
		txtPant.setColumns(10);

		JButton btn1 = new JButton("ir a pantalla1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appController.irPantalla1(txtPant.getText());
			}
		});
		btn1.setBounds(10, 202, 118, 23);
		add(btn1);

		JButton btn3 = new JButton("ir a pantalla3");
		btn3.setEnabled(false);
		btn3.setBounds(304, 202, 111, 23);
		add(btn3);

		JButton btn2 = new JButton("ir a pantalla2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appController.irPantalla2(txtPant.getText());
			}
		});
		btn2.setBounds(155, 202, 118, 23);
		add(btn2);

	}
	public void cambiarTexto(String eso) {
		 txtPant.setText(eso);
	}

}
