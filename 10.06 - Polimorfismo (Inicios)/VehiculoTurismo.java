public class VehiculoTurismo extends Vehiculo {
	private int numeroPuertas;

	public VehiculoTurismo (int numeroPuertas, String matricula, String marca, String modelo) {
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
	public String toString(){
		return "Matricula: " + getMatricula() +"\n" + "Marca: " + getMarca() +"\n" + "Modelo: " + getModelo() +"\n" + "Numero de puertas: " + getNumeroPuertas() + "." +"\n";
	}
}
