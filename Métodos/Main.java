import java.text.DecimalFormat;
import java.util.*;

class Main {

	//             VOID

	//primera forma-------------------------------------------------------

	// public static void main(String[] args){
	// 	imprimir();
	// }

	// static void imprimir(){
	// 	System.out.println("Hola mundo");
	// }

	//segunda forma-------------------------------------------------------

	// public static void main(String[] args){
	// 	Scanner sc=new Scanner(System.in);
	// 	System.out.println("\n"+"\n"+"\t"+"PROGRAMA"+"\n");
	// 	String pn,sn;
	// 	System.out.print("Ingresa tu primer nombre: ");
	// 	pn=sc.nextLine();
	// 	System.out.print("Ingresa tu segundo nombre: ");
	// 	sn=sc.nextLine();
	// 	imprimir(pn,sn);

	// }
	
	// static void imprimir(String primerNombre, String segundoNombre){
	// 	System.out.println("Tu primer nombre es: "+primerNombre);
	// 	System.out.println("Tu segundo nombre es: "+segundoNombre);
	// }

	//             RETURN

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("\n"+"\n"+"\t"+"PROGRAMA QUE CALCULA EL AREA DE UN CUADRADO"+"\n");
		double altura,base;
		System.out.println("Ingresa la altura del rectangulo: ");
		altura=sc.nextDouble();
		System.out.println("Ingresa la base del rectangulo: ");
		base=sc.nextDouble();
		double resultado=calcular(altura,base);
		imprimir(resultado);
	}

	static double calcular(double h, double b){
		double operacion=h*b;
		return operacion;
	}

	static void imprimir(double res){
		System.out.println("El resultado de la operacion es: "+res);
	}
}