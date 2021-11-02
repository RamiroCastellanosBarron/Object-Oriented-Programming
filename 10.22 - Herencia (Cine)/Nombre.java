public class Nombre {
	private String primerNombre;
	private String apellidoPaterno;
	private String apellidoMaterno;

	public Nombre (String primerNombre, String apellidoPaterno, String apellidoMaterno) {
		setPrimerNombre(primerNombre);
		setApellidoPaterno(apellidoPaterno);
		setApellidoMaterno(apellidoMaterno);
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void mostrarNombreCompleto () {
		System.out.println(primerNombre + " " + apellidoPaterno + " " + apellidoMaterno);
	}
}
