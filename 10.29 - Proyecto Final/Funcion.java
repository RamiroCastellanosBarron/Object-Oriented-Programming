public class Funcion {
	private String titulo;
	private String idiomas;
	private String subtitulos;
	private int noSala;
	private int disponibilidad;
	private Fecha fecha;
	private Hora hora;

	public Funcion(String titulo, String idiomas, String subtitulos, int noSala, int disponibilidad, Fecha fecha, Hora hora) {
		setTitulo(titulo);
		setIdiomas(idiomas);
		setSubtitulos(subtitulos);
		setNoSala(noSala);
		setDisponibilidad(disponibilidad);
		setFecha(fecha);
		setHora(hora);
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}

	public void setSubtitulos(String subtitulos) {
		this.subtitulos = subtitulos;
	}

	public void setNoSala(int noSala) {
		this.noSala = noSala;
	}

	public void setDisponibilidad(int disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getIdiomas() {
		return idiomas;
	}

	public String getSubtitulos() {
		return subtitulos;
	}

	public int getNoSala() {
		return noSala;
	}

	public int getDisponibilidad() {
		return disponibilidad;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public Hora getHora() {
		return hora;
	}

	public String toString() {
		return "\nTitulo: " + titulo + "\nSala: " + noSala + "\nIdiomas: " + idiomas + "\nSubtitulos: " + subtitulos + "\nFecha: " + fecha + "\nHora: " + hora;
	}
}