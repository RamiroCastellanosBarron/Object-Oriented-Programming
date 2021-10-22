import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		String[] listaNombres = new String[30];
		String[] listaTelefonos = new String[30];
		String[] listaSexos = new String[30];

		//nombres
		try {
			File nombres = new File("C://Repositorio GitHub//Progra-Intermedia-POO-//10.20 - File Management//Base de Datos//Nombres.txt");
			Scanner scanNombres = new Scanner(nombres);
			int contadorNombres = 0;
			while (scanNombres.hasNextLine()) {
				listaNombres[contadorNombres] = scanNombres.nextLine();
				contadorNombres++;
			}
			scanNombres.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error ocurred.");
		}

		//telefonos
		try {
			File telefonos = new File("C://Repositorio GitHub//Progra-Intermedia-POO-//10.20 - File Management//Base de Datos//Telefonos.txt");
			Scanner scanTelefonos = new Scanner(telefonos);
			int contadorTelefonos = 0;
			while (scanTelefonos.hasNextLine()) {
				listaTelefonos[contadorTelefonos] = scanTelefonos.nextLine();
				contadorTelefonos++;
			}
			scanTelefonos.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error ocurred.");
		}

		//sexos
		try {
			File sexos = new File("C://Repositorio GitHub//Progra-Intermedia-POO-//10.20 - File Management//Base de Datos//Sexos.txt");
			Scanner scanSexos = new Scanner(sexos);
			int contadorSexos = 0;
			while (scanSexos.hasNextLine()) {
				listaSexos[contadorSexos] = scanSexos.nextLine();
				contadorSexos++;
			}
			scanSexos.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error ocurred.");
		}

		//de lista a tabla
		String[][] tabla = new String[30][3];
		String formatoTabla = "| %-37s | %-22s | %-19s |%n";
		for(int i = 0; i < 30; i++) {
			tabla[i][0] = listaNombres[i];
		}
		for(int i = 0; i < 30; i++) {
			tabla[i][1] = listaTelefonos[i];
		}
		for(int i = 0; i < 30; i++) {
			tabla[i][2] = listaSexos[i];
		}

		//imprimimos tabla
		imprimirTitulo();
		for(int i = 0; i < 30; i++) {
			System.out.printf(formatoTabla, tabla[i][0], tabla[i][1], tabla[i][2]);
		}
		imprimirPieTitulo();


		
	}
	static void imprimirTitulo() {
		System.out.format("+--------------------------------------------------------------------------------------+%n");
		System.out.format("|                                      PERSONAS                                        |%n");
		System.out.format("+---------------------------------------+------------------------+---------------------+%n");
		System.out.format("|          NOMBRE COMPLETO              |        TELEFONO        |          SEXO       |%n");
		System.out.format("+---------------------------------------+------------------------+---------------------+%n");
	}
	static void imprimirPieTitulo() {
		System.out.format("+---------------------------------------+------------------------+---------------------+%n");
	}
}
