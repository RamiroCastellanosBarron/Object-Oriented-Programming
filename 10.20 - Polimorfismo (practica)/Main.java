/*
Ramiro Castellanos Barron 606938
Programa en el que se usa herencia y polimorfismo
se usa
protected
super()
@override
objeto[]
super.metodo
*/

class Vehiculo {
	protected String matricula;
	protected String marca;
	protected String modelo;

	public Vehiculo (String matricula, String marca, String modelo) {
		setMatricula(matricula);
		setMarca(marca);
		setModelo(modelo);
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	public void mostrarDatos() {
		System.out.print("Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Matricula: " + matricula + "\n\n");
	}
	public void mostrarMarca() {
		System.out.println("Marca: " + marca + "\n\n");
	}
}

class VehiculoTurismo extends Vehiculo {
	private int numeroPuertas;
	
	public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas) {
		super(matricula, marca, modelo);
		setNumeroPuertas(numeroPuertas);
	}
	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	@Override
	public void mostrarDatos() {
		System.out.print("Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Matricula: " + matricula + "\n" + "Numero de puertas: " + numeroPuertas + "\n\n");
	}

}

class VehiculoDeportivo extends Vehiculo {
	private int cilindrada;
	
	public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
		super(matricula, marca, modelo);
		setCilindrada(cilindrada);
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getCilindrada() {
		return cilindrada;
	}

	@Override
	public void mostrarDatos() {
		System.out.print("Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Matricula: " + matricula + "\n" + "Cilindrada: " + cilindrada + "\n\n");
	}

}

class VehiculoFurgoneta extends Vehiculo {
	private int carga;
	
	public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
		super(matricula, marca, modelo);
		setCarga(carga);
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	public int getCarga() {
		return carga;
	}

	public void mostrarMarca() {
		super.mostrarMarca();
	}

	@Override
	public void mostrarDatos() {
		System.out.print("Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Matricula: " + matricula + "\n" + "Capacidad de carga: " + carga + "\n\n");
	}
}

class Main {
	public static void main(String[] args) {
		Vehiculo[] vehiculos = new Vehiculo[4];
		vehiculos[0] = new Vehiculo("66247", "Mercedes", "C280");
		vehiculos[1] = new VehiculoTurismo(vehiculos[0].getMatricula(), vehiculos[0].getMarca(), vehiculos[0].getModelo(), 4);
		vehiculos[2] = new VehiculoDeportivo(vehiculos[0].getMatricula(), vehiculos[0].getMarca(), vehiculos[0].getModelo(), 8);
		vehiculos[3] = new VehiculoFurgoneta(vehiculos[0].getMatricula(), vehiculos[0].getMarca(), vehiculos[0].getModelo(), 3000);
		for(int i = 0; i < vehiculos.length; i++) {
			System.out.println(i + 1);
			vehiculos[i].mostrarDatos();
		}

		System.out.println("Marca del vehiculo furgoneta: ");
		vehiculos[3].mostrarMarca();
	}
}