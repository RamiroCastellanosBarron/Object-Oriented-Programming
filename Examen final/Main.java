/*

Ramiro Castellanos Barron
606938
26 de noviembre de 2021
Doy mi palabra de que he realizado esta actividad con integridad academica.

REPORTES

VENTAS

DIA         IMPORTE

Lunes       $100.00
Martes      $100.00
Viernes     $100.00

SATISFACCION DEL CLIENTE

INDICE         CANTIDAD

contento       30
triste         30
indiferente    30

*/

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		//respuestas del cliente

		Scanner sc = new Scanner(System.in);
		System.out.print("\nREPORTES\n\n");
		System.out.print("\n1. Ventas.\n");
		System.out.print("\n2. Satisfaccion de cliente.\n");
		System.out.print("  >>  Ingrese el reporte que desea generar: ");
		try {
			int o = sc.nextInt();
			if(o == 1) {
				reporteVentas();
			} else if(o == 2) {
				reporteSatisfaccion();
			}
		} catch (InputMismatchException e) {
			System.out.print("\nNo ingresaste una opcion valida");
		}
		sc.close();
	}

	static void reporteSatisfaccion() {
		String rutaRespuestasCliente = "C:\\Users\\ramir\\OneDrive\\Desktop\\Examen final\\Base de datos\\respuestasClienteExamen.txt";
		String[] respuesta = new String[17];
		int[] respuestasEnteras = new int[17];
		int c1 = 0, c2 = 0, c3 = 0;

		try {
			File f = new File(rutaRespuestasCliente);
			FileInputStream f2 = new FileInputStream(f);
			InputStreamReader f3 = new InputStreamReader(f2);
			BufferedReader f4 = new BufferedReader(f3);

			for(int i = 0; i < 17; i++) {
				respuesta[i] = f4.readLine();
			}

			for(int i = 0; i< 17; i++) {
				respuestasEnteras[i] = Integer.parseInt(respuesta[i]);
				if(respuestasEnteras[i] == 1) {
					c1++;
				} else if(respuestasEnteras[i] == 2) {
					c2++;
				} else if(respuestasEnteras[i] == 3) {
					c3++;
				}
			}

			System.out.print("\nSATISFACCION DEL CLIENTE\n\n");
			System.out.printf("%-15s%-2s%n", "Contento: ", c1);
			System.out.printf("%-15s%-2s%n", "Triste: ", c2);
			System.out.printf("%-15s%-2s%n", "Indiferente: ", c3);

			f4.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	static void reporteVentas() {
		String rutaVentas = "C:\\Users\\ramir\\OneDrive\\Desktop\\Examen final\\Base de datos\\ventasExamenIntermedia.txt";
		
		String[] ventas = new String[6];

		try {
			File f = new File(rutaVentas);
			FileInputStream f2 = new FileInputStream(f);
			InputStreamReader f3 = new InputStreamReader(f2);
			BufferedReader f4 = new BufferedReader(f3);

			int totalSabado[] = new int[2];
			int totalDomingo[] = new int[2];
			int totalLunes[] = new int[2];
			String tS[] = new String[2];
			String tD[] = new String[2];
			String tL[] = new String[2];
			int cs = 0, cd = 0, cl = 0;
			int iS = 0, iD = 0, iL = 0;
			
			
			for(int i = 0; i < 6; i++) {
				ventas[i] = f4.readLine();
			}
			for(int i = 0; i < 6; i++) {
				if(ventas[i].contains("sabado")) {
					tS[cs] = ventas[i].replace("sabado,", "");
					totalSabado[cs] = Integer.parseInt(tS[cl]);
					cs++;
				}
			}
			iS = totalSabado[0] + totalSabado[1];
			for(int i = 0; i < 6; i++) {
				if(ventas[i].contains("domingo")) {
					tD[cd] = ventas[i].replace("domingo,", "");
					totalDomingo[cd] = Integer.parseInt(tD[cd]);
					cd++;
				}
			}
			iD = totalDomingo[0] + totalDomingo[1];
			for(int i = 0; i < 6; i++) {
				if(ventas[i].contains("lunes")) {
					tL[cl] = ventas[i].replace("lunes,", "");
					totalLunes[cl] = Integer.parseInt(tL[cl]);
					cl++;
				}
			}
			iL = totalLunes[0] + totalLunes[1];

			System.out.printf("%-15s%-15s%n", "Sabado: ", "$" + iS);
			System.out.printf("%-15s%-15s%n", "Domingo: ", "$" + iD);
			System.out.printf("%-15s%-15s%n", "Lunes: ", "$" + iL);

			f4.close();

			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}