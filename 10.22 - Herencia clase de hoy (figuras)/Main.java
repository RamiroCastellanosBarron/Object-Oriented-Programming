class Figura {
	protected String nomFigura;

	public Figura (String nomFigura) {
		setNomFigura(nomFigura);
	}
	public void setNomFigura(String nomFigura) {
		this.nomFigura = nomFigura;
	}
	public String getNomFigura() {
		return nomFigura;
	}
	public String toString() {
		return nomFigura;
	}
}

class Circulo extends Figura {
	private double radio;
	public Circulo (String nomFigura, double radio) {
		super(nomFigura);
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
		return super.toString() + " tiene un area de: " + calcularArea();
	}
}

class Triangulo extends Figura {
	private double base;
	private double altura;
	public Triangulo (String nomFigura, double base, double altura) {
		super(nomFigura);
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
		return super.toString() + " tiene un area de: " + calcularArea();
	}
}

class Rectangulo extends Figura {
	private double base;
	private double altura;

	public Rectangulo (String nomFigura, double base, double altura) {
		super(nomFigura);
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
		return super.toString() + " tiene un area de: " + calcularArea();
	}
}

class Cuadrado extends Figura {
	private double lado;
	
	public Cuadrado (String nomFigura, double lado) {
		super(nomFigura);
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
		return super.toString() + " tiene un area de: " + calcularArea();
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