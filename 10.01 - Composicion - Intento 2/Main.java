import java.text.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		DecimalFormat w = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		
		//cuenta default

		char acceso;
		char acceso2;
		char acceso3;
		int opcion;
		int opcion2;
		int opcion3;
		System.out.print("\n"+"\n"+"\t"+ "SISTEMA"+"\n"+"\n");
		System.out.print("  >>  "+ "Ingrese si desea acceder al sistema [Y/N]\n\n");
		System.out.print("Ingrese una opcion: ");
		acceso=sc.next().charAt(0);
		boolean llave = false;
		if (acceso == 'Y') {
			do {
				System.out.print("\n" +"\t" + "CUENTA" +"\n" +"\n");
				System.out.print("  1.  " + "Imprimir usuarios\n");
				System.out.print("  2.  " + "Crear usuario\n");
				System.out.print("  3.  " + "Realizar transaccion\n");
				System.out.print("  4.  " + "Salir");
				System.out.print("\n\n");
				System.out.print("  >>  " + "Ingrese una opcion: ");
				opcion=sc.nextInt();

				if (opcion == 1) {
					System.out.println("Impresion de usuarios");
					System.out.println("1. Impresion cavernicola");
					System.out.println("2. Impresion sofisticada");
					System.out.println("3. Regresar");
					System.out.print("  >>  "+ "Ingrese una opcion");
					int opcionImpresion;
					opcionImpresion=sc.nextInt();
					
					if (opcionImpresion == 1) {
						System.out.println("Impresion Cavernicola");
						Name n = new Name("Ramiro", "Castellanos", "Barron");
						DateOfBirth dob = new DateOfBirth(2, 5, 2000);
						Address add = new Address("La Gloria", 220, "Hacienda del Rosario", "San Pedro Garza Garcia", 66247);
						DateOfExpiry doe = new DateOfExpiry(1, 8, 2024);
						Customer cus = new Customer(n, dob, add, "8120800336", "ramiro.castellanos@udem.edu", "CABR000502HNLSRMA9");
						Account acc = new Account(cus, 606938, "Oro", "Pesos mexicanos", 3.00f, 5000.00f, doe, 7000.00f);
						System.out.print("\n" + "  >>  "+ "Nombre completo: " + acc.getCustomer().getName().getFirstName() + " " + acc.getCustomer().getName().getFatherLastName() + " " + acc.getCustomer().getName().getMotherLastName() + "." +"\n" + "  >>  " + "Fecha de nacimiento: " + acc.getCustomer().getDateOfBirth().getBDay()+ "." + acc.getCustomer().getDateOfBirth().getBMonth() + "." + acc.getCustomer().getDateOfBirth().getBYear() + "\n" + "  >>  "+ "Direccion: " + acc.getCustomer().getAddress().getStreet() + " " + acc.getCustomer().getAddress().getAddNumber() + ", " + acc.getCustomer().getAddress().getPostalCode() + ", " + acc.getCustomer().getAddress().getSuburb() + ", " + acc.getCustomer().getAddress().getCity() + "."+"\n" + "  >>  "+ "Su telefono es: " + acc.getCustomer().getPhone()+"\n"+"  >>  "+ "Tu correo es: " + acc.getCustomer().getEmail()+"\n"+"  >>  "+ "CURP: " + acc.getCustomer().getCurp() +"\n" + "  >>  "+ "Tu numero de identificacion es: " + acc.getAccountId() +"\n"+"  >>  "+ "Tu tipo de moneda es: " + acc.getCurrency() + "." +"\n"+"  >>  "+ "Tu tasa de interes anual es: " + acc.getAnnualInterestRate() +"\n"+"  >>  "+ "Tu saldo minimo requerido es: " + acc.getMinBalanceReq() +"\n"+"  >>  "+ "Tu cuenta se vence el: " + acc.getDateOfExpiry().getEDay()+ "." + acc.getDateOfExpiry().getEMonth()+ "." + acc.getDateOfExpiry().getEYear()+"\n"+"  >>  "+ "Tu saldo actual es: ...\n\n");
					}
					
					if (opcionImpresion == 2) {
						System.out.println("Impresion Sofisticada");
						Name n2 = new Name("Ramiro", "Castellanos", "Barron");
						DateOfBirth dob2 = new DateOfBirth(2, 5, 2000);
						Address add2 = new Address("La Gloria", 220, "Hacienda del Rosario", "San Pedro Garza Garcia", 66247);
						DateOfExpiry doe2 = new DateOfExpiry(1, 8, 2024);
						Customer cus2 = new Customer(n2, dob2, add2, "8120800336", "ramiro.castellanos@udem.edu", "CABR000502HNLSRMA9");
						Account acc2 = new Account(cus2, 606938, "Oro", "Pesos mexicanos", 3.00f, 5000.00f, doe2, 7000.00f);
						System.out.print("  >>  "+ "Nombre completo: " + acc2.getCustomer().getName().toString()+"\n"+"  >>  "+ "Fecha de nacimiento: " + acc2.getCustomer().getDateOfBirth().toString()+"\n"+"  >>  "+ "Direccion: " + acc2.getCustomer().getAddress().toString()+ "."+"\n"+ acc2.getCustomer().toString()+"\n"+"  >>  "+ "Tipo de moneda: " + acc2.getCurrency() +"\n"+"  >>  "+ "Tasa de interes anual: " + acc2.getAnnualInterestRate()+"\n"+"  >>  "+ "Saldo minimo requerido: " + acc2.getMinBalanceReq()+"\n"+"  >>  "+ "Fecha de vencimiento de cuenta: " + acc2.getDateOfExpiry().toString()+"\n"+"\n");
					}
				}
				
				if (opcion == 2) {
					System.out.println("Creacion de usuarios");
					System.out.println("1. Crear un usuario");
					System.out.println("2. Regresar");
					System.out.print("  >>  "+ "Ingrese una opcion");
					int opcionCrear = sc.nextInt();
					if (opcionCrear == 1) {
						System.out.println("Procedimiento de creacion de usuarios");
					}
				}

				if (opcion == 3) {
					Address add3 = new Address("La Gloria", 220, "Hacienda del Rosario", "San Pedro Garza Garcia", 66247);
					DateOfBirth dob3 = new DateOfBirth(2, 5, 2000);
					Name n3 = new Name("Ramiro", "Castellanos", "Barron");
					DateOfExpiry doe3 = new DateOfExpiry(1, 8, 2025);
					Customer cus3 = new Customer(n3, dob3, add3, "8120800336", "ramiro.castellanos@udem.edu", "CABR000502HNLSRMA9");
					Account acc3 = new Account(cus3, 606938, "Oro", "Pesos mexicanos", 3.00f, 5000.00f, doe3, 7000.00f);
					String respuesta = "Si";
					while (respuesta.equals("Si")) {

						String clave = validarRespTrans(imprimirMenu());

						int opcionTransaccion = sc.nextInt();
						
						if (opcionTransaccion == 1) {
							System.out.println("Depositar dinero");	
						}
						if (opcionTransaccion == 2) {
							System.out.println("Retirar dinero");	
						}
					}
					
				}		
			} while (opcion != 4);
		} 
		System.out.print("\n"+"\n"+"\t"+ "ADIOS"+"\n"+"\n");
	}
	
	static void imprimirMenu() {
		System.out.println("Realizar transacción");
		System.out.println("1. Depositar");
		System.out.println("2. Retirar");
		System.out.println("3. Regresar");
	}

	//metodo para leer y validar la opcion ingresada
	static int validarRespTrans(String mensaje) {
		Scanner sc = new Scanner(System.in);
		int variable = 1;
		boolean valid = false;

		while (valid == false) {
			System.out.println(mensaje);
			variable = sc.nextInt();
			if (variable == 1 || variable == 2) {
				valid = true;
			} else {
				System.out.println("\nDebes ingresar solamente 1 o 2.");
			}
		}
		return variable;
	}

	//metodo para leer y validar la respuesta del ciclo
	static String validarRespFin(String mensaje) {
		Scanner sc = new Scanner(System.in);
		String variable = "h";
		boolean valid = false;

		while (!valid) {
			System.out.println(mensaje);
			variable = sc.nextLine();
			if (variable.equals("s") || variable.equals("n")) {
				valid = true;
			} else {
				System.out.println("\n Debes ingresar solamente (S/N)");
			}
		}
		return variable;
	}
}
