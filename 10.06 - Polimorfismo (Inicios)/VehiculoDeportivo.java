public class VehiculoDeportivo extends Vehiculo {
	private int cilindrada;

	public VehiculoDeportivo (int cilindrada, String matricula, String marca, String modelo) {
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
	public String toString(){
		return "Matricula: " + getMatricula() +"\n" + "Marca: " + getMarca() +"\n" + "Modelo: " + getModelo() +"\n" + "Numero de puertas: " + getCilindrada() + "." +"\n";
	}
}
