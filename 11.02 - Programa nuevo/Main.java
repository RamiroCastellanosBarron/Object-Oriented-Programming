import java.util.*;
import java.io.*;

abstract class Figura {
	public abstract double calcularArea();
}

class Circulo extends Figura {
	private double radio;

	public Circulo(String nomFigura, double radio) {
		setRadio(radio);
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public double calcularArea() {
		return Math.PI * radio * radio;
	}

	public String toString() {
		return " tiene un area de: " + calcularArea();
	}
}

class Triangulo extends Figura {
	private double base;
	private double altura;

	public Triangulo(String nomFigura, double base, double altura) {
		setBase(base);
		setAltura(altura);
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public double calcularArea() {
		return base * altura / 2;
	}

	public String toString() {
		return " tiene un area de: " + calcularArea();
	}
}

class Rectangulo extends Figura {
	private double base;
	private double altura;

	public Rectangulo(String nomFigura, double base, double altura) {
		setBase(base);
		setAltura(altura);
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public double calcularArea() {
		return base * altura;
	}

	public String toString() {
		return " tiene un area de: " + calcularArea();
	}
}

class Cuadrado extends Figura {
	private double lado;

	public Cuadrado(String nomFigura, double lado) {
		setLado(lado);
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public double calcularArea() {
		return lado * lado;
	}

	public String toString() {
		return " tiene un area de: " + calcularArea();
	}
}

interface validacion {
	double validarRadio();
}

class Main implements validacion {
	public static void main(String[] args) {
		Main m = new Main();
		Circulo c = new Circulo("Circulo", m.validarRadio());
		// Triangulo t = new Triangulo("Triangulo", 5, 5);
		// Rectangulo r = new Rectangulo("Rectangulo", 5, 3);
		// Cuadrado cu = new Cuadrado("Cuadrado", 7);
		System.out.println("El circulo" + c);
		// System.out.println(t);
		// System.out.println(r);
		// System.out.println(cu);
	}

	public double validarRadio() {
		double radio = 0;
		String r = "";
		boolean error = false;
		do {
			error = false;
			Scanner sc = new Scanner(System.in);
			System.out.print("Ingrese el radio, debe ser un valor numerico: ");
			try {
				radio = sc.nextDouble();
			}

			catch(InputMismatchException e) {
				System.out.println("Lo que has ingresado no es valido");
				error = true;
			}
		} while (error);
		return radio;
	}
}