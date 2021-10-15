interface EjercicioInterface {
	int edad=20;
	int edad1=20;
	int edad2=20;
	int edad3=20;
	String nombre="Ramiro";
	String nombre1="Joel";
	String nombre2="Felipe";
	String nombre3="Hernan";

	int imprimir();
}

class Main implements EjercicioInterface {
	public static void main(String[] args){
		System.out.println(nombre2);

		Main m = new Main();
		System.out.print(m.imprimir());
	}

	@Override
	public int imprimir() {
		int x=4;
		int y=4;
		return x*y;
	}
}