/*

LOS INTERFACES SIRVEN PARA CONTENER DECLARACIONES DE METODOS

Tenemos dos interfaces

interface Verificacion

interface Estilos

Tenemos dos clases

class Persona IMPLEMENTS Verificacion y Estilos (implementa dos interfaces)

class Humano IMPLEMENTS Verificacion (implementa solo uno)

Lo importante de este ejercicio es que usamos un interfaz en dos clases

IMPORTANTE

SI VAS A IMPLEMENTAR METODOS EN UNA CLASE
NO PUEDES SER SELECTIVO
TIENES QUE IMPLEMENTAR TODOS
O AL MENOS DECLARARLOS

Ejemplo:

class Humano implements Verificacion {
	atributos...
	constructor...
	setters&getters...

	TODOS LOS METODOS DE VERIFICACION

	public void verificarEdad(int edad) { }

	public void imprimirTamanioNombre(String nombre) { } LO DECLARAMOS AUNQUE NO LO USEMOS

}

*/

interface Verificacion {
	public void imprimirTamanioNombre(String nombre);
	public void verificarEdad(int edad);
}

interface Estilos {
	public void imprimirTitulo();
}

class Humano implements Verificacion {
	protected int edad;

	public Humano (int edad) {
		setEdad(edad);
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	public void verificarEdad(int edad) {
		if(edad < 18) {
			System.out.println("  >>  Eres menor de edad.");
		} else {
			System.out.println("  >>  Eres mayor de edad.");
		}
	}
	public String toString() {
		return "  >>  La edad del humano es: " + getEdad() + "\n";
	}
	public void imprimirTamanioNombre(String nombre) { }
}

class Persona implements Verificacion, Estilos {
	protected String nombre;
	protected int edad;
	protected String sexo;

	public Persona (String nombre, int edad, String sexo) {
		setNombre(nombre);
		setEdad(edad);
		setSexo(sexo);
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSexo() {
		return sexo;
	}
	public void imprimirTamanioNombre(String nombre) {
		int tamanioNombre = nombre.length();
		System.out.println("  >>  Tu nombre contiene " + tamanioNombre + " caracteres.");
	}
	public void imprimirTitulo() {
		System.out.format("+----------------------------+%n");
		System.out.format("|           PERSONA          |%n");
		System.out.format("+----------------------------+%n");
		System.out.println();
	}
	public void verificarEdad(int edad) {
		if(edad < 18) {
			System.out.println("  >>  Eres menor de edad.");
		} else {
			System.out.println("  >>  Eres mayor de edad.");
		}
	}
	public String toString() {
		return "Nombre: " + getNombre() + "\nEdad: " + getEdad() + "\nSexo: " + getSexo() + "\n";
	}
}

class Main {
	public static void main(String[] args) {
		Persona persona = new Persona("Ramiro", 21, "Masculino");
		persona.imprimirTitulo();
		System.out.println(persona);
		persona.imprimirTamanioNombre(persona.getNombre());
		persona.verificarEdad(persona.getEdad());
		persona.imprimirTitulo();
		Humano humano = new Humano(17);
		System.out.println(humano.toString());
		humano.verificarEdad(humano.getEdad());
	}
}
