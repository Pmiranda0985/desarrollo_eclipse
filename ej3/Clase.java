package ej3;

import java.io.IOException;

public class Clase {

	public void EjecutarProceso(String ruta) {

		ProcessBuilder pB = new ProcessBuilder(ruta);

		try {

			pB.start();

		} catch (IOException e) {

			e.printStackTrace();

		}
	}

}
