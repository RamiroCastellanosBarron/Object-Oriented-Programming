
//superclase
class Persona {

	//atributos
	private String nombre;
	private String apellido;
	private int edad;

	//constructor
	public Persona (String nombre, String apellido, int edad) {
		setNombre(nombre);
		setApellido(apellido);
		setEdad(edad);
	}

	//getters y setters
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
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	public String toString(){
		return "Nombre: " + getNombre() +"\n" + "Apellido: " + getApellido() +"\n" + "Edad: " + getEdad();
	}

}

class Estudiante extends Persona {
	private int codigoEstudiante;
	private float notaFinal;
	public Estudiante (String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
		super(nombre, apellido, edad);
		setCodigoEstudiante(codigoEstudiante);
		setNotaFinal(notaFinal);
	}
	public void setCodigoEstudiante(int codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}
	public int getCodigoEstudiante() {
		return codigoEstudiante;
	}
	public void setNotaFinal(float notaFinal) {
		this.notaFinal = notaFinal;
	}
	public float getNotaFinal() {
		return notaFinal;
	}
	public String toString(){
		return "Matricula: " + getCodigoEstudiante() +"\n" + "Calificacion: " + getNotaFinal();
	}
	public void mostrarDatos(){
		System.out.print("Nombre: " + getNombre() +"\n" + "Apellido: " + getApellido() +"\n" + "Edad: " + getEdad() +"\n" + "Matricula: " + getCodigoEstudiante() +"\n" + "Calificacion: " + getNotaFinal() +"\n");
	}
}

class Main {
	public static void main(String[] args) {
		Estudiante e = new Estudiante("Ramiro", "Castellanos Barron", 21, 606938, 99.4f);
		e.mostrarDatos();
		// Persona p = new Persona("Ramiro", "Castellanos", 21);
		// System.out.print(p);

	}
}