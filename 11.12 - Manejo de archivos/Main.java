//un programa para amigos y telefonos
// NO ESTAMOS TRABAJANDO CON OBJETOS
// ESTE ES SOLO PARA GUARDAR INFORMACION EN ARCHIVOS DE TEXTO

import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) {

		String amigo;
		String tel;

		try {
			
			File f = new File("C:\\Repositorio GitHub\\Progra-Intermedia-POO-\\11.12 - Manejo de archivos\\Directorio.txt");
			FileOutputStream f2 = new FileOutputStream(f, true);
			PrintStream f3 = new PrintStream(f2);
			Scanner sc = new Scanner(System.in);
			
			for(int i = 0; i < 5; i++) {

				System.out.print("Ingresa el nombre del amigo " + (i + 1) + ": ");
				amigo = sc.nextLine();
				System.out.println();
				System.out.print("Ingresa el telefono del amigo: " + (i + 1) + ": ");
				tel = sc.nextLine();
				System.out.println();
				f3.println(amigo);
				f3.println(tel);

			}

			f3.close();

		} catch (IOException e) {

			System.out.println("Error en archivo");

		}
	}
}


//C:\Repositorio GitHub\Progra-Intermedia-POO-\11.12 - Manejo de archivos