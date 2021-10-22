import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {

/*----------------------------------------------------------------------------------------------------------------------

													LEER ARCHIVOS

-----------------------------------------------------------------------------------------------------------------------*/

		String[] listaNombres = new String[30];
		String[] listaTelefonos = new String[30];
		String[] listaSexos = new String[30];

		//nombres
		try {
			File nombres = new File("C://Repositorio GitHub//Progra-Intermedia-POO-//10.20 - File (write)//Base de Datos//Nombres.txt");
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
			File telefonos = new File("C://Repositorio GitHub//Progra-Intermedia-POO-//10.20 - File (write)//Base de Datos//Telefonos.txt");
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
			File sexos = new File("C://Repositorio GitHub//Progra-Intermedia-POO-//10.20 - File (write)//Base de Datos//Sexos.txt");
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
		String formatoTabla = "| %-37s | %-22s | %-19s |%n";
		imprimirTitulo();
		for(int i = 0; i < 30; i++) {
			System.out.printf(formatoTabla, tabla[i][0], tabla[i][1], tabla[i][2]);
		}
		imprimirPieTitulo();

/*----------------------------------------------------------------------------------------------------------------------

													ESCRIBIR EN ARCHIVOS

-----------------------------------------------------------------------------------------------------------------------*/

		try {
			FileWriter cambios = new FileWriter("C://Repositorio GitHub//Progra-Intermedia-POO-//10.20 - File (write)//Tabla.txt");
			for(int i = 0; i < 30; i++) {
				cambios.write(listaNombres[i] + "\t\t" + listaTelefonos[i] + "\t\t" + listaSexos[i] + "\n");
			}
			cambios.close();
		} catch (IOException e) {
			System.out.println("Algo salio mal");
		}





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