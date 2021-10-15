import java.util.*;

class Main {
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