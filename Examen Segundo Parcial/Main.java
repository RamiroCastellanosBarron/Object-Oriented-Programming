import java.util.*;

class Nombre {
	private String primerNombre;
	private String aPaterno;
	private String aMaterno;

	public Nombre (String primerNombre, String aPaterno, String aMaterno) {
		setPrimerNombre(primerNombre);
		setAPaterno(aPaterno);
		setAMaterno(aMaterno);
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setAPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}
	public String getAPaterno() {
		return aPaterno;
	}
	public void setAMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}
	public String getAMaterno() {
		return aMaterno;
	}

	public String iniciales() {
		String c1,c2,c3,c4;
		c1 = primerNombre.substring(0, 1).toUpperCase();
		c2 = aPaterno.substring(0, 1).toUpperCase();
		c3 = aMaterno.substring(0, 1).toUpperCase();
		c4 = c1 + c2 + c3;
		return c4;
	}

	public String toString(){
		return primerNombre + " " + aPaterno + " " + aMaterno;
	}
}


class Fecha {
	private String dia;
	private String mes;
	private String anio;

	public Fecha (String dia, String mes, String anio) {
		setDia(dia);
		setMes(mes);
		setAnio(anio);
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getDia() {
		return dia;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getMes() {
		return mes;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public String getAnio() {
		return anio;
	}
	public String toString(){
		return dia + "-" + mes + "-" + anio;
	}
}

class Persona {
	private Nombre nombre;
	private Fecha fecha;
	private String estatus;

	public Persona (Nombre nombre, Fecha fecha, String estatus) {
		setNombre(nombre);
		setFecha(fecha);
		setEstatus(estatus);
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
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public String getEstatus() {
		return estatus;
	}

	public String mes() {
		String mes = fecha.getMes();
		String nuevoMes = mes.substring(1, 2);
		String meses = "123456789101112";
		int pos;
		pos = meses.indexOf(nuevoMes);
		if (pos == 8)
		nuevoMes = "Septiembre";
		return "Nacio en: " + nuevoMes;
	}

	public String rfc() {
		Random rand = new Random();
		char c1 = (char)(rand.nextInt(26) + 'a');
		char c2 = (char)(rand.nextInt(26) + 'a');
		int randomNumber = (int)(Math.random()*5);
		return nombre.getAPaterno().substring(0, 1).toUpperCase() + nombre.getAPaterno().substring(1, 2).toUpperCase() + nombre.getAMaterno().substring(0, 1).toUpperCase() + nombre.getPrimerNombre().substring(0, 1).toUpperCase() + fecha.getAnio().substring(2, 4) + fecha.getMes().substring(0, 2) + fecha.getDia().substring(0, 2) + String.valueOf(c1).toUpperCase() + String.valueOf(c2).toUpperCase() + String.valueOf(randomNumber);
	}

	public String toString(){
		return "\n" + "Nombre completo: " + nombre +"\n" + "Fecha de nacimiento: " + fecha + "\n" + "Estatus: " + estatus +"\n";
	}
}

class Main {
	public static void main(String[] args){
		Nombre n = new Nombre(leerNom(), leerAp(), leerAm());
		Fecha f = new Fecha(leerDia(), leerMes(), leerAnio());
		Persona p = new Persona(n, f, leerEstatus());
		System.out.println(p.toString());
		System.out.println(p.getNombre().iniciales());
		System.out.println(p.mes());
		if (p.getEstatus().equals("Persona fisica")) {
			System.out.println(p.rfc());
		}

		Persona p1 = new Persona(n, f, leerEstatus());
		System.out.println(p1.toString());
		System.out.println(p1.getNombre().iniciales());
		System.out.println(p1.mes());
		if (!p1.getEstatus().equals("Persona fisica")) {
			System.out.println("No se muestra RFC dado que no eres una persona fisica.");
		}
	}

	public static String leerNom(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese primer nombre: ");
		return sc.nextLine();
	}
	public static String leerAp(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el apellido paterno: ");
		return sc.nextLine();
	}
	public static String leerAm(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el apellido materno: ");
		return sc.nextLine();
	}
	public static String leerDia(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el dia de nacimiento: ");
		return sc.nextLine();
	}
	public static String leerMes(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el mes de nacimiento: ");
		return sc.nextLine();
	}
	public static String leerAnio(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el anio de nacimiento: ");
		return sc.nextLine();
	}
	public static String leerEstatus(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese su estatus: ");
		return sc.nextLine();
	}
}