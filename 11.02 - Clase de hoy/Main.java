/*

Para hacer clases abstractas tiene que haber herencia, si no hay herencia no puedes hacer clases abstractas,
Eso implica que habra una jerarquia de clases
las clases abstractas por lo menos deben tener un metodo abstracto
ese metodo no es desarrollado por el papa
sino que es desarrollado por las clases hijas
esos metodos abstractos que estan en el papa y que los hijos los desarrolla no pueden ser privados
no podemos crear objetos de una clase abstracta, solamente de los hijitos

CLAUSULA NUEVA ---> abstract

es para que los metodos de esa clase pueda ser abstracto

ejemplo

abstract class FiguraGeometrica {
	public abstract double calcularArea();//la clase abstracta debe tener por lo menos un metodo hijo abstracto
}

class Circulo extends FiguraGeometrica {
	private double radio;
	public double calcularArea() {//se obliga a que el hijo la implemente
		return Math.PI*radio*radio;
	}
}

Estas obligado a desarrollar todos los metodos.

INTERFACES

LAS INTERFACES NO REQUIEREN HERENCIA

Cuando manejamos interfaces, todo lo que le pongas, todo es abstracto

En los interfaces simplemente declaras los metodos, pero no los desarrollas

cuuando trabajas con interfaces son metodos abstractos

y todas las interfaces siempre son publicas

CLAUSULA NUEVA ------> implements

[acces-modifier] interface InterfaceName
[extends ParentInterface]
{
	lista de metodos
}

los interfaces por default son publicos

PALABRA NUEVA -------> interface

Las interfaces pueden tener herencia

si un interface hijo quiere los metodos de su interface padre, debe usar la palabra extends

en el interface no desarrollas los metodos, solo los declaras

EJEMPLO

interface Driveable {
	boolean startEngine();
	void stopEngine();
	float accelerate(float acc);
	boolean turn(Direction dir);
}

class Automobile implements Driveable {
	...
	public boolean startEngine() {
		if (notTooCold) {
			engineRunning = true;
		}
		...
	}

	public void stopEngine() {                      metodo desarrollado
		engineRunning = false;
	}

	public float accelerate(float acc) { }          metodo no desarrollado
	public boolean turn(Direction dir) { }          metodo no desarrollado
}


AQUI NO TIENES QUE DESARROLLARLOS

PERO CON CLASES ABSTRACTAS SIEMPRE DEBES DESARROLLARLO

OTRO EJEMPLO

interface InstrumentoMusical {
	void tocar();
	void afinar();
	String tipoInstrumento();
}

class InstrumentoAcust implements InstrumentoMusical {
	void tocar() {...};
	void afinar() {...};
	String tipoInstrumento() {...};
}

class Guitarra extends InstrumentoAcust {
	String tipoInstrumento() {
		return "Guitarra";
	}
}


PUEDES TENER VARIOS IMPLEMENTS SEPARADOS POR COMAS


*/

abstract class Figura {
	public abstract double calcularArea();
}

class Circulo extends Figura {
	private double radio;
	public Circulo (String nomFigura, double radio) {
		setRadio(radio);
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getRadio() {
		return radio;
	}
	public double calcularArea() {
		return Math.PI*radio*radio;
	}
	public String toString() {
		return " tiene un area de: " + calcularArea();
	}
}

class Triangulo extends Figura {
	private double base;
	private double altura;
	public Triangulo (String nomFigura, double base, double altura) {
		setBase(base);
		setAltura(altura);
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getBase() {
		return base;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return altura;
	}
	public double calcularArea () {
		return base*altura/2;
	}
	public String toString() {
		return " tiene un area de: " + calcularArea();
	}
}

class Rectangulo extends Figura {
	private double base;
	private double altura;

	public Rectangulo (String nomFigura, double base, double altura) {
		setBase(base);
		setAltura(altura);
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getBase() {
		return base;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return altura;
	}
	public double calcularArea () {
		return base*altura;
	}
	public String toString() {
		return " tiene un area de: " + calcularArea();
	}
}

class Cuadrado extends Figura {
	private double lado;
	
	public Cuadrado (String nomFigura, double lado) {
		setLado(lado);
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getLado() {
		return lado;
	}
	public double calcularArea () {
		return lado*lado;
	}
	public String toString() {
		return " tiene un area de: " + calcularArea();
	}
}

class Main {
	public static void main(String[] args) {
		Circulo circulo = new Circulo("Circulo", 5);
		Triangulo triangulo = new Triangulo("Triangulo", 10, 5);
		Rectangulo rectangulo = new Rectangulo("Rectangulo", 10, 5);
		Cuadrado cuadrado = new Cuadrado("Cuadrado", 7);
		System.out.println(circulo.toString());
		System.out.println(triangulo.toString());
		System.out.println(rectangulo.toString());
		System.out.println(cuadrado.toString());
	}
}


//pedir radio del circulo, validar el radio con la excepcion por si es que te dan letras pero eso hacerlo hacerlo en una interfaz 
//hacer una interface, que main implemente interface y que main tenga las excepciones