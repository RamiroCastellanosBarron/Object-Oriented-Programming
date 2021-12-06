import java.io.*;

public class Nombre implements Serializable{
	private String primerNombre;
	private String apellidoPaterno;
	private String apellidoMaterno;

	public Nombre(String primerNombre, String apellidoPaterno, String apellidoMaterno) {
		setPrimerNombre(primerNombre);
		setApellidoPaterno(apellidoPaterno);
		setApellidoMaterno(apellidoMaterno);
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public String toString() {
		return primerNombre + " " + apellidoPaterno + " " + apellidoMaterno;
	}
}