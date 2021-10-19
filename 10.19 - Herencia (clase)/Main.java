class Papa {
	protected Sting nombre;
	protected int edad;

	public Papa (String nombre, int edad) {
		setNombre(nombre);
		setEdad(edad);
	}
	public void setNombre(Sting nombre) {
		this.nombre = nombre;
	}
	public Sting getNombre() {
		return nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	public String toString(){
		return getNombre() + " " + getEdad();
	}
}

class Hijo extends Papa {
	public Hijo (String nombre, int edad) {
		super(nombre, edad);

		super.toString();
	}
}

class Main {
	public static void main(String[] args) {
		Papa papa = new Papa("Ramiro", 21);
		papa  h = new Hijo("Ramiro", 21);
		System.out.println(h);

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