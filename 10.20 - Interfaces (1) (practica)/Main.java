interface Metodos {
	public void imprimirNombre();
	public void imprimirEdad();
}

class Persona implements Metodos {
	public void imprimirNombre() {
		System.out.println("Mi nombre es Ramiro.");
	}
	public void imprimirEdad() {
		System.out.println("Tengo 21 anios.");
	}
}

class Main {
	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.imprimirNombre();
		persona.imprimirEdad();
	}
}