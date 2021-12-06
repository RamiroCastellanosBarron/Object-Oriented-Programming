import java.util.*;

class Fraccion {
	private double numerador;
	private double denominador;

	public Fraccion(double numerador, double denominador) {
		setNumerador(numerador);
		setDenominador(denominador);
	}
	public void setNumerador(double numerador) {
		this.numerador = numerador;
	}
	public double getNumerador() {
		return numerador;
	}
	public void setDenominador(double denominador) {
		this.denominador = denominador;
	}
	public double getDenominador() {
		return denominador;
	}
	public double calFraccion() {
		return numerador / denominador;
	}
	public String toString() {
		return "El resultado de la fraccion " + numerador + "/" + denominador + " es igual a " + calFraccion();
	}
}

class Main {
	public static void main(String args[]) {
		double n1 = 0, d1 = 0;
		double numerador = Main.pedirNumerador(n1);
		double denominador = Main.pedirDenominador(d1);
		Fraccion x = new Fraccion(numerador, denominador);
		System.out.println(x);
		System.out.println("Numerador: " + x.getNumerador());
		System.out.println("Denominador: " + x.getDenominador());
	}

	public static double pedirNumerador(double n1) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el valor de numerador: ");
		n1 = entrada.nextDouble();
		return n1;
	}

	public static double pedirDenominador(double d1) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el valor de denominador: ");
		d1 = entrada.nextDouble();
		do {
			if (d1 == 0) {
				System.out.print("Ingrese un valor diferente a 0: ");
				d1 = entrada.nextDouble();
			}
		} while (d1 == 0);
		return d1;
	}

}