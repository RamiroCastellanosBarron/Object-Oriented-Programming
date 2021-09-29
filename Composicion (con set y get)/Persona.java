public class Persona {
	private Nombre nombre;
	private FechaNacimiento fechaNacimiento;

	public Persona(Nombre nombre, FechaNacimiento fechaNacimiento){
		setNombre(nombre);
		setFechaNacimiento(fechaNacimiento);	
	}
	public void setNombre(Nombre nombre){
		this.nombre=nombre;
	}
	public Nombre getNombre(){
		return nombre;
	}
	public void setFechaNacimiento(FechaNacimiento fechaNacimiento){
		this.fechaNacimiento=fechaNacimiento;
	}
	public FechaNacimiento getFechaNacimiento(){
		return fechaNacimiento;
	}

	//no necesita un toString porque persona no tiene atributos que mostrar
	//lo que si tiene son objetos
	//los objetos muestran sus atributos
	//no se imprime a la persona en main, sino los objetos que lo componen
	
}
