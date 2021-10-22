package Clases.Subclases;

public class Fecha {
	private String dia;
	private String mes;
	private String anio;

	public Fecha (String dia, String mes, String anio) {
		setDia(dia);
		setMes(mes);
		setAnio(anio);
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getDia() {
		return dia;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getMes() {
		return mes;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public String getAnio() {
		return anio;
	}
	public void mostrarFechaNacimiento() {
		System.out.println(getDia() + "-" + getMes() + "-" + getAnio());
	}
}