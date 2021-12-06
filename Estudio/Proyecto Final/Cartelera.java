import java.util.ArrayList;
import java.io.*;

public class Cartelera implements Serializable {
	private ArrayList<Funcion> funciones;

	public Cartelera(ArrayList<Funcion> funciones) {
		setFunciones(funciones);
	}

	public void setFunciones(ArrayList<Funcion> funciones) {
		this.funciones = funciones;
	}

	public ArrayList<Funcion> getFunciones() {
		return funciones;
	}

	public String toString() {
		String texto = "";
		for (Funcion funcion : funciones) {
			texto += funcion;
			texto += "\n-----------------------------------------------------------";
		}

		return texto;
	}
}