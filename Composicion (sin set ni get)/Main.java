import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("\n"+"\n"+"\t"+"\t"+"PROGRAMA"+"\n");
		System.out.println("\t"+"Opciones a seleccionar: "+"\n");
		System.out.println("\t"+"\t"+"1. Desplegar datos de usuario demostrativo."+"\n");
		System.out.println("\t"+"\t"+"2. Desplegar datos de nuevo usuario.");

		int opcion;

		System.out.print("\n"+"\t"+"Opcion: ");
		opcion=sc.nextInt();
		System.out.print("\n");
		switch (opcion) {
			case 1: 
					System.out.println("\n"+"\n"+"\t"+"\t"+"USUARIO DEFAULT"+"\n");
					Nombre n = new Nombre("Felix", "Alejandro", "Gonzalez", "Garcia");
					Direccion d = new Direccion("Antonio Caso", "161", "64630", "Colinas de San Jeronimo", "Monterrey", "Nuevo Leon", "Mexico");
					FechaNacimiento f = new FechaNacimiento("02", "05", "2000");
					Persona p = new Persona("21", n, d, f);
					System.out.println(n);
					System.out.println(p);
					System.out.println(f);
					System.out.println(d);
					System.out.print("\n"+"\n"+p.getEdad());
					break;
			case 2: 
					Nombre n1 = new Nombre(leerPrimerNombre(), leerSegundoNombre(), leerApellidoPaterno(), leerApellidoMaterno());
					Direccion d1 = new Direccion(leerCalle(), leerNumero(), leerCodigoPostal(), leerColonia(), leerMunicipio(), leerEstado(), leerPais());
					FechaNacimiento f1 = new FechaNacimiento(leerDia(), leerMes(), leerAnio());
					Persona p1 = new Persona("21", n1, d1, f1);
					System.out.println("\n"+"\n"+"\t"+"\t"+"USUARIO NUEVO"+"\n");
					System.out.println(n1);
					System.out.println(p1);
					System.out.println(f1);
					System.out.println(d1);
					break;
		}
	}
	
	//formulario nombre

	public static String leerPrimerNombre(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n"+"\t"+"Nombre completo"+"\n");
		System.out.print("\n\t  >>  Ingrese su primer nombre: ");
		return sc.nextLine();
	}
	public static String leerSegundoNombre(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t  >>  Ingrese su segundo nombre: ");
		return sc.nextLine();
	}
	public static String leerApellidoPaterno(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t  >>  Ingrese su apellido paterno: ");
		return sc.nextLine();
	}
	public static String leerApellidoMaterno(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t  >>  Ingrese su apellido materno: ");
		return sc.nextLine();
	}

	//formulario direccion

	public static String leerCalle(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n"+"\t"+"Direccion"+"\n");
		System.out.print("\n\t  >>  Ingrese la calle donde vive: ");
		return sc.nextLine();
	}
	public static String leerNumero(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t  >>  Ingrese el numero de su casa: ");
		return sc.nextLine();
	}
	public static String leerCodigoPostal(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t  >>  Ingrese el codigo postal de la calle: ");
		return sc.nextLine();
	}
	public static String leerColonia(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t  >>  Ingrese la colonia donde vive: ");
		return sc.nextLine();
	}
	public static String leerMunicipio(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t  >>  Ingrese el municipio donde vive: ");
		return sc.nextLine();
	}
	public static String leerEstado(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t  >>  Ingrese el estado donde vive: ");
		return sc.nextLine();
	}
	public static String leerPais(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t  >>  Ingrese el pais donde vive: ");
		return sc.nextLine();
	}

	//formulario fechas

	public static String leerDia(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n"+"\t"+"Fecha de nacimiento"+"\n");
		System.out.print("\n\t  >>  Ingrese su dia de nacimiento: ");
		return sc.nextLine();
	}
	public static String leerMes(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t  >>  Ingrese su mes de nacimiento: ");
		return sc.nextLine();
	}
	public static String leerAnio(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t  >>  Ingrese su anio de nacimiento: ");
		return sc.nextLine();
	}
}