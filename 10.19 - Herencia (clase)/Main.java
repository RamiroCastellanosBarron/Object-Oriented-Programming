class Persona {
	protected String nombre;
	protected int edad;

	public Persona (String nombre, int edad) {
		setNombre(nombre);
		setEdad(edad);
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	public String toString(){
		return " ";
	}
	public void mostrarDatos() {
		System.out.println(nombre + " tiene " + edad + " anios.");
	}
}

class Hombre extends Persona {
	private String sexo;

	public Hombre (String nombre, int edad, String sexo) {
		super(nombre, edad);
		setSexo(sexo);
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSexo() {
		return sexo;
	}
	public void mostrarDatos() {
		System.out.println(nombre + " es " + sexo + " tiene " + edad + " anios.");
	}
}

class Mujer extends Persona {
	private String sexo;
	
	public Mujer (String nombre, int edad, String sexo) {
		super(nombre, edad);
		setSexo(sexo);
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSexo() {
		return sexo;
	}
	public void mostrarDatos() {
		System.out.println(nombre + " es " + sexo + " tiene " + edad + " anios.");
	}
}

class Main {
	public static void main(String[] args) {
		Persona persona = new Persona("Alejandro", 24);
		Hombre hombre = new Hombre("Ramiro", 21, "Masculino");
		Mujer mujer = new Mujer("Sofia", 18, "Femenino");
		hombre.mostrarDatos();
		mujer.mostrarDatos();
		persona.mostrarDatos();
	}
}



//    extends      se usa en Hijo para heredar de Papa
//    protected    para que el atributo de Papa se pase al Hijo
//                 si le dejas como private no se va a pasar
//    final        se le pone al metodo cuando no quieres que el metodo del Papa se pase al hijo
//                 si quieres que el metodo del papa si se pase al hijo, usar public
//
//    constructor clase Hijo
//
//    se ponen los atributos de clase Papa
//
//    super()      se usa para "set" los atributos del Papa


//    super.metodo()    para adquirir el metodo del papa