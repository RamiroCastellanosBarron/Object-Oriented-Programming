public class Main {
	public static void main(String[] args) {
		Nombre n = new Nombre("primerNombre", "apellidoPaterno", "apellidoMaterno");
		Fecha f = new Fecha(1,1,1);
		Persona p = new Persona(n, f, "curp");
		System.out.print(p.mostrarRFC());
	}
}
