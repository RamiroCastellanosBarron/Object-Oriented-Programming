class Nombre {
	private String nombre, apellido;

	public Nombre (String nombre, String apellido) {
		setNombre(nombre);
		setApellido(apellido);
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getApellido() {
		return apellido;
	}
	public String toString(){
		return "Nombre completo: " + getNombre() + " " + getApellido() + ".";
	}
}
class Main {
	public static void main(String[] args) {
		Nombre n = new Nombre("Ramiro", "Castellanos Barron");
		System.out.println(n);
	}
}