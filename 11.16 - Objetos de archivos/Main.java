import java.io.*;
import java.util.*;

class Amigo {
	private String nombre;
	private String correo;

	public Amigo(String nombre, String correo) {
		setNombre(nombre);
		setCorreo(correo);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String toString() {
		return "Amigo: " + nombre + "\nCorreo: " + correo;
	}
}

class Main implements Serializable {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			FileOutputStream f = new FileOutputStream("C:\\Repositorio GitHub\\Progra-Intermedia-POO-\\11.12 - Manejo de archivos\\Directorio.txt");
			ObjectOutputStream f2 = new ObjectOutputStream(f);
			System.out.print("Ingresa el nombre de tu amigo: ");
			String nombre = sc.nextLine();
			System.out.print("Ingresa su correo el electronico: ");
			String correo = sc.nextLine();
			Amigo a = new Amigo(nombre, correo);
			f2.writeObject(a);
			f2.close();
			f.close();
			sc.close();

		} catch (IOException e) {
			
			System.out.println("Error en el archivo.");
			
		} try {

			FileInputStream f = new FileInputStream("C:\\Repositorio GitHub\\Progra-Intermedia-POO-\\11.12 - Manejo de archivos\\Directorio.txt");
			ObjectInputStream f2 = new ObjectInputStream(f);
			Amigo a = (Amigo) f2.readObject();
			System.out.println(a);
			f2.close();
			f.close();

		} catch (EOFException e) {
			
			System.out.println("Se llego al final del archivo.");

		} catch (IOException e) {
			
			System.out.println("Error en el archivo.");

		} catch (ClassNotFoundException e) {
			
			System.out.println("La clase no esta definida.");

		}
	}
}

/*

FileInputStream fis = new FileInputStream("nombre del archivo");
ObjectInputStream ois = new ObjectInputStream(fis);

Clase objeto = (clase) ois.readObject();
ois.close();
fis.close();

FileOutputStream fos = new FileOutputStream("nombre del archivo");
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(nombre del objeto);
oos.close();
fos.close();

campos calculados

los campos static o transient que se definan en la clase son aquellos que no se van a grabar en el archivo de objetos.

El atributo transient es aquel que no se requiere serializar

Ejemplo:

transient double total;

*/