public class Direccion {
	private String calle;
	private String noExterior;
	private String colonia;
	private String municipio;
	private String estado;
	private String codigoP;

	public Direccion (String calle, String noExterior, String colonia, String municipio, String estado, String codigoP) {
		setCalle(calle);
		setNoExterior(noExterior);
		setColonia(colonia);
		setMunicipio(municipio);
		setEstado(estado);
		setCodigoP(codigoP);
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCalle() {
		return calle;
	}
	public void setNoExterior(String noExterior) {
		this.noExterior = noExterior;
	}
	public String getNoExterior() {
		return noExterior;
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
	public void setCodigoP(String codigoP) {
		this.codigoP = codigoP;
	}
	public String getCodigoP() {
		return codigoP;
	}
}
