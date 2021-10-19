import java.text.DecimalFormat;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		DecimalFormat w = new DecimalFormat("#,###,###.00");
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		Productos p[] = new Productos[11];
		p[0] = new Productos(1163, "Keratina", "PIEZAS", "VIDA PIEL MULTIVITAMINICO PRO-KERATINA 60 CAPLETAS", 353.45f);
		p[1] = new Productos(283, "Shampoo Sabal", "PIEZAS", "DUCRAY SABAL SHAMPOO 200ML", 250.00f);
		p[2] = new Productos(1663, "Keratocleanser 100gr", "PIEZAS", "REVIVITAL KERATOCLEANSER 100G", 387.93f);
		p[3] = new Productos(332, "Cinta de medir", "PIEZAS", "CINTA DE MEDIR DELL DE 5MTS", 799.99f);
		p[4] = new Productos(1140, "Aromatizante carro", "PIEZAS", "AROMATIZANTE SUAVITEL COMPATIBLE", 64.50f);
		p[5] = new Productos(63, "Audifonos Sony", "PIEZAS", "AUDIFONOS SONY S-495 ECONOMICOS", 299.99f);
		p[6] = new Productos(289, "Monitor 1080p", "PIEZAS", "MONITOR LENOVO 23 PULGADAS 1080P", 15499.99f);
		p[7] = new Productos(765, "Mochila Laptop", "PIEZAS", "MALETA DE LAPTOP DE 15 PULGADAS", 899.49f);
		p[8] = new Productos(21, "Camisa UDEM", "PIEZAS", "CAMISA TROYANO PEQUENIO DE ADULTO", 649.00f);
		p[9] = new Productos(497, "Bosina BT", "PIEZAS", "BOCINA BLUETOOTH PORTABLES", 1349.25f);
		p[10] = new Productos(1, " ", "PIEZAS", " ", 0.00f);

		//mostramos los productos
		imprimirEncabezadoCatalogoProductos();
		for(int i = 0; i < p.length - 1; i++) {
			p[i].mostrarProductos();
		}
		imprimirBaseCatalogoProductos();

		//variables para el siguiente ciclo
		String opcion = "s";
		double subTotalFinal = 0;
		boolean llave = false;
		boolean llaveDetalle = false;
		String opcionUsuario = "s";
		int cantidadProducto = 0;
		int contadorNumDetalle = 0;
		int productoSeleccionado = 0;
		Detalle detalle[] = new Detalle[5];
		int idProductoIngresar;
		int detallesFaltantes = 0;

		//llenado vacio de detalles
		for(int i = 0; i < detalle.length; i++) {
			detalle[i] = new Detalle(p[10], 0, 0);
		}


		do {
			System.out.print("\n  >>  " + "Ingrese el ID del producto por agregar: ");
			idProductoIngresar = sc.nextInt();
			if(idProductoIngresar == p[0].getIdProducto() || idProductoIngresar == p[1].getIdProducto() || idProductoIngresar == p[2].getIdProducto() || idProductoIngresar == p[3].getIdProducto() || idProductoIngresar == p[4].getIdProducto() || idProductoIngresar == p[5].getIdProducto() || idProductoIngresar == p[5].getIdProducto() || idProductoIngresar == p[6].getIdProducto() || idProductoIngresar == p[7].getIdProducto() || idProductoIngresar == p[8].getIdProducto() || idProductoIngresar == p[9].getIdProducto()) {
				llaveDetalle = true;
				if(idProductoIngresar == p[0].getIdProducto()) {
					System.out.print("\n  >>  " + "Ingrese la cantidad de piezas de " + p[0].getNomProducto() + ": ");
					cantidadProducto = sc.nextInt();
					productoSeleccionado = 0;
					detalle[contadorNumDetalle] = new Detalle(p[productoSeleccionado], cantidadProducto, p[productoSeleccionado].getPrecio()*cantidadProducto);
					contadorNumDetalle++;
				} else if(idProductoIngresar == p[1].getIdProducto()) {
					System.out.print("\n  >>  " + "Ingrese la cantidad de piezas de " + p[1].getNomProducto() + ": ");
					cantidadProducto = sc.nextInt();
					productoSeleccionado = 1;
					detalle[contadorNumDetalle] = new Detalle(p[productoSeleccionado], cantidadProducto, p[productoSeleccionado].getPrecio()*cantidadProducto);
					contadorNumDetalle++;
				} else if (idProductoIngresar == p[2].getIdProducto()) {
					System.out.print("\n  >>  " + "Ingrese la cantidad de piezas de " + p[2].getNomProducto() + ": ");
					cantidadProducto = sc.nextInt();
					productoSeleccionado = 2;
					detalle[contadorNumDetalle] = new Detalle(p[productoSeleccionado], cantidadProducto, p[productoSeleccionado].getPrecio()*cantidadProducto);
					contadorNumDetalle++;
				} else if (idProductoIngresar == p[3].getIdProducto()) {
					System.out.print("\n  >>  " + "Ingrese la cantidad de piezas de " + p[3].getNomProducto() + ": ");
					cantidadProducto = sc.nextInt();
					productoSeleccionado = 3;
					detalle[contadorNumDetalle] = new Detalle(p[productoSeleccionado], cantidadProducto, p[productoSeleccionado].getPrecio()*cantidadProducto);
					contadorNumDetalle++;
				} else if (idProductoIngresar == p[4].getIdProducto()) {
					System.out.print("\n  >>  " + "Ingrese la cantidad de piezas de " + p[4].getNomProducto() + ": ");
					cantidadProducto = sc.nextInt();
					productoSeleccionado = 4;
					detalle[contadorNumDetalle] = new Detalle(p[productoSeleccionado], cantidadProducto, p[productoSeleccionado].getPrecio()*cantidadProducto);
					contadorNumDetalle++;
				} else if (idProductoIngresar == p[5].getIdProducto()) {
					System.out.print("\n  >>  " + "Ingrese la cantidad de piezas de " + p[5].getNomProducto() + ": ");
					cantidadProducto = sc.nextInt();
					productoSeleccionado = 5;
					detalle[contadorNumDetalle] = new Detalle(p[productoSeleccionado], cantidadProducto, p[productoSeleccionado].getPrecio()*cantidadProducto);
					contadorNumDetalle++;
				} else if (idProductoIngresar == p[6].getIdProducto()) {
					System.out.print("\n  >>  " + "Ingrese la cantidad de piezas de " + p[6].getNomProducto() + ": ");
					cantidadProducto = sc.nextInt();
					productoSeleccionado = 6;
					detalle[contadorNumDetalle] = new Detalle(p[productoSeleccionado], cantidadProducto, p[productoSeleccionado].getPrecio()*cantidadProducto);
					contadorNumDetalle++;
				} else if (idProductoIngresar == p[7].getIdProducto()) {
					System.out.print("\n  >>  " + "Ingrese la cantidad de piezas de " + p[7].getNomProducto() + ": ");
					cantidadProducto = sc.nextInt();
					productoSeleccionado = 7;
					detalle[contadorNumDetalle] = new Detalle(p[productoSeleccionado], cantidadProducto, p[productoSeleccionado].getPrecio()*cantidadProducto);
					contadorNumDetalle++;
				} else if (idProductoIngresar == p[8].getIdProducto()) {
					System.out.print("\n  >>  " + "Ingrese la cantidad de piezas de " + p[8].getNomProducto() + ": ");
					cantidadProducto = sc.nextInt();
					productoSeleccionado = 8;
					detalle[contadorNumDetalle] = new Detalle(p[productoSeleccionado], cantidadProducto, p[productoSeleccionado].getPrecio()*cantidadProducto);
					contadorNumDetalle++;
				} else if (idProductoIngresar == p[9].getIdProducto()) {
					System.out.print("\n  >>  " + "Ingrese la cantidad de piezas de " + p[9].getNomProducto() + ": ");
					cantidadProducto = sc.nextInt();
					productoSeleccionado = 9;
					detalle[contadorNumDetalle] = new Detalle(p[productoSeleccionado], cantidadProducto, p[productoSeleccionado].getPrecio()*cantidadProducto);
					contadorNumDetalle++;
				} 
			} else if (idProductoIngresar != p[0].getIdProducto() && idProductoIngresar != p[1].getIdProducto() && idProductoIngresar != p[2].getIdProducto() && idProductoIngresar != p[3].getIdProducto() && idProductoIngresar != p[4].getIdProducto() && idProductoIngresar != p[5].getIdProducto() && idProductoIngresar != p[6].getIdProducto() && idProductoIngresar != p[7].getIdProducto() && idProductoIngresar != p[8].getIdProducto() && idProductoIngresar != p[9].getIdProducto()) {
				llaveDetalle = false;
				imprimirAvisoInvalido();
			}
			double[] subTotal = new double[5];
			if(llaveDetalle == true) {
				for(int i = 0; i < detalle.length; i++) {
					subTotal[i] = detalle[i].getImporte();
				}
				subTotalFinal = subTotal[0] + subTotal[1] + subTotal[2] + subTotal[3] + subTotal[4];
				//imprimir ticket
				String formatoSubtotalDetalle = "%105s | %-12s | %11s |%n";
				imprimirDetalleTicket();
				for(int i = 0; i < contadorNumDetalle; i++) {
					detalle[i].mostrarDetalle();
				}
				imprimirPieDetalleTicket();
				System.out.printf(formatoSubtotalDetalle, " ", "SUBTOTAL:", "$" + w.format(subTotalFinal));
				imprimirSubtotalDetallePie();
				//pedir opcion para continuar
				if(contadorNumDetalle < 5) {
					do {
						llave = false;
						imprimirOpcionCaptura();
						opcionUsuario = sc2.nextLine();
						if (!opcionUsuario.equals("n")) {
							if (!opcionUsuario.equals("s")) {
								imprimiropcionInvalida();
								llave = false;
							}
						}
						if(opcionUsuario.equals("s")) {
							llave = true;
						}
						if(opcionUsuario.equals("n")) {
							llave = true;
						}
					} while (llave == false);
				}
			}
			llaveDetalle = true;
		} while (opcionUsuario.equals("s") && llaveDetalle == true && contadorNumDetalle < 5);

		if(opcionUsuario.equals("s")) {
			imprimirLimiteDetallesTicket();
		}
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
		imprimirOpcionRealizarFactura();
		opcion = sc4.nextLine();
		if (opcion.equals("s")) {
			String formatoDatosCliente = "| %-28s | %63s | %-35s |%n";
			imprimirTituloDatosCliente();

			//prueba
			// Nombre nombrePrueba = new Nombre("Ramiro", "Castellanos", "Barron");
			// imprimirFechaNacimiento();
			// Fecha fechaPrueba = new Fecha("02", "05", "2000");
			// imprimirTituloDatosDireccion();
			// Direccion direccionPrueba = new Direccion("La Gloria", "220", "Hacienda del Rosario", "San Pedro", "Nuevo Leon", "66247");
			// Fecha fechaEmision = new Fecha("18", "10", "2021");
			// imprimirDatosFactura();
			// Cliente cliente = new Cliente(nombrePrueba, fechaPrueba, direccionPrueba);

			//bueno
			Nombre nombreCliente = new Nombre(leerNombreCliente(), leerApellidoPaternoCliente(), leerApellidoMaternoCliente());
			imprimirFechaNacimiento();
			Fecha fechaNacimiento =  new Fecha(leerDia(), leerMes(), leerAnio());
			imprimirTituloDatosDireccion();
			Direccion direccionCliente = new Direccion(leerCalle(), leerNumExterior(), leerColonia(), leerMunicipio(), leerEstado(), leerCodigoPostal());
			Cliente cliente = new Cliente(nombreCliente, fechaNacimiento, direccionCliente);
			imprimirDatosFactura();
			Fecha fechaEmision = new Fecha(leerDia(), leerMes(), leerAnio());
			// Factura factura = new Factura(detalle, fechaEmision, subTotalFinal, numDescuento, impuestoTicket, totalTicket, cliente);

			Factura factura = new Factura(detalle, fechaEmision, subTotalFinal, numDescuento, impuestoTicket, totalTicket, cliente);
			imprimirEncabezadoFactura();
			System.out.printf(formatoDatosCliente, factura.getCliente().getNombre().getPrimerNombre() + " " + factura.getCliente().getNombre().getAPaterno() + " " + factura.getCliente().getNombre().getAMaterno(), " ", "Numero de factura: A 3798");
			System.out.printf(formatoDatosCliente, factura.getCliente().rfc(), " ", fechaEmision.getDia() + "-" + fechaEmision.getMes() + "-" + fechaEmision.getAnio());
			System.out.printf(formatoDatosCliente, factura.getCliente().getDireccion().getCalle() + " " + factura.getCliente().getDireccion().getNoExterior() + ", " + factura.getCliente().getDireccion().getCodigoP() + "," , " ", "Numero de cliente: #27");
			System.out.printf(formatoDatosCliente, factura.getCliente().getDireccion().getMunicipio() + ", " + factura.getCliente().getDireccion().getEstado(), " ", " ");
			imprimirPieEncabezadoFactura();

			imprimirDetalleTicket();

			int otroCont = 0;
			while(contadorNumDetalle > 0) {
				factura.mostrarDetallesFactura(contadorNumDetalle, detalle[otroCont].getCantidad(), detalle[otroCont].getProductos().getIdProducto(), detalle[otroCont].getProductos().getUnidad(), detalle[otroCont].getProductos().getDescripcion(), detalle[otroCont].getProductos().getPrecio(), detalle[otroCont].getImporte());
				otroCont++;
				contadorNumDetalle--;
			}
			imprimirPieDetalleTicket();
			System.out.println();

			imprimirSubtotalDetallePie();
			factura.mostrarDatosFactura();
			imprimirSubtotalDetallePie();


		} else if (opcion.equals("no")) {
			System.out.println("params");
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
		System.out.print("\n");
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
	public static void imprimirOpcionRealizarFactura() {
		System.out.print("\n");
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.format("|                                                   DESEA REALIZAR LA FACTURA?                                                         |%n");
		System.out.format("+-----------------------------------------------------------------+--------------------------------------------------------------------+%n");
		System.out.format("|                              SI = s                             |                                 NO = n                             |%n");
		System.out.format("+-----------------------------------------------------------------+--------------------------------------------------------------------+%n");
		System.out.println();
		System.out.print("  >>  Ingrese su opcion: ");
	}
	public static void imprimirTituloDatosCliente() {
		System.out.print("\n");
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.format("|                                                         DATOS DEL CLIENTE                                                            |%n");
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.format("|                                                              NOMBRE                                                                  |%n");
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.println();
	}
	public static void imprimirDatosFactura() {
		System.out.print("\n");
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.format("|                                                       DATOS DE LA FACTURA                                                            |%n");
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.format("|                                                         FECHA DE EMISION                                                             |%n");
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.println();
	}
	public static void imprimirTituloDatosDireccion() {
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.format("|                                                            DIRECCION                                                                 |%n");
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.println();
	}
	public static void imprimirFechaNacimiento() {
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.format("|                                                      FECHA DE NACIMIENTO                                                             |%n");
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.println();
	}
	public static String leerNombreCliente() {
		Scanner sc = new Scanner(System.in);
		System.out.print("  >>  Ingrese su primer nombre: ");
		String primerNombre = sc.nextLine();
		System.out.println();
		return primerNombre;
	}
	public static String leerApellidoPaternoCliente() {
		Scanner sc = new Scanner(System.in);
		System.out.print("  >>  Ingrese su apellido paterno: ");
		String apellidoPaterno = sc.nextLine();
		System.out.println();
		return apellidoPaterno;
	}
	public static String leerApellidoMaternoCliente() {
		Scanner sc = new Scanner(System.in);
		System.out.print("  >>  Ingrese su apellido materno: ");
		String apellidoMaterno = sc.nextLine();
		System.out.println();
		return apellidoMaterno;
	}
	public static String leerDia() {
		Scanner sc = new Scanner(System.in);
		System.out.print("  >>  Ingrese el dia: ");
		String dia = sc.nextLine();
		System.out.println();
		return dia;
	}
	public static String leerMes() {
		Scanner sc = new Scanner(System.in);
		System.out.print("  >>  Ingrese el mes: ");
		String mes = sc.nextLine();
		System.out.println();
		return mes;
	}
	public static String leerAnio() {
		Scanner sc = new Scanner(System.in);
		System.out.print("  >>  Ingrese el anio: ");
		String anio = sc.nextLine();
		System.out.println();
		return anio;
	}
	public static String leerCalle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("  >>  Ingrese su calle: ");
		String calle = sc.nextLine();
		System.out.println();
		return calle;
	}
	public static String leerNumExterior() {
		Scanner sc = new Scanner(System.in);
		System.out.print("  >>  Ingrese su numero exterior: ");
		String numExterior = sc.nextLine();
		System.out.println();
		return numExterior;
	}
	public static String leerColonia() {
		Scanner sc = new Scanner(System.in);
		System.out.print("  >>  Ingrese su colonia: ");
		String colonia = sc.nextLine();
		System.out.println();
		return colonia;
	}
	public static String leerMunicipio() {
		Scanner sc = new Scanner(System.in);
		System.out.print("  >>  Ingrese su municipio: ");
		String municipio = sc.nextLine();
		System.out.println();
		return municipio;
	}
	public static String leerEstado() {
		Scanner sc = new Scanner(System.in);
		System.out.print("  >>  Ingrese su estado: ");
		String estado = sc.nextLine();
		System.out.println();
		return estado;
	}
	public static String leerCodigoPostal() {
		Scanner sc = new Scanner(System.in);
		System.out.print("  >>  Ingrese su codigo postal: ");
		String codigoPostal = sc.nextLine();
		System.out.println();
		return codigoPostal;
	}
	public static String leerNombreEmpresa() {
		Scanner sc = new Scanner(System.in);
		System.out.print("  >>  Ingrese el nombre de la empresa: ");
		String nombreEmpresa = sc.nextLine();
		System.out.println();
		return nombreEmpresa;
	}
	public static void imprimirAvisoInvalido() {
		System.out.print("\n");
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.format("|                                                          ID INVALIDO                                                                 |%n");
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.println();
	}
	public static void imprimiropcionInvalida() {
		System.out.print("\n");
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.format("|                                                      OPCION INVALIDA                                                                 |%n");
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.println();
	}
	public static void imprimirLimiteDetallesTicket() {
		System.out.print("\n");
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.format("|                                         HAS LLEGADO AL LIMITE DE DETALLES POR TICKET                                                 |%n");
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.println();
	}
	public static void imprimirEncabezadoFactura() {
		System.out.print("\n");
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.format("|                                                           FACTURA                                                                    |%n");
		System.out.format("+--------------------------------------------------------------------------------------------------------------------------------------+%n");
		System.out.println();
		System.out.format("+------------------------------+                                                                 +-------------------------------------+%n");
		System.out.format("|                              |                                                                 |                                     |%n");
		System.out.format("|        E M P R E S A         |                                                                 |  Empresa Demostrativa, S.A. de C.V. |%n");
		System.out.format("|   D E M O S T R A T I V A,   |                                                                 |                      PEGM6605301J10 |%n");
		System.out.format("|        S.A. DE C.V.          |                                                                 |                    Antonio Caso 161 |%n");
		System.out.format("|                              |                                                                 |        66400, Monterrey, Nuevo Leon |%n");
		System.out.format("|                              |                                                                 |                                     |%n");
		System.out.format("+------------------------------+                                                                 +-------------------------------------+%n");
		System.out.println();
		System.out.format("+------------------------------+                                                                 +-------------------------------------+%n");
		System.out.format("|        C L I E N T E         |                                                                 |             F A C T U R A           |%n");
		System.out.format("+------------------------------+                                                                 +-------------------------------------+%n");
	}
	public static void imprimirPieEncabezadoFactura() {
		System.out.format("+------------------------------+                                                                 +-------------------------------------+%n");
		System.out.println();
	}
}