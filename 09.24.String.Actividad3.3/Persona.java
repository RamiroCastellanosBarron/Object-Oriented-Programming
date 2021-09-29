import java.util.*;
import java.util.Random.*;

public class Persona{
	private String nombreCompleto;
	private String curp;
	private String telefono;
	private String fecha;

	public Persona(String nombreCompleto, String curp, String telefono, String fecha){
		setNombreCompleto(nombreCompleto);
		setCurp(curp);
		setTelefono(telefono);
		setFecha(fecha);
	}

	public void setNombreCompleto(String nombreCompleto){
		this.nombreCompleto=nombreCompleto;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getCurp() {
		return curp;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getFecha() {
		return fecha;
	}

	public String calcularRfc(){
		Random rand = new Random();
		String rfc;
		String descompuesto[]=nombreCompleto.split(" ");
		String fDescompuesta[]=fecha.split("-");
		char randomChars[]=new char[3];

		for(int i = 0; i<3; i++){
			randomChars[i] = (char)(rand.nextInt(26) + 'a');
		}

		char vocales[] = {'a', 'e', 'i', 'o', 'u'};

		boolean validator = false;
		int pos = 0;
		int cont = 0;

		do {
			for(int i = 0; i<descompuesto[1].length(); i++){
				if (descompuesto[1].contains(Character.toString(vocales[cont]))) {
					pos = i;
					validator = true;
					cont++;
					if (cont == 4) {
						cont = 0;	
					}
				}
			}
		} while (validator == false);

		rfc = descompuesto[1].substring(0,1).toUpperCase()+descompuesto[1].toUpperCase().charAt(pos)+descompuesto[2].toUpperCase().substring(0,1)+descompuesto[0].toUpperCase().substring(0,1)+fDescompuesta[2].substring(2)+fDescompuesta[1]+fDescompuesta[0]+Character.toUpperCase(randomChars[0])+Character.toUpperCase(randomChars[1])+Character.toUpperCase(randomChars[2]);

		return rfc;

	}

	public String toString(){
		return "\n"+"       PROGRAMA RFC"+"\n"+"\n"+"  >>  Tu nombre es: "+getNombreCompleto()+"\n"+"  >>  Tu CURP es: "+getCurp()+"\n"+"  >>  Tu telefono es: "+getTelefono()+"\n"+"  >>  Tu fecha de nacimiento es: "+getFecha()+"\n"+"\n"+"  >>  Tu RFC es: "+calcularRfc()+".";
	}
}