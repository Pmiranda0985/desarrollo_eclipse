package ejercicio915;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Bienve extends View {
	public Bienve(App appController) {
		super(appController);
		setLayout(null);

		JLabel lblNewLabel = new JLabel("Bienvenido a mi aplicación");
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblNewLabel.setBounds(94, 88, 274, 31);
		add(lblNewLabel);

		JButton entrar = new JButton("ENTRAR");
		entrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				appController.irPantalla1("Pantalla 1");
			}
		});
		entrar.setBounds(175, 172, 89, 23);
		add(entrar);

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 3878486781867813689L;
}
