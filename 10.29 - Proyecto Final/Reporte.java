import java.io.Serializable;
import java.util.ArrayList;

public class Reporte implements Serializable {
	private ArrayList<Boleto> boletosVendidos;
	private ArrayList<Funcion> funciones;

	public Reporte(ArrayList<Boleto> boletosVendidos, ArrayList<Funcion> funciones) {
		setBoletosVendidos(boletosVendidos);
		setFunciones(funciones);
	}

	public void setBoletosVendidos(ArrayList<Boleto> boletosVendidos) {
		this.boletosVendidos = boletosVendidos;
	}

	public ArrayList<Boleto> getBoletosVendidos() {
		return boletosVendidos;
	}

	public void setFunciones(ArrayList<Funcion> funciones) {
		this.funciones = funciones;
	}

	public ArrayList<Funcion> getFunciones() {
		return funciones;
	}

	public double[] obtenerVentasPorFuncion() {
		double[] ventasPorFuncion = new double[funciones.size()];
		for (int i = 0; i < ventasPorFuncion.length; i++) {
			for (Boleto boleto : boletosVendidos) {
				if (boleto.getFuncion().getTitulo().equals(funciones.get(i).getTitulo())) {
					ventasPorFuncion[i] += boleto.getPrecio();
				}
			}
		}

		return ventasPorFuncion;
	}

	public Funcion obtenerFuncionMasVendida() {
		Funcion funcionMasVendida = null;
		double[] ventasPorFuncion = obtenerVentasPorFuncion();
		double ventaMayor = 0;
		for (int i = 0; i < funciones.size(); i++) {
			if (ventasPorFuncion[i] > ventaMayor) {
				ventaMayor = ventasPorFuncion[i];
				funcionMasVendida = funciones.get(i);
			}
		}
		return funcionMasVendida;
	}

	public String toString() {
		String formato = "%-20s%-20s";
		String texto = String.format(formato, "FUNCION", "VENTAS");
		double[] ventasPorFuncion = obtenerVentasPorFuncion();
		for (int i = 0; i < funciones.size(); i++)
			texto += "\n" + String.format(formato, funciones.get(i).getTitulo(), "$" + ventasPorFuncion[i]);

		Funcion funcionMasVendida = obtenerFuncionMasVendida();
		texto += "\n\nFuncion mas vendida: " + funcionMasVendida.getTitulo();

		return texto;
	}
}