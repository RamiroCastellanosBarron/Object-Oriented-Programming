import java.util.*;

class Mes {
	private String nombreMes;
	private double promedioTemp;

	public Mes (String nombreMes, double promedioTemp) {
		setNombreMes(nombreMes);
		setPromedioTemp(promedioTemp);
	}
	public void setNombreMes(String nombreMes) {
		this.nombreMes = nombreMes;
	}
	public String getNombreMes() {
		return nombreMes;
	}
	public void setPromedioTemp(double promedioTemp) {
		this.promedioTemp = promedioTemp;
	}
	public double getPromedioTemp() {
		return promedioTemp;
	}
	public String toString(){
		return "contenido";
	}

}

class Main {
	public static void main(String[] args){
		for(int i = 0; i < 12; i++) {
			
		}
		String meses = "Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre";
		StringTokenizer st = new StringTokenizer(meses, ",");
		String listaMeses[] = new String[12];
		int contador = 0;
		while (st.hasMoreTokens()) {
			listaMeses[contador] = st.nextToken();
			contador++;
		}
		Mes m[] = new Mes[listaMeses.length];
		int mesAPreguntar = 0;
		while (mesAPreguntar<12) {
			m[mesAPreguntar] = new Mes(listaMeses[mesAPreguntar], leerTemp());
			mesAPreguntar++;
		}


		for(int i = 0; i < m.length; i++) {
			System.out.println(listaMeses[i] +"\t" +"\t");
		}

		
	}

	public static float leerTemp(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese la temperatura promedio: ");
		return sc.nextFloat();
	}

	
}