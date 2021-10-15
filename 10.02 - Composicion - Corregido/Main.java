import java.io.*;
import java.util.*;
import java.text.*;

class Cuenta {
	private Cliente cliente;
	private int numeroCuenta;
	private String tipoCuenta;
	private String moneda;
	private double tasaIntAn;
	private double saldoMinReq;
	private Fecha fechaVencimiento;
	private double saldo;

	public Cuenta(Cliente cliente, int numeroCuenta, String tipoCuenta, String moneda, double tasaIntAn, double saldoMinReq, Fecha fechaVencimiento, double saldo) {
		setCliente(cliente);
		setNumeroCuenta(numeroCuenta);
		setTipoCuenta(tipoCuenta);
		setMoneda(moneda);
		setTasaIntAn(tasaIntAn);
		setSaldoMinReq(saldoMinReq);
		setFechaVencimiento(fechaVencimiento);
		setSaldo(saldo);
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public void setTasaIntAn(double tasaIntAn) {
		this.tasaIntAn = tasaIntAn;
	}

	public void setSaldoMinReq(double saldoMinReq) {
		this.saldoMinReq = saldoMinReq;
	}

	public void setFechaVencimiento(Fecha fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public String getMoneda() {
		return moneda;
	}

	public double getTasaIntAn() {
		return tasaIntAn;
	}

	public double getSaldoMinReq() {
		return saldoMinReq;
	}

	public Fecha getFechaVencimiento() {
		return fechaVencimiento;
	}

	public double getSaldo() {
		return saldo;
	}

	// Lectura de saldo inicial
	public void leerSaldoInicial() {
		setSaldo(validarSaldoInicial());
	}

	// Método para realizar el depósito
	public void depositarSaldo() {
		double deposito = validarMonto("\nIngresa el monto a depositar");
		saldo += deposito; // Si es depósito el monto se añade al saldo
		setSaldo(saldo);
	}

	// Método para realizar el retiro
	public void retirarSaldo() {
		double retiro = validarMonto("\nIngresa el monto a retirar");
		if ((saldo - retiro) >= 5000) // Se hace una validación para asegurar que queden al menos $5000 en la cuenta
		{
			saldo -= retiro; // Si es retiro el monto se resta del saldo
			setSaldo(saldo);
		} else
			System.out.println("\nNo puedes retirar esa cantidad. El saldo mínimo debe ser $5000");
	}

	// Método para leer y validar el saldo inicial ingresado
	public static double validarSaldoInicial() {
		Scanner s = new Scanner(System.in);
		double variable = 0;
		boolean valid = false;

		while (!valid) {
			System.out.println("\nIngresa el saldo inicial");
			variable = s.nextDouble();
			if (variable >= 5000) {
				valid = true;
			} else {
				System.out.println("\nEl monto debe ser mayor que $5000");
			}
		}
		return variable;
	}

	// Método para leer y validar los montos de los depósitos y los retiros
	public static double validarMonto(String mensaje) {
		Scanner s = new Scanner(System.in);
		double variable = 0;
		boolean valid = false;

		while (!valid) {
			System.out.println(mensaje);
			variable = s.nextDouble();
			if (variable > 0) {
				valid = true;
			} else {
				System.out.println("\nEl monto debe ser mayor que 0");
			}
		}
		return variable;
	}
}

class Cliente {
	private Nombre nombre;
	private Fecha fecha;
	private Direccion direccion;
	private String telefono;
	private String correo;
	private String rfc;

	public Cliente(Nombre nombre, Fecha fecha, Direccion direccion, String telefono, String correo, String rfc) {
		setNombre(nombre);
		setFecha(fecha);
		setDireccion(direccion);
		setTelefono(telefono);
		setCorreo(correo);
		setRfc(rfc);
	}

	public void setNombre(Nombre nombre) {
		this.nombre = nombre;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public Nombre getNombre() {
		return nombre;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public String getRfc() {
		return rfc;
	}
}

class Nombre {
	private String primerNombre;
	private String apellido1;
	private String apellido2;

	public Nombre(String primerNombre, String apellido1, String apellido2) {
		setPrimerNombre(primerNombre);
		setApellido1(apellido1);
		setApellido2(apellido2);
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public String toString() {
		return primerNombre + " " + apellido1 + " " + apellido2;
	}
}

class Fecha {
	private int dia;
	private int mes;
	private int anio;

	public Fecha(int dia, int mes, int anio) {
		setDia(dia);
		setMes(mes);
		setAnio(anio);
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnio() {
		return anio;
	}

	public String toString() {
		return dia + "/" + mes + "/" + anio;
	}
}

class Direccion {
	private String calle;
	private int numCalle;
	private String colonia;
	private String municipio;
	private int codigoPostal;

	public Direccion (String calle, int numCalle, String colonia, String municipio, int codigoPostal) {
		setCalle(calle);
		setNumCalle(numCalle);
		setColonia(colonia);
		setMunicipio(municipio);
		setCodigoPostal(codigoPostal);
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCalle() {
		return calle;
	}
	public void setNumCalle(int numCalle) {
		this.numCalle = numCalle;
	}
	public int getNumCalle() {
		return numCalle;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getColonia() {
		return colonia;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public String toString(){
		return getCalle() + " " + getNumCalle() + ", " + getColonia() + ", " + getMunicipio() + " " + getCodigoPostal();
	}
}

class Main {
	public static void main(String[] args) {
	
		DecimalFormat y = new DecimalFormat("0.00");

		//Llenado del nombre
		Nombre nombre1 = new Nombre("Melania","Hernández","Coronado");

		//Llenado de la fecha de nacimiento
		Fecha fechaNacim1 = new Fecha(7,11,2000);

		//Llenado de la dirección
		Direccion dirDom1 = new Direccion("Encelade",623,"Residencial Nova","San Nicolás de los Garza",66464);

		//Llenado de la clase Cliente
		Cliente cliente1 = new Cliente(nombre1,fechaNacim1,dirDom1,"83769824","melania.hernandez@udem.edu","HEC12JS8219A0");

		//Llenado de la fecha de la clase Cuenta
		Fecha fechaVencim1 = new Fecha(10,11,2022);

		//Llenado del resto de atributos de la clase Cuenta
		Cuenta cuenta1  = new Cuenta(cliente1,1234,"Oro","Pesos mexicanos",3,5000.00f,fechaVencim1,0);

		//Impresión de datos
		System.out.println("\nDatos de la cuenta\n");
		System.out.println("Nombre del cliente: "+cuenta1.getCliente().getNombre().toString());
		System.out.println("Fecha de nacimiento: "+cuenta1.getCliente().getFecha().toString());
		System.out.println("Dirección: "+cuenta1.getCliente().getDireccion().toString());
		System.out.println("Teléfono: "+cuenta1.getCliente().getTelefono());
		System.out.println("Correo: "+cuenta1.getCliente().getCorreo());
		System.out.println("RFC: "+cuenta1.getCliente().getRfc());
		System.out.println("Número de cuenta: "+cuenta1.getNumeroCuenta());
		System.out.println("Tipo de cuenta: "+cuenta1.getTipoCuenta());
		System.out.println("Moneda: "+cuenta1.getMoneda());
		System.out.println("Tasa de interés anual: "+cuenta1.getTasaIntAn()+"%");
		System.out.println("Saldo mínimo requerido: $"+y.format(cuenta1.getSaldoMinReq()));
		System.out.println("Fecha de vencimiento: "+cuenta1.getFechaVencimiento().toString());
		System.out.println("Saldo actual: "+cuenta1.getSaldo());

		cuenta1.leerSaldoInicial();

		char resp ='s';

		while (resp=='s') {
			char clave = validarRespTrans("\nIngresa el tipo de transacción a realizar: [D] para depósito y [R] para retiro");
			if (clave=='d') {
				cuenta1.depositarSaldo();
			} else if (clave == 'r') {
				cuenta1.retirarSaldo();
			}
			
			System.out.println("\nSaldo actual: $" + y.format(cuenta1.getSaldo()));
			resp = validarRespFin("\n¿Deseas hacer otra transacción? Ingresa [S] para Sí o [N] No");
		}

	}

	// Método para leer y validar la opción ingresada
	public static char validarRespTrans(String mensaje) {
		Scanner s = new Scanner(System.in);
		char variable = ' ';
		boolean valid = false;

		while (!valid) {
			System.out.println(mensaje);
			variable = s.next().toLowerCase().charAt(0);
			if (variable == 'd' || variable == 'r') {
				valid = true;
			} else {
				System.out.println("\nDebes ingresar solamente [D] o [R]");
			}
		}

		return variable;
	}

	// Método para leer y validar la respuesta del ciclo
	public static char validarRespFin(String mensaje) {
		Scanner s = new Scanner(System.in);
		char variable = 'f';
		boolean valid = false;

		while (valid == false) {
			System.out.println(mensaje);
			// variable = s.next().toLowerCase().charAt[0];
			variable = s.next().charAt(0);
			if (variable == 's' || variable == 'n'){
				valid = true;
			} else {
				System.out.println("\nDebes ingresar solamente [S] o [N]");
			}
		}
		return variable;
	}
}