public class Persona {
	private Nombre nombre;
	private Fecha fecha;
	private String curp;

	public Persona (Nombre nombre, Fecha fecha, String curp) {
		setNombre(nombre);
		setFecha(fecha);
		setCurp(curp);
	}
	public void setNombre(Nombre nombre) {
		this.nombre = nombre;
	}
	public Nombre getNombre() {
		return nombre;
	}
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	public Fecha getFecha() {
		return fecha;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public String getCurp() {
		return curp;
	}

	//metodo para genera rfc
	public String mostrarRFC(){
		Nombre n1 = new Nombre("Ramiro", "Castellanos", "Barron");
		Fecha f1 = new Fecha(2, 5, 2000);
		Persona p1 = new Persona(n1, f1, "CABR000502HNLSRMA9");
		String rfc;
		char caracteres[] = new char[12];
		caracteres[0] = p1.getNombre().getApellidoPaterno().charAt(0);
		caracteres[1] = p1.getNombre().getApellidoPaterno().charAt(1);
		caracteres[2] = p1.getNombre().getApellidoMaterno().charAt(0);
		caracteres[3] = p1.getNombre().getPrimerNombre().charAt(0);
		caracteres[4] = (String.valueOf(p1.getFecha().getAnio())).charAt(2);
		caracteres[5] = (String.valueOf(p1.getFecha().getAnio())).charAt(3);
		if (String.valueOf(p1.getFecha().getMes()).length() == 1) {
			caracteres[6] = '0';
		} else {
			caracteres[6] = String.valueOf(p1.getFecha().getMes()).charAt(0);
		}
		caracteres[7] = String.valueOf(p1.getFecha().getMes()).charAt(1);
		caracteres[8] = ' ';
		caracteres[9] = ' ';
		caracteres[10] = ' ';
		caracteres[11] = ' ';

		for(int i=0;i<12;i++){
			System.out.print(caracteres[i]);
		}

		for(int i=0;i<12;i++){
			rfc = Character.toString(caracteres[i]);
		}



		return rfc;
	}

}
