import java.text.DecimalFormat;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		DecimalFormat w = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Productos p[] = new Productos[4];
		p[0] = new Productos(1163, "Keratina", "PIEZAS", "VIDA PIEL MULTIVITAMINICO PRO-KERATINA 60 CAPLETAS", 353.45f);
		p[1] = new Productos(283, "Shampoo Sabal", "PIEZAS", "DUCRAY SABAL SHAMPOO 200ML", 250.00f);
		p[2] = new Productos(1663, "Keratocleanser 100gr", "PIEZAS", "REVIVITAL KERATOCLEANSER 100G", 387.93f);
		p[3] = new Productos(1, " ", "PIEZAS", " ", 0.00f);
		imprimirEncabezadoCatalogoProductos();
		for(int i = 0; i < 3; i++) {
			p[i].mostrarProductos();
		}
		imprimirBaseCatalogoProductos();
		String opcion = "s";
		double subTotalFinal = 0;
		String opcionUsuario = "s";
		int cantidadProducto = 0;
		int contadorNumDetalle = 0;
		int productoSeleccionado = 0;
		Detalle detalle[] = new Detalle[5];
		for(int i = 0; i < detalle.length; i++) {
			detalle[i] = new Detalle(p[3], 0, 0);
		}
		int detallesFaltantes = 0;
		do {
			System.out.print("\n  >>  " + "Ingrese el ID del producto por agregar: ");
			int idProductoIngresar;
			idProductoIngresar = sc.nextInt();
			if(idProductoIngresar == p[0].getIdProducto()) {
				System.out.print("\n  >>  " + "Ingrese la cantidad de piezas de " + p[0].getNomProducto() + ": ");
				cantidadProducto = sc.nextInt();
				productoSeleccionado = 0;
				detalle[contadorNumDetalle] = new Detalle(p[productoSeleccionado], cantidadProducto, p[productoSeleccionado].getPrecio()*cantidadProducto);
			}
			if(idProductoIngresar == p[1].getIdProducto()) {
				System.out.print("\n  >>  " + "Ingrese la cantidad de piezas de " + p[1].getNomProducto() + ": ");
				cantidadProducto = sc.nextInt();
				productoSeleccionado = 1;
				detalle[contadorNumDetalle] = new Detalle(p[productoSeleccionado], cantidadProducto, p[productoSeleccionado].getPrecio()*cantidadProducto);
			}
			if(idProductoIngresar == p[2].getIdProducto()) {
				System.out.print("\n  >>  " + "Ingrese la cantidad de piezas de " + p[2].getNomProducto() + ": ");
				cantidadProducto = sc.nextInt();
				productoSeleccionado = 2;
				detalle[contadorNumDetalle] = new Detalle(p[productoSeleccionado], cantidadProducto, p[productoSeleccionado].getPrecio()*cantidadProducto);
			}

			double[] subTotal = new double[5];
			for(int i = 0; i < detalle.length; i++) {
				subTotal[i] = detalle[i].getImporte();
			}
			subTotalFinal = subTotal[0] + subTotal[1] + subTotal[2] + subTotal[3] + subTotal[4];
			System.out.println(subTotalFinal);


			//imprimir ticket
			String formatoSubtotalDetalle = "%105s | %-12s | %11s |%n";
			imprimirDetalleTicket();
			for(int i = 0; i < contadorNumDetalle+1; i++) {
				detalle[i].mostrarDetalle();
			}
			imprimirPieDetalleTicket();
			System.out.printf(formatoSubtotalDetalle, " ", "SUBTOTAL", w.format(subTotalFinal) + "$");
			imprimirSubtotalDetallePie();
			

			//pedir opcion para continuar
			imprimirOpcionCaptura();
			opcionUsuario = sc2.nextLine();


			contadorNumDetalle++;

		} while (opcionUsuario.equals("s"));
		double impuestoTicket = 0;
		double totalTicket = 0;
		double cantidadDescuento = 0f;
		double porcentajeDescuento = 0f;
		double numDescuento = 0f;
		imprimirAplicacionDescuento();
		opcion = sc3.nextLine();
		String formatoTicket = "%41s | %-22s | %18s |%n";
		
		if(opcion.equals("s")) {
			System.out.print("\n  >>  Ingrese el porcentaje de descuento: ");
			numDescuento = sc3.nextDouble();
			porcentajeDescuento = numDescuento/100;
			cantidadDescuento = porcentajeDescuento*subTotalFinal;
			subTotalFinal = subTotalFinal - cantidadDescuento;
			impuestoTicket = subTotalFinal*0.16f;
			totalTicket = subTotalFinal + impuestoTicket;
			imprimirTicket();
			System.out.printf(formatoTicket, " ", "DESCUENTO:", numDescuento + "%");
			System.out.printf(formatoTicket, " ", "SUBTOTAL:", "$" + w.format(subTotalFinal));
			System.out.printf(formatoTicket, " ", "IVA 16%:", "$" + w.format(impuestoTicket));
			System.out.printf(formatoTicket, " ", "TOTAL:", "$" + w.format(totalTicket));
			imprimirPieTicket();
		} else if (opcion.equals("n")) {
			impuestoTicket = subTotalFinal*0.16f;
			totalTicket = subTotalFinal + impuestoTicket;
			imprimirTicket();
			System.out.printf(formatoTicket, " ", "DESCUENTO:", w.format(0) + "%");
			System.out.printf(formatoTicket, " ", "SUBTOTAL:", "$" + w.format(subTotalFinal));
			System.out.printf(formatoTicket, " ", "IVA 16%:", "$" + w.format(impuestoTicket));
			System.out.printf(formatoTicket, " ", "TOTAL:", "$" + w.format(totalTicket));
			imprimirPieTicket();
		}
		imprimirMensajeAdios();
	}
	public static void imprimirEncabezadoCatalogoProductos() {
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.format("|                                                         CATALOGO DE PRODUCTOS                                                        |%n");
		System.out.format("+--------+----------------------+-------------------------------------------------------------------+------------------+---------------+%n");
		System.out.format("|   ID   |        NOMBRE        |                              DESCRIPCION                          |      UNIDAD      |     PRECIO    |%n");
		System.out.format("+--------+----------------------+-------------------------------------------------------------------+------------------+---------------+%n");
	}
	public static void imprimirBaseCatalogoProductos() {
		System.out.format("+--------+----------------------+-------------------------------------------------------------------+------------------+---------------+%n");
	}
	public static void imprimirOpcionCaptura() {
		System.out.print("\n\n\n");
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.format("|                                                   DESEA INGRESAR UN PRODUCTO?                                                        |%n");
		System.out.format("+-----------------------------------------------------------------+--------------------------------------------------------------------+%n");
		System.out.format("|                              SI = s                             |                                 NO = n                             |%n");
		System.out.format("+-----------------------------------------------------------------+--------------------------------------------------------------------+%n");
		System.out.println();
		System.out.print("  >>  Ingrese su opcion: ");
	}
	public static void imprimirMensajeAdios() {
		System.out.print("\n\n\n");
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.format("|                                                               ADIOS                                                                  |%n");
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
	}
	public static void imprimirDetalleTicket() {
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.format("|                                                              DETALLE                                                                 |%n");
		System.out.format("+-------------+----------+----------+---------------------------------------------------------------------+--------------+-------------+%n");
		System.out.format("|  Cantidad   |  Clave   |  Unidad  |   Descripcion                                                       |    Precio    |   Importe   |%n");
		System.out.format("+-------------+----------+----------+---------------------------------------------------------------------+--------------+-------------+%n");
	}
	public static void imprimirPieDetalleTicket() {
		System.out.format("+-------------+----------+----------+---------------------------------------------------------------------+--------------+-------------+%n");
	}
	public static void imprimirAplicacionDescuento() {
		System.out.print("\n\n\n");
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.format("|                                                   DESEA APLICAR UN DESCUENTO                                                         |%n");
		System.out.format("+-----------------------------------------------------------------+--------------------------------------------------------------------+%n");
		System.out.format("|                              SI = s                             |                                 NO = n                             |%n");
		System.out.format("+-----------------------------------------------------------------+--------------------------------------------------------------------+%n");
		System.out.println();
		System.out.print("  >>  Ingrese su opcion: ");
	}
	public static void imprimirTicket() {
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.format("|                                                               TICKET                                                                 |%n");
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.println("\n");
		System.out.format("                                          +------------------------+--------------------+%n");
		
	}
	public static void imprimirPieTicket() {
		System.out.format("                                          +------------------------+--------------------+%n");
	}
	public static void imprimirSubtotalDetallePie() {
		System.out.format("                                                                                                          +--------------+-------------+%n");
	}
}