public class Vehiculo {
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
	public String toString(){
		return "Matricula: " + getMatricula() +"\n" + "Marca: " + getMarca() +"\n" + "Modelo: " + getModelo() + "." +"\n";
	}

}
