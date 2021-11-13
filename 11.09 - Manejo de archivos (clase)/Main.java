class Main {
	public static void main(String[] args) {
		
	}
}

/*

DEFINICION Y ESCRITURA DE DATOS

	Definicion del archivo

		File f = new File("c:\\class3.txt");       f es un objeto      lo que va entre "" es una ruta de la pc

	Abrir el archivo (elegir uno de los dos)

		FileOutputStream file = new FileOutputStream(f);
		FileOutputStream file = new FileOutputStream(f, true);		con true nos quedamos donde se quedo

Clases para escribir de datos

	PrintStream f1 = new PrintStream(file);			


	File f = new File();
	FileOutputStream file = new FileOutputStream(f, true);
	PrintStream f1 = new PrintStream(file);

Escribir los datos

	Metodo para escribir en el archivo

		f1.println(string);

	Cerrar el archivo

		f1.close();         esto es lo ultimo que se pone cuando terminas de guardar informacion

	Todo esto debe estar dentro de un try y catch con la excepcion IOException

---------------------------------------------------------------------------------------------------

Definicion y lectura de datos

LECTURA

	Definicion del archivo

		File f = new File("c:\\class3.txt");

	Abrir el archivo

		FileInputStream file = new FileInputStream(f);

	Clases para lectura de datos

		Input StreamReader f1 = new InputStreamReader(file);

		BufferedReader f2 = new BufferedReader(f1);

	Secuencia

		File f = new File("");
		

	Definicion y lectura de datos

		Metodo para leer del archivo

			s = f2.readLine();

		Cerrar el archivo

			f2.close();

	Todo esto debe estar dentro de un try y catch con la excepcion IOException

--------------------------------------------------------------------------------------------------

*/