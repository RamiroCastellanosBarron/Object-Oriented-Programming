import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		File ver = new File("C://Repositorio GitHub//Progra-Intermedia-POO-//10.20 - Files (complete)//Base de Datos");
		File crear = new File("C://Repositorio GitHub//Progra-Intermedia-POO-//10.20 - Files (complete)//Base de Datos");
		Scanner sc = new Scanner(System.in);
		String nomArchivo = " ";
		String[] archivos = ver.list();
		System.out.println("PROGRAMA PARA ARCHIVOS");
		int o = 1;
		do {
			System.out.println("1 mostrar\n2 altas\n3 bajas\n4 cambios\n5 salir\n");
			System.out.print("Ingrese una opcion: ");
			o = sc.nextInt();
			System.out.println();
			if(o == 1) {
				System.out.println("CATALOGO DE ARCHIVOS");
				for(int i = 0; i < archivos.length; i++) {
					System.out.println(i + 1 + ". \t" + archivos[i]);
				}
			}
			if(o == 2) {
				System.out.println("CREAR UN ARCHIVO");
				System.out.print("Ingresa el nombre del archivo: ");
				nomArchivo = sc.nextLine();
				crear.createNewFile();
			}
		} while (o != 5);
	}
}

//"C:\Repositorio GitHub\Progra-Intermedia-POO-\10.20 - Files (complete)\Base de Datos"