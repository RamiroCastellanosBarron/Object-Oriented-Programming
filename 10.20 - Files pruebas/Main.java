import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File file = new File("C://Repositorio GitHub//Progra-Intermedia-POO-//10.20 - Files pruebas");
		String path = file.getPath();
		String[] archivos = file.list();
		for(int i = 0; i < archivos.length; i++) {
			System.out.println(archivos[i]);
		}
		System.out.println("Ingresa el archivo que deseas");
		String nomArchivo = sc.nextLine();
		String newPath = path.concat("//" + nomArchivo);
		System.out.println(newPath);
		File f2 = new File(newPath);
		String nombreNuevo = f2.getName();
		System.out.println(nombreNuevo);
		try {
			Scanner sc3 = new Scanner(System.in);
			FileWriter escribir = new FileWriter(newPath);
			System.out.println("Ingresa algo que quieras insertar en el archivo: ");
			String cadena = sc3.nextLine();
			escribir.write(cadena);
			escribir.close();
			sc3.close();
		} catch (IOException e) { }
		try {
			FileReader leer = new FileReader(newPath);
			Scanner sc2 = new Scanner(leer);
			while(sc2.hasNextLine()) {
				System.out.println(sc2.nextLine());
			}
		} catch (IOException e) { }
	}
}

//"C:\Repositorio GitHub\Progra-Intermedia-POO-\10.20 - Files pruebas"