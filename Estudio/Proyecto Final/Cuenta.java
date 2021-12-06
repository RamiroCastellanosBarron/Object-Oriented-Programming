import java.io.*;

public class Cuenta implements Serializable{
	protected String usuario;
	protected String contrasenia;
	protected Nombre nombre;
	protected String tipo;

	public Cuenta(String usuario, String contrasenia, Nombre nombre, String tipo) {
		setUsuario(usuario);
		setContrasenia(contrasenia);
		setNombre(nombre);
		setTipo(tipo);
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public void setNombre(Nombre nombre) {
		this.nombre = nombre;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public Nombre getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public String toString() {
		return "Bienvenido " + nombre + "\nTipo de cuenta: " + tipo;
	}
}