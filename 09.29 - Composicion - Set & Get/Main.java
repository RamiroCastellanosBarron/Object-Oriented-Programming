import java.util.*;

public class Main{
	public static void main(String[] args){

		//primero estos
		Nombre n = new Nombre(leerPrimerNombre(), leerApellidoPaterno(), leerApellidoMaterno());
		FechaNacimiento f = new FechaNacimiento(leerDia(), leerMes(), leerAnio());

		//luego la clase contenedora
		Persona p = new Persona(n,f);

		System.out.println(n);
		System.out.println(f);
	}
	public static String leerPrimerNombre(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese su primer nombre: ");
		return sc.nextLine();
	}
	public static String leerApellidoPaterno(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese su apellido paterno: ");
		return sc.nextLine();
	}
	public static String leerApellidoMaterno(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese su apellido materno: ");
		return sc.nextLine();
	}
	public static String leerDia(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el dia en que nacio: ");
		return sc.nextLine();
	}
	public static String leerMes(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el mes en que nacio: ");
		return sc.nextLine();
	}
	public static String leerAnio(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el anio en que nacio: ");
		return sc.nextLine();
	}
}