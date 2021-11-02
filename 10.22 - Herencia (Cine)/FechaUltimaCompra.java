public class FechaUltimaCompra extends Fecha {
	public FechaUltimaCompra (String dia, String mes, String anio) {
		super(dia, mes, anio);
	}

	public void mostrarFechaUltimaCompra () {
		System.out.println(dia + "-" + mes + "-" + anio);
	}
}