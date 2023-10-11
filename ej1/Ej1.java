package ej1;

import java.io.IOException;

public class Ej1 {

	public void ejecutarProceso(String ruta) {

		ProcessBuilder pB = new ProcessBuilder(ruta);

		try {

			pB.start();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
