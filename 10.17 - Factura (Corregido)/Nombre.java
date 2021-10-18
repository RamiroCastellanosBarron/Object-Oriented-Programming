public class Nombre {
	private String primerNombre;
	private String aPaterno;
	private String aMaterno;

	public Nombre (String primerNombre, String aPaterno, String aMaterno) {
		setPrimerNombre(primerNombre);
		setAPaterno(aPaterno);
		setAMaterno(aMaterno);
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setAPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}
	public String getAPaterno() {
		return aPaterno;
	}
	public void setAMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}
	public String getAMaterno() {
		return aMaterno;
	}
}
