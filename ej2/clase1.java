package ej2;

import java.io.IOException;

public class clase1 {


	public static void main(String[] args) {
		try {
			Process p = new ProcessBuilder("CMD", "/C", "start", "dir").start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
