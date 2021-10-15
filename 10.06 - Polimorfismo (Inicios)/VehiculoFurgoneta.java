public class VehiculoFurgoneta extends Vehiculo {
	private int carga;

	public VehiculoFurgoneta (int carga, String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		setCarga(carga);
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	public int getCarga() {
		return carga;
	}
	@Override
	public String toString(){
		return "Matricula: " + getMatricula() +"\n" + "Marca: " + getMarca() +"\n" + "Modelo: " + getModelo() +"\n" + "Numero de puertas: " + getCarga() + "." +"\n";
	}
}
