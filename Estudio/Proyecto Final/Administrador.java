import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Administrador extends Cuenta implements Serializable {

	public Administrador(String usuario, String contrasenia, Nombre nombre, String tipo) {
		super(usuario, contrasenia, nombre, tipo);
	}

	public void generarReporte(ArrayList<Boleto> boletosVendidos, ArrayList<Funcion> funciones) {
		try {
			String ruta = "C:\\Users\\humbe\\OneDrive - Universidad Tecmilenio\\Desktop\\ITC\\3er semestre\\Programacion intermedia\\10.29 - Proyecto Final\\Base de datos\\Reportes.dat";
			File file = new File(ruta);
			Reporte reporte = new Reporte(boletosVendidos, funciones);
			if (!file.exists()) {
				file.createNewFile();
			}
			FileOutputStream f = new FileOutputStream(file);
			ObjectOutputStream f2 = new ObjectOutputStream(f);
			f2.writeObject(reporte);
			f2.close();
			f.close();
		} catch (IOException e) {
			System.out.println("Error en el archivo.");
		}
	}

	public void consultarReporte() {
		try {
			String ruta = "C:\\Users\\humbe\\OneDrive - Universidad Tecmilenio\\Desktop\\ITC\\3er semestre\\Programacion intermedia\\10.29 - Proyecto Final\\Base de datos\\Reportes.dat";
			FileInputStream f = new FileInputStream(ruta);
			ObjectInputStream f2 = new ObjectInputStream(f);
			Reporte r = (Reporte) f2.readObject();
			System.out.println(r);
			f2.close();
			f.close();
		} catch (EOFException e) {
			System.out.println("Se llegó al fin del archivo.");
		} catch (IOException e) {
			System.out.println("Error en el archivo.");
		} catch (ClassNotFoundException e) {
			System.out.println("Clase no definida");
		}
	}

	public void crearCartelera() {

		ArrayList<Funcion> funciones = new ArrayList<>();
		char d = 's';
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("\n  >>  Ingrese el titulo de la funcion: ");
			String titulo = sc.nextLine();
			System.out.print("\n  >>  Ingrese el idioma de la funcion: ");
			String idiomas = sc.nextLine();
			System.out.print("\n  >>  Ingrese si la funcion tiene subtitulos: ");
			String subtitulos = sc.nextLine();
			System.out.print("\n  >>  Ingrese los asientos disponibles que tiene la funcion: ");
			int disponibilidad = sc.nextInt();
			System.out.print("\n  >>  Ingrese el dia de la funcion: ");
			int dia = sc.nextInt();
			System.out.print("\n  >>  Ingrese el mes de la funcion: ");
			int mes = sc.nextInt();
			System.out.print("\n  >>  Ingrese el anio de la funcion: ");
			int anio = sc.nextInt();
			Fecha fecha = new Fecha(dia, mes, anio);
			System.out.print("\n  >>  Ingrese la hora de la funcion: ");
			int h = sc.nextInt();
			System.out.print("\n  >>  Ingrese el minuto en que empieza la funcion: ");
			int minuto = sc.nextInt();
			System.out.print("\n  >>  Ingrese si es en (AM o PM?): ");
			String tipo = sc.nextLine();
			Hora hora = new Hora(h, minuto, tipo);
			Funcion f = new Funcion(titulo, idiomas, subtitulos, 1, disponibilidad, fecha, hora);
			funciones.add(f);
			System.out.print("  >>  Desea continuar agregando funciones? [s = si, n = no]");
			d = sc.nextLine().charAt(0);
		} while (d != 'n' && d != 'N');
		
		try {
			String ruta = "C:\\Users\\humbe\\OneDrive - Universidad Tecmilenio\\Desktop\\ITC\\3er semestre\\Programacion intermedia\\10.29 - Proyecto Final\\Base de datos\\Cartelera.dat";
			File file = new File(ruta);
			Cartelera cartelera = new Cartelera(funciones);
			if (!file.exists()) {
				file.createNewFile();
			}
			FileOutputStream f = new FileOutputStream(file);
			ObjectOutputStream f2 = new ObjectOutputStream(f);
			f2.writeObject(cartelera);
			f2.close();
			f.close();
		} catch (IOException e) {
			System.out.println("Error en el archivo.");
		}
	}
	
   public void modificarCartelera(Cartelera cartelera, char tipoOperacion, Funcion funcion){
      Scanner x = new Scanner(System.in);
      String ruta = "C:\\Users\\humbe\\OneDrive - Universidad Tecmilenio\\Desktop\\ITC\\3er semestre\\Programacion intermedia\\10.29 - Proyecto Final\\Base de datos\\Cartelera.dat";
      ArrayList<Funcion> funciones = cartelera.getFunciones(); int modificador=0;

      switch(tipoOperacion){
        case 'A': case 'a': funciones.add(funcion); break;
        case 'C': case 'c': 
             System.out.print("\nTitulo de la funcion a cambiar por: ");
             String titulo = x.nextLine();
             for(int i=0; i<funciones.size(); i++){
                if(titulo.equalsIgnoreCase(funcion.getTitulo()))
                  modificador=i;
             }
             funciones.set(modificador, funcion);
        break;
        case 'R': case 'r': 
             for(int i=0; i<funciones.size(); i++){
                if(funciones.get(i).getTitulo().equalsIgnoreCase(funcion.getTitulo()))
                  modificador=i;
             }
             funciones.remove(modificador);
        break;
      }
      cartelera.setFunciones(funciones);
      try{
        FileOutputStream fileOutput = new FileOutputStream(ruta); 
        ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
        objectOutput.writeObject(cartelera);
        objectOutput.close();
        fileOutput.close();
      }catch(IOException e){
          e.printStackTrace();
      }
  }
}