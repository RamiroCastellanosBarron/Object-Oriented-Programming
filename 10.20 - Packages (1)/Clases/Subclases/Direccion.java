package Clases.Subclases;

public class Direccion {
	private String calle;
	private String numero;
	private String codigoPostal;
	private String colonia;
	private String municipio;

	public Direccion (String calle, String numero, String codigoPostal, String colonia, String municipio) {
		setCalle(calle);
		setNumero(numero);
		setCodigoPostal(codigoPostal);
		setColonia(colonia);
		setMunicipio(municipio);
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCalle() {
		return calle;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNumero() {
		return numero;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getColonia() {
		return colonia;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void mostrarDireccion() {
		System.out.println(getCalle() + " " + getNumero() + ", " + getCodigoPostal() + ",\n" + getColonia() + ", " + getMunicipio() + ".");
	}
}