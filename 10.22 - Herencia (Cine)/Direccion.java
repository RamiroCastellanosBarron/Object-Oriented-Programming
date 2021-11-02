public class Direccion {
	private String calle;
	private int numExterior;
	private int codigoPostal;
	private String colonia;
	private String municipio;
	private String estado;

	public Direccion (String calle, int numExterior, int codigoPostal, String colonia, String municipio, String estado) {
		setCalle(calle);
		setNumExterior(numExterior);
		setCodigoPostal(codigoPostal);
		setColonia(colonia);
		setMunicipio(municipio);
		setEstado(estado);
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCalle() {
		return calle;
	}
	public void setNumExterior(int numExterior) {
		this.numExterior = numExterior;
	}
	public int getNumExterior() {
		return numExterior;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public int getCodigoPostal() {
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
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEstado() {
		return estado;
	}
}
