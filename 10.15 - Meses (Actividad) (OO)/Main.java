import java.io.*;
import java.text.*;//para el formato decimal
import java.util.*;

class Mes {
	private String[] nombreMes;
	private double[] temperaturaPromedio;

	public Mes (String[] nombreMes, double[] temperaturaPromedio) {
		setNombreMes(nombreMes);
		setTemperaturaPromedio(temperaturaPromedio);
	}
	public void setNombreMes(String[] nombreMes) {
		this.nombreMes = nombreMes;
	}
	public String[] getNombreMes() {
		return nombreMes;
	}
	public void setTemperaturaPromedio(double[] temperaturaPromedio) {
		this.temperaturaPromedio = temperaturaPromedio;
	}
	public double[] getTemperaturaPromedio() {
		return temperaturaPromedio;
	}

	//ya que con los getters hemos establecido todas las temperaturas, ahora podemos
	//llamar a este metodo que imprime la temperatura mayor del arreglo de temperaturaPromedio
	public void temperaturaMayor(String[] nombreMes, double[] temperaturaPromedio) {
		DecimalFormat w = new DecimalFormat("0.0");
		double tempMax = 0f;//esta variable debe estar forzosamente inicializada
		String mesMayor = " ";//esta variable debe estar forzosamente inicializada
		tempMax = temperaturaPromedio[0];
		for(int i = 0; i < temperaturaPromedio.length; i++) {
			if(temperaturaPromedio[i] > tempMax) {
				tempMax = temperaturaPromedio[i];
				mesMayor = nombreMes[i];
			}
		}
		System.out.println(mesMayor + " fue el mas caluroso, con una temperatura de: " + w.format(tempMax) + "°C.");
	}
}

class Main {
	public static void main(String[] args) {
		DecimalFormat w = new DecimalFormat("0.0");//Para imprimir las temperaturas con un punto decimal

		String formatoTabla = "| %-19s | %-22s |%n";//Formato para imprimir la tabla

		String meses = "Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre";
		//String con meses para generar un arreglo con los meses
		StringTokenizer str = new StringTokenizer(meses, ",");//Separamos el String meses cuando haya una ","
		String[] arregloMeses = new String[12];//Creamos el arreglo en el que guardaremos los meses
		int contador = 0;//se utiliza un contador porque no puede hacerse este proceso con un ciclo for
		while(str.hasMoreTokens()) {
			arregloMeses[contador] = str.nextToken();
			contador++;
		}

		System.out.println("\n\n\tTEMPERATURAS DE 2020\n\n");//titulo del programa

		Mes m = new Mes(arregloMeses, leerTemp(arregloMeses));//creamos el objeto de mes
		//1er parametro: 	arreglo de meses
		//2do parametro: 	metodo que te devuelve el arreglo con las temperaturas promedio de cada mes
		//					le ingresamos el arreglo de meses (sin especificar su posicion) para que el usuario
		//					conozca el mes de la temperatura que esta ingresando
		//Notas: estos parametros que son arreglos no tienen que especificarse con "[]"

		imprimirTitulo();//metodo que imprime el titulo de la tabla

		for(int i = 0; i < m.getNombreMes().length; i++) {// imprimimos la tabla hasta su utlimo mes
			System.out.printf(formatoTabla, m.getNombreMes()[i], w.format(m.getTemperaturaPromedio()[i]) + "°C");
		}
		imprimirPie();//metodo que imprime el pie que cierra base de la tabla

		m.temperaturaMayor(m.getNombreMes(), m.getTemperaturaPromedio());//metodo de la clase Mes que imprime el mes con la temperatura mayor
	}
	public static double[] leerTemp(String[] meses) {
		Scanner sc = new Scanner(System.in);
		double[] temperaturaPromedio = new double[12];
		for(int i = 0; i < temperaturaPromedio.length; i++) {
			System.out.print("Ingrese la temperatura promedio de " + meses[i] + ": ");
			temperaturaPromedio[i] = sc.nextDouble();
		}
		return temperaturaPromedio;
	}
	public static void imprimirTitulo() {
		System.out.format("+---------------------+------------------------+%n");
		System.out.format("|         MES         |  Temperatura Promedio  |%n");
		System.out.format("+---------------------+------------------------+%n");
	}
	public static void imprimirPie() {
		System.out.format("+---------------------+------------------------+%n");
	}
}