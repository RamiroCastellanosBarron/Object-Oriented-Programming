import java.text.*;
import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat w = new DecimalFormat("0.0");
		int opcion;
		System.out.print("Ingresa la forma de correr el programa 1 o 2: ");
		opcion = sc.nextInt();
		double listaTemperaturas[] = new double[12];
		for(int i = 0; i < listaTemperaturas.length; i++) {
			listaTemperaturas[i] = (double)(Math.random()*20 + 20);
		}
		String meses = "Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre";
		StringTokenizer st = new StringTokenizer(meses, ",");
		String listaMeses[] = new String[12];
		int contador = 0;
		String formatoTabla = "| %-19s | %-22s |%n";
		while (st.hasMoreTokens()) {
			listaMeses[contador] = st.nextToken();
			contador++;
		}


		if (opcion == 1) {
			System.out.print("\n"+"\n");
			imprimirTitulo();
			for(int i = 0; i < listaMeses.length; i++) {
				System.out.printf(formatoTabla, listaMeses[i], w.format(listaTemperaturas[i]) + "°C");
			}
			imprimirPie();
			imprimirResultado(listaTemperaturas, listaMeses);
		}
		if (opcion == 2) {
			for(int i = 0; i < listaMeses.length; i++) {
				listaTemperaturas[i] = metodo(listaTemperaturas[i], listaMeses[i]);	
			}
			imprimirTitulo();
			for(int i = 0; i < listaMeses.length; i++) {
				System.out.printf(formatoTabla, listaMeses[i], w.format(listaTemperaturas[i]) + "°C");
			}
			imprimirPie();
			imprimirResultado(listaTemperaturas, listaMeses);
		}
	}
	
	public static double metodo(double temp, String mes) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa la temperatura promedio de " + mes + ": ");
		temp = sc.nextDouble();
		return temp;
	}
	public static void imprimirTitulo() {
		System.out.format("+---------------------+------------------------+%n");
		System.out.format("|         MES         |  Temperatura Promedio  |%n");
		System.out.format("+---------------------+------------------------+%n");
	}
	public static void imprimirPie() {
		System.out.format("+---------------------+------------------------+%n");
	}
	public static void imprimirResultado(double[] listaTemperaturas, String[] listaMeses) {
		DecimalFormat w = new DecimalFormat("0.0");
		String mesMayor = " ";
		double tempMayor;
		tempMayor = listaTemperaturas[0];
		
		for(int i = 0; i < listaTemperaturas.length; i++) {
			if (listaTemperaturas[i] > tempMayor) {
				tempMayor = listaTemperaturas[i];
				mesMayor = listaMeses[i];
			}
		}
		System.out.println(mesMayor + " fue el mes mas caluroso, con una temperatura de: " + w.format(tempMayor) + "°C.");
	}
}
