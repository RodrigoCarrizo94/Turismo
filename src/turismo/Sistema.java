package turismo;

import java.io.*;

public class Sistema {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("posiciones.in");
			br = new BufferedReader(fr);
			String linea;
			while ((linea = br.readLine()) != null) {
				try {
					String[] datos = linea.split(",");
					String nombre = datos[0];
					int costo = Integer.parseInt(datos[1]);
					double tiempo = Double.parseDouble(datos[2]);
					TipoDeAtraccion tipo = datos[3]; // Corregir
					Usuario user = new Usuario(nombre, costo, tiempo, tipo);
				} catch (NoValidoException n) {
					System.err.println("Uno de los valores introducidos no es correcto.");
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
