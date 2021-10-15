public class FechaNacimiento {
	private String dia;
	private String mes;
	private String anio;

	public FechaNacimiento(String dia, String mes, String anio){
		// setDia(dia);
		// setMes(mes);
		// setAnio(anio);
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
	}

	public void setDia(String dia){
		this.dia=dia;
	}
	public String getDia(){
		return dia;
	}
	public void setMes(String mes){
		this.mes=mes;
	}
	public String getMes(){
		return mes;
	}
	public void setAnio(String anio){
		this.anio=anio;
	}
	public String getAnio(){
		return anio;
	}
	public String toString(){
		return "\t"+ this.dia +"-"+this.mes +"-"+this.anio +"\n";
	}
}
