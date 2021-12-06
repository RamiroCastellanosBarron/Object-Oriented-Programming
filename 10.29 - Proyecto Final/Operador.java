import java.io.*;

public class Operador extends Cuenta {

	public Operador(String usuario, String contrasenia, Nombre nombre, String tipo){
		super(usuario, contrasenia, nombre, tipo);
	}

	public void registrarBoleto(Boleto[] boletos) {
		try {
			File file = new File("");
			if (!file.exists())
				file.createNewFile();
			FileOutputStream f = new FileOutputStream(file);
			ObjectOutputStream f2 = new ObjectOutputStream(f);
			for (Boleto boleto : boletos)
				f2.writeObject(boleto);
			f2.close();
			f.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void generarTicket(Boleto[] boletos, int[] cantidad, double[] descuento) {
		DetalleTicket[] detalles = new DetalleTicket[boletos.length];
		for (int i = 0; i < boletos.length; i++) {
			detalles[i] = new DetalleTicket(cantidad[i], boletos[i].getFuncion().getTitulo(), boletos[i].getPrecio(), descuento[i]);
			boletos[i].setPrecio(boletos[i].getPrecio() * cantidad[i] * descuento[i]);
		}

		registrarBoleto(boletos);
		Ticket ticket = new Ticket((int) (Math.random() * 10000), nombre, "CineMax", detalles);
		System.out.println(ticket);
	}
}