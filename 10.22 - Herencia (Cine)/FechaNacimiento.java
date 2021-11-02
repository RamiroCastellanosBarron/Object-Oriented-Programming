public class FechaNacimiento extends Fecha {
	public FechaNacimiento (String dia, String mes, String anio) {
		super(dia, mes, anio);
	}

	public void mostrarFechaNacimiento () {
		System.out.println(dia + "-" + mes + "-" + anio);
	}
}