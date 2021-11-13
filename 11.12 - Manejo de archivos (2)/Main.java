// un programa para amigos y telefonos
// para leer archivos

import java.io.*;

class Main {

	public static void main(String[] args) {

		String amigo;
		String tel;

		try {

			File f = new File("C:\\Repositorio GitHub\\Progra-Intermedia-POO-\\11.12 - Manejo de archivos\\Directorio.txt");
			FileInputStream f2 = new FileInputStream(f);
			InputStreamReader f3 = new InputStreamReader(f2);
			BufferedReader f4 = new BufferedReader(f3);
			
			for(int i = 0; i < 5; i++) {

				amigo = f4.readLine();
				tel = f4.readLine();
				System.out.println("Nombre de mi amigo: " + amigo + "\n" + "Su telefono es: " + tel + "\n");
				
			}

			f4.close();

		} catch (IOException e) {

			System.out.println("Error en archivo");

		}
	}
	
}


//C:\Repositorio GitHub\Progra-Intermedia-POO-\11.12 - Manejo de archivos