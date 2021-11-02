import java.io.*;
import java.util.*;

// class Main {
// 	public static void main(String[] args) {
// 		System.out.println("Sistema de operar fracciones");
// 		boolean llave = false;
// 		while (llave == false) {
// 			Scanner sc = new Scanner(System.in);
// 			System.out.print("Ingresa el numerador: ");
// 			int numerador = sc.nextInt();
// 			System.out.print("Ingresa el denominador: ");
// 			int denominador = sc.nextInt();
// 			try {
// 				int operacion = numerador/denominador;
// 				System.out.println("Result = " + operacion);
// 				llave = true;
// 			} catch (ArithmeticException e) {
// 				System.out.println("No puedes dividir un numero entre 0.\nIngrese nuevos datos.");
// 			}
// 		}
// 	}
// }

// programa que convierte un string a un int

// class Main {
// 	public static void main(String[] args) {
// 		int x;
// 		String nombre = "40";
// 		try {
// 			x = Integer.parseInt(nombre);
// 			System.out.println(nombre);
// 			System.out.println("El tipo de valor se convirtio correctamente.");
// 		} catch (NumberFormatException e) {		// la variable que se coloca despues de la excepcion es un objeto
// 			System.out.println("Error en la conversion, puede haber caracteres alfabeticos o especiales.");
// 		}
// 	}
// }

//se requiere calcular la velocidad, conocidas la distancia y el tiempo definidos como enteros

// class Main {
// 	public static void main(String[] args) {
// 		int distancia = 70;
// 		int tiempo = 80;
// 		float velocidad;
// 		try {
// 			velocidad = distancia / tiempo;
// 			System.out.println(velocidad);
// 		} catch (ArithmeticException e) {
// 			System.out.println("Error en operacion.");
// 		}
// 	}
// }

//sera importante sumar los elementos de un arreglo unidimensional cuya longitud esta definida por un limite ingresado

// class Main {
// 	public static void main(String[] args) {
// 		int[] arreglo = new int[5];
// 		int acum = 0;
// 		try {
// 			for(int i = 0; i < arreglo.length; i++) {
// 				acum += arreglo[i];
// 			}
// 		} catch (ArrayIndexOutOfBoundsException e) {
// 			System.out.println("Checar valores de los indices del arreglo.");
// 		}
// 	}
// }

// dado un texto se desplegara cada uno de los caracteres utilizando substring

// class Main {
// 	public static void main(String[] args) {
// 		String nombre = "Ramiro";
// 		String caracter;
// 		try {
// 			for(int i = 0; i < nombre.length(); i++) {
// 				if(i == nombre.length() - 1) {
// 					caracter = nombre.substring(i);
// 				} else {
// 					caracter = nombre.substring(i, i + 1);
// 				}
// 			}
// 		}
// 	}
// }

//se requiere ejecutar un metodo de calcularHipotenusa() donde el objeto ha sido pasado como parametro a un metodo llamado generarResultado()

// class Main {
// 	public static void main(String[] args) {
// 		double a = 10.5;
// 		double b = 10.5;
// 		Object Triangulo = new Object();

// 		calcularHipotenusa(aa, bb);
// 		generarResultado();
// 	}

// 	public static double calcularHipotenusa(double a, double b) throws ArithmeticException {
// 		return Math.sqrt(a*a+b*b);
// 	}

// 	public static void generarResultado(Triangulo t) {
// 		try {
// 			double hipotenusa = calcularHipotenusa();
// 			System.out.println("Hipotenusa = " + hipotenusa);
// 		} catch (ArithmeticException e) {
// 			System.out.println("Error en raiz.");
// 		} catch (NullPointerException e) {
// 			System.out.println("El objeto es nulo.");
// 		}
// 	}
// }

