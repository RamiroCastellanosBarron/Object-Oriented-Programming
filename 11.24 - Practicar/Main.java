import java.util.InputMismatchException;
import java.util.Scanner;

// import java.util.Scanner;

// class Main {
// 	public static void main(String[] args) {
// 		boolean llave = false;
// 		float x = 0;

// 		System.out.println("\n\n\tECUACION\n");
// 		System.out.println("\n\t\tEl programa debe obtener el valor de y, con el valor de x como entrada.");
// 		System.out.format("        2 %n");
// 		System.out.format("  Y = 3X  + 7X%n%n");
		
// 		do {
// 			try {
// 				Scanner sc = new Scanner(System.in);
// 				System.out.print("  >>  Ingrese el valor de x: ");
// 				x = sc.nextFloat();
// 				llave = true;
// 				System.out.print("  >>  El valor que ha ingresado es correcto.\n\n");
// 			} catch (Exception e) {
// 				System.out.println("  >>  Tipo de error: " + e + ".\n  >>  Ingrese un valor correcto.\n");
// 			}
// 		} while (llave == false);
		
// 		try {
// 			float ecuacion = x*x*3 + 7*x;
// 			System.out.println("          2");
// 			System.out.println("Y = 3(" + x + ") + 7(" + x + ") = " + ecuacion);
// 		} catch (Exception e) {
// 			System.out.println(e);
// 		}
// 	}
// }

// class Ecuacion {
// 	private double equis;
// 	public Ecuacion (double equis) {
// 		setEquis(equis);
// 	}
// 	public void setEquis(double equis) {
// 		this.equis = equis;
// 	}
// 	public double getEquis() {
// 		return equis;
// 	}
// 	public double calculo() {
// 		double ye = equis*equis*3 + equis*7;
// 		return ye;
// 	}
// 	public String toString() {
// 		return " holis ";
// 	}
// }

// class Main {
// 	public static void main(String[] args) {
// 		Ecuacion e = new Ecuacion(7.00);
// 		e.toString();
// 	}
	// static double leerX() {
	// 	Scanner sc = new Scanner(System.in);
	// 	System.out.print("\n\n  >>  Ingresa el valor de x: ");
	// 	double x = sc.nextDouble();
	// 	sc.close();
	// 	return x;
	// }
// }

/*

leer

numero de dias
precio diario de habitacion

recibir

subtotal
descuento
total

reglas

10% --> 5 dias
15% --> 10 dias
20% --> 15 dias

*/



class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int dias = 1;
		double precio = 1;
		double subtotal = 0; 
		double descuento = 0;
		double total = 0;

		try {
			System.out.print("  >>  Ingrese la cantidad de dias de hospedaje: ");
			dias = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("  >>  Ingrese un valor entero.");
		}

		try {
			System.out.print("  >>  Ingrese el precio de hospedaje por dia: ");
			precio = sc2.nextDouble();
		} catch (Exception e) {
			System.out.println(e);
		}

		if (dias > 0 && dias <= 5) {
			System.out.println("\nNo tiene descuento.\n");
			subtotal = dias * precio;
			descuento = subtotal * 0;
			total = subtotal - descuento;
		} else if (dias > 5 && dias <= 10) {
			System.out.println("\nTiene el 10 de descuento.\n");
			subtotal = dias * precio;
			descuento = subtotal * 0.1;
			total = subtotal - descuento;
		} else if (dias <= 15) {
			System.out.println("\nTiene el 15 de descuento.\n");
			subtotal = dias * precio;
			descuento = subtotal * 0.15;
			total = subtotal - descuento;
		} else if (dias > 15) {
			System.out.println("\nTiene el 20 de descuento.\n");
			subtotal = dias * precio;
			descuento = subtotal * 0.2;
			total = subtotal - descuento;
		} else {
			System.out.println("\nNo se aplico ninguna condicional.\n");
		}

		System.out.print("Dias:        " + dias + "\n");
		System.out.print("Precio:      $" + precio + "\n");
		System.out.print("Subtotal:    $" + subtotal + "\n");
		System.out.print("Descuento:   $" + descuento + "\n");
		System.out.print("Total:       $" + total + "\n");

		sc.close();
		sc2.close();
	}
}