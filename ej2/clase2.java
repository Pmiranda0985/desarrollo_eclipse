package ej2;

import java.io.IOException;
import java.io.InputStream;

public class clase2 {

	public static void main(String[] args) {


		try {
			Process p = new ProcessBuilder("CMD", "/C", "DIR").start();
			InputStream put = p.getInputStream();

			int a;

			while ((a = put.read()) != -1)
				System.out.print((char) a);
			put.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
