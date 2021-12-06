import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) {
		String clave;
		String nombre;
		String numero;
		String ruta = "";

		try {
			File f = new File("C:\\Repositorio GitHub\\Progra-Intermedia-POO-\\Estudio\\archivos\\Base de datos\\base.txt");
			FileOutputStream f2 = new FileOutputStream(f, true);
			PrintStream f3 = new PrintStream(f2);
			Scanner sc = new Scanner(System.in);

			System.out.print("  >>  Ingresa la clave: ");
			clave = sc.nextLine();
			f3.println(clave);
			System.out.print("  >>  Ingresa el nombre: ");
			nombre = sc.nextLine();
			f3.println(nombre);
			System.out.print("  >>  Ingresa el numero: ");
			numero = sc.nextLine();
			f3.println(numero);
			f3.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}