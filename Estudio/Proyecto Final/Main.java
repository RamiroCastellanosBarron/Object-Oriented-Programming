import java.util.*;
import java.io.*;

public class Main implements Serializable {

	public static void main(String[] args) {

		Nombre nombreAdministrador = new Nombre("Oscar", "Gutierrez", "Escamilla");
		Administrador cuenta1 = new Administrador("persona1", "password", nombreAdministrador, "Administrador");
		String usuario = "", contrasenia = "";
		do {
			usuario = leerUsuario();
			contrasenia = leerContrasenia();
			if (!(usuario.equals(cuenta1.getUsuario()) && contrasenia.equals(cuenta1.getContrasenia())))
				System.out.println("\n\tDatos incorrectos, intentelo de nuevo.");

		} while (!(usuario.equals(cuenta1.getUsuario()) && contrasenia.equals(cuenta1.getContrasenia())));
		char dx = ' ';
		Cartelera cartelera = null;
		do {
			dx = leerMenuPrincipal();
			switch (dx) {
				case 'C':
				case 'c':
					cuenta1.crearCartelera();
					break;
				case 'M':
				case 'm':
					Scanner sc = new Scanner(System.in);
					cartelera = obtenerCartelera();
					System.out.print("\nQue tipo de operacion deseas realizar? (A.Agregar, C.Cambiar, R.Eliminar)");
					char tipoOperacion = sc.nextLine().charAt(0);
					Funcion funcion = null;
					if (tipoOperacion == 'A' || tipoOperacion == 'a') {
						System.out.print("funcion a cambiar: ");
						funcion = new Funcion(leerTitulo(), leerIdiomas(), leerSubtitulos(), leerNoSala(),
								leerDisponibilidad(), new Fecha(19, 11, 2021), new Hora(7, 30, "PM"));
					} else if (tipoOperacion == 'C' || tipoOperacion == 'c') {
						System.out.print("funcion a cambiar: ");
						funcion = new Funcion(leerTitulo(), leerIdiomas(), leerSubtitulos(), leerNoSala(),
								leerDisponibilidad(), new Fecha(20, 11, 2021), new Hora(7, 30, "PM"));
					} else if (tipoOperacion == 'R' || tipoOperacion == 'r') {
						System.out.print("funcion a eliminar: ");
						funcion = new Funcion(leerTitulo(), leerIdiomas(), leerSubtitulos(), leerNoSala(),
								leerDisponibilidad(), new Fecha(21, 11, 2021), new Hora(7, 30, "PM"));
					}

					String titulo = sc.nextLine();
					cuenta1.modificarCartelera(cartelera, tipoOperacion, funcion);
					break;
				case 'G':
				case 'g':
					ArrayList<Boleto> boletosVendidos = obtenerBoletosVendidos();
					cartelera = obtenerCartelera();
					ArrayList<Funcion> funciones = cartelera.getFunciones();
					cuenta1.generarReporte(boletosVendidos, funciones);
					break;
				case 'O':
				case 'o':
					cuenta1.consultarReporte();
					break;

			}

		} while (dx != 'X' && dx != 'x');

	}

	static char leerMenuPrincipal() {
		Scanner sc = new Scanner(System.in);
		System.out.print(
				"\nMENU PRINCIPAL\n\tC. Crear Cartelera\n\tM. Modificar cartelera\n\tG. Generar reporte\n\tO. Consultar reporte\n\tX. Cerrar sistema\nIngresa la opcion: ");

		return sc.nextLine().charAt(0);

	}

	static char leerMenuOperador() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nMENU PRINCIPALG. Generar ticket\n\tX. Cerrar sistema\nIngresa la opcion: ");

