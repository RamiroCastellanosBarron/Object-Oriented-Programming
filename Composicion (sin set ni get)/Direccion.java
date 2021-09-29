public class Direccion {
	private String calle;
	private String numero;
	private String codigoPostal;
	private String colonia;
	private String municipio;
	private String estado;
	private String pais;

	public Direccion(String calle, String numero, String codigoPostal, String colonia, String municipio, String estado, String pais){
		// setCalle(calle);
		// setNumero(numero);
		// setCodigoPostal(codigoPostal);
		// setColonia(codigoPostal);
		// setMunicipio(municipio);
		// setEstado(estado);
		// setPais(pais);
		this.calle=calle;
		this.numero=numero;
		this.codigoPostal=codigoPostal;
		this.colonia=colonia;
		this.municipio=municipio;
		this.estado=estado;
		this.pais=pais;
	}

	public void setCalle(String calle){
		this.calle=calle;
	}
	public String getCalleString(){
		return calle;
	}
	public void setNumero(String numero){
		this.numero=numero;
	}
	public String getNumero(){
		return numero;
	}
	public void setCodigoPostal(String codigoPostal){
		this.codigoPostal=codigoPostal;
	}
	public String getCodigoPostal(){
		return codigoPostal;
	}
	public void setColonia(String colonia){
		this.colonia=colonia;
	}
	public String getColonia(){
		return colonia;
	}
	public void setMunicipio(String municipio){
		this.municipio=municipio;
	}
	public String getMunicipio(){
		return municipio;
	}
	public void setEstado(String estado){
		this.estado=estado;
	}
	public String getEstado(){
		return estado;
	}
	public void setPais(String pais){
		this.pais=pais;
	}
	public String getPais(){
		return pais;
	}
	public String toString(){
		return "\t"+ this.calle +" "+this.numero +"\n"+"\t"+this.colonia +"\n"+"\t" +this.codigoPostal +" "+this.municipio +"\n"+"\t"+this.estado +"\n"+"\t"+this.pais +"\n"+"\n";
	}
}
