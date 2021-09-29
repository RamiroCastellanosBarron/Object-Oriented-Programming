public class Nombre {
	private String primerNombre;
	private String segundoNombre;
	private String apellidoPaterno;
	private String apellidoMaterno;

	public Nombre(String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno){
		// setPrimerNombre(primerNombre);
		// setSegundoNombre(segundoNombre);
		// setApellidoPaterno(apellidoPaterno);
		// setApellidoMaterno(apellidoMaterno);
		this.primerNombre=primerNombre;
		this.segundoNombre=segundoNombre;
		this.apellidoPaterno=apellidoPaterno;
		this.apellidoMaterno=apellidoMaterno;
	}
	public void setPrimerNombre(String primerNombre){
		this.primerNombre=primerNombre;
	}
	public String getPrimerNombre(){
		return primerNombre;
	}
	public void setSegundoNombre(String segundoNombre){
		this.segundoNombre=segundoNombre;
	}
	public String getSegundoNombre(){
		return segundoNombre;
	}
	public void setApellidoPaterno(String apellidoPaterno){
		this.apellidoPaterno=apellidoPaterno;
	}
	public String getApellidoPaterno(){
		return apellidoPaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno){
		this.apellidoMaterno=apellidoMaterno;
	}
	public String getApellidoMaterno(){
		return apellidoMaterno;
	}

	public String toString(){
		return "\t"+ this.primerNombre +" "+this.segundoNombre +" "+"\n"+"\t"+this.apellidoPaterno +" "+this.apellidoMaterno;
	}
}