		return sc.nextLine().charAt(0);

	}

	static String[] leerNombre() {
		Scanner sc = new Scanner(System.in);
		String[] nombre = new String[3];
		System.out.println("Nombre Completo");
		System.out.print("  >>  primer nombre: ");
		nombre[0] = sc.nextLine();
		System.out.print("  >>  Apellido paterno: ");
		nombre[1] = sc.nextLine();
		System.out.print("  >>  Apellido materno: ");
		nombre[2] = sc.nextLine();

		return nombre;
	}

	static int[] leerFecha() {
		Scanner sc = new Scanner(System.in);
		int[] fecha = new int[3];
		System.out.println("Fecha de Funcion ");
		System.out.print("  >>  Dia: ");
		fecha[0] = sc.nextInt();
		System.out.print("  >>  Mes: ");
		fecha[1] = sc.nextInt();
		System.out.print("  >>  Anio: ");
		fecha[2] = sc.nextInt();

		return fecha;
	}

	static int leerHora() {
		Scanner sc = new Scanner(System.in);
		int hora = 0;
		System.out.print("  >>  Hora: ");
		hora = sc.nextInt();

		return hora;
	}

	static int leerMinutos() {
		Scanner sc = new Scanner(System.in);
		int minuto = 0;
		System.out.print("  >> Minuto: ");
		minuto = sc.nextInt();

		return minuto;
	}

	static String leerTipo() {
		Scanner sc = new Scanner(System.in);
		String tipo = "";
		System.out.println("tipo: ");
		tipo = sc.nextLine();

		return tipo;
	}

	static String leerUsuario() {
		Scanner sc = new Scanner(System.in);
		String usuario = "";
		System.out.print("  >>  Nombre usuario: ");
		usuario = sc.nextLine();

		return usuario;
	}

	static String leerContrasenia() {
		Scanner sc = new Scanner(System.in);
		String contrasenia = "";
		System.out.print("  >>  Contrasenia: ");
		contrasenia = sc.nextLine();

		return contrasenia;
	}

	static String leerTitulo() {
		Scanner sc = new Scanner(System.in);
		String titulo = "";
		System.out.print("  >>  Titulo: ");
		titulo = sc.nextLine();

		return titulo;
	}

	static String leerIdiomas() {
		String idiomas = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("  >>  Idioma: ");
		idiomas = sc.nextLine();

		return idiomas;
	}

	static String leerSubtitulos() {
		String subtitulos = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("  >>  Subtitulos: ");
		subtitulos = sc.nextLine();

		return subtitulos;
	}

	static int leerNoSala() {
		int noSala = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero de Sala: ");
		noSala = sc.nextInt();

		return noSala;
	}

	static int leerDisponibilidad() {
		int disponibilidad = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("  >>  Asientos Disponibles: ");
		disponibilidad = sc.nextInt();

		return disponibilidad;
	}

	static int leerCapacidad() {
		Scanner sc = new Scanner(System.in);
		int capacidad = 0;
		System.out.print("  >>  Numero de Asientos en Sala: ");
		capacidad = sc.nextInt();

		return capacidad;
	}

	static int leerNumBoleto() {
		int numBoleto = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("  >>  Numero de boleto: ");
		numBoleto = sc.nextInt();

		return numBoleto;
	}

	static String leerAsiento() {
		String asiento = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Asiento: ");
		asiento = sc.nextLine();

		return asiento;
	}

	static double leerPrecio() {
		Scanner sc = new Scanner(System.in);
		double precio = 0;
		System.out.println("Precio del Boleto: ");
		precio = sc.nextDouble();

		return precio;
	}

	static int leerCantidad() {
		Scanner sc = new Scanner(System.in);
		int cantidad = 0;
		System.out.println("  >>  Cantidad de boletos: ");
		cantidad = sc.nextInt();

		return cantidad;
	}

	static String leerTituloFuncionBoleto() {
		Scanner sc = new Scanner(System.in);
		String tituloFuncionBoleto = "";
		System.out.println("  >>  Funcion del boleto: ");
		tituloFuncionBoleto = sc.nextLine();

		return tituloFuncionBoleto;
	}

	static double leerPrecioUnitario() {
		Scanner sc = new Scanner(System.in);
		double precioUnitario = 0;
		System.out.println("  >>  Precio Unitario del boleto: ");
		precioUnitario = sc.nextDouble();

		return precioUnitario;
	}

	static double leerDescuento() {
		Scanner sc = new Scanner(System.in);
		double descuento = 0;
		System.out.println("  >>  Descuento del boleto: ");
		descuento = sc.nextDouble();

		return descuento;
	}

	static ArrayList<Boleto> obtenerBoletosVendidos() {
		ArrayList<Boleto> boletos = new ArrayList();
		boletos.add(new Boleto(135,
				new Funcion("Rey Leon", "Espa�ol", "N/D", 1, 3, new Fecha(19, 11, 2021), new Hora(2, 30, "PM")), "J1",
				50, "Regular"));
		boletos.add(new Boleto(136,
				new Funcion("Rey Leon", "Espa�ol", "N/D", 1, 3, new Fecha(19, 11, 2021), new Hora(2, 30, "PM")), "J2",
				50, "Regular"));
		boletos.add(new Boleto(137,
				new Funcion("Rey Leon", "Espa�ol", "N/D", 1, 3, new Fecha(19, 11, 2021), new Hora(2, 30, "PM")), "J3",
				50, "Regular"));
		boletos.add(new Boleto(138,
				new Funcion("Star Wars", "Ingles", "N/D", 1, 3, new Fecha(19, 11, 2021), new Hora(2, 30, "PM")), "B2",
				50, "Regular"));
		boletos.add(new Boleto(139,
				new Funcion("Star Wars", "Ingles", "N/D", 1, 3, new Fecha(19, 11, 2021), new Hora(2, 30, "PM")), "B3",
				50, "Regular"));
		boletos.add(new Boleto(140,
				new Funcion("Aladdin", "Espa�ol", "N/D", 1, 3, new Fecha(19, 11, 2021), new Hora(7, 30, "PM")), "D1",
				50, "Regular"));

		return boletos;
	}

	static Cartelera obtenerCartelera() {
		Cartelera r = null;
		try {
			String ruta = "C:\\Users\\humbe\\OneDrive - Universidad Tecmilenio\\Desktop\\ITC\\3er semestre\\Programacion intermedia\\10.29 - Proyecto Final\\Base de datos\\Cartelera.dat";
			FileInputStream f = new FileInputStream(ruta);
			ObjectInputStream f2 = new ObjectInputStream(f);
			r = (Cartelera) f2.readObject();
			f2.close();
			f.close();
		} catch (EOFException e) {
			System.out.println("Se llegó al fin del archivo.");
		} catch (IOException e) {
			System.out.println("Error en el archivo.");
		} catch (ClassNotFoundException e) {
			System.out.println("Clase no definida");
		}

		return r;

	}

}