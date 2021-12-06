import java.text.DecimalFormat;
import java.io.*;

public class Hora implements Serializable{
	private int hora;
	private int minuto;
	private String tipo;

	public Hora(int hora, int minuto, String tipo) {
		setHora(hora);
		setMinuto(minuto);
		setTipo(tipo);
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public String getTipo() {
		return tipo;
	}

	public String toString() {
		DecimalFormat w = new DecimalFormat("00");
		return w.format(hora) + ":" + w.format(minuto) + " " + tipo;
	}
}