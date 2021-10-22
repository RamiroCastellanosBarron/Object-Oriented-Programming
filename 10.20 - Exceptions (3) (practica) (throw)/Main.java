import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("  >>  Ingrese su edad: ");
		int edad = sc.nextInt();
		verificarEdad(edad);
		sc.close();
	}

	static void verificarEdad(int edad) {
		if(edad < 18) {
			throw new ArithmeticException("No eres mayor de edad.");
		} else {
			System.out.println("Tu edad cumple los requerimientos.");
		}
	}
}