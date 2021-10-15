public class Estilos {
	private String titulo;
	private String subtitulo;
	private String linea;

	public Estilos (String titulo, String subtitulo, String linea) {
		setTitulo(titulo);
		setSubtitulo(subtitulo);
		setLinea(linea);
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTitulo(String titulo) {
		return "__________________________________________________\n\n" + ajustarTitulo(titulo.toUpperCase()) + "\n__________________________________________________\n";
	}
	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}
	public String getSubtitulo(String subtitulo) {
		return "\n          " + subtitulo.toLowerCase() + "\n__________________________________________________\n";
	}

	
	public void setLinea(String linea) {
		this.linea = linea;
	}
	public String getLinea() {
		return "__________________________________________________\n\n";
	}

	public String ajustarTitulo(String titulo) {
		int longitud = titulo.length();//6
		int longitudNueva = longitud/2;//3
		int mitad = 24;
		int puntoInicial = mitad - longitudNueva;//21
		String espacio = "                                                                             ";
		String espacioNuevo = espacio.substring(0,puntoInicial);
		String stringFinal = espacioNuevo.concat(titulo);
		return stringFinal;
	}

}