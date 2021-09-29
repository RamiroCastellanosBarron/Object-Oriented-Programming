public class Persona {
	private String edad;
	private Nombre nombre;
	private Direccion direccion;
	private FechaNacimiento fechaNacimiento;

	public Persona (String edad, Nombre nombre, Direccion direccion, FechaNacimiento fechaNacimiento){
		// setEdad(edad);
		// setNombre(nombre);
		// setDireccion(direccion);
		// setFechaNacimiento(fechaNacimiento);
		this.edad=edad;
		this.nombre=nombre;
		this.direccion=direccion;
		this.fechaNacimiento=fechaNacimiento;
	}

	public void setEdad(String edad){
		this.edad=edad;
	}
	public String getEdad(){
		return edad;
	}
	public void setNombra(Nombre nombre){
		this.nombre=nombre;
	}
	public Nombre getNombre(){
		return nombre;
	}
	public void setDireccion(Direccion direccion){
		this.direccion=direccion;
	}
	public Direccion getDireccion(){
		return direccion;
	}
	public void setFechaNacimiento(FechaNacimiento fechaNacimiento){
		this.fechaNacimiento=fechaNacimiento;
	}
	public FechaNacimiento getFechaNacimiento(){
		return fechaNacimiento;
	}

	public String toString(){
		return "\t"+"Edad: "+ this.edad;
	}
}
