//polimorfismo se hace con herencia

public class Main{
	public static void main(String[] args){
		Vehiculo v[] = new Vehiculo[4];
		v[0] = new Vehiculo("5555L", "Mercedes", "C280");
		v[1] = new VehiculoTurismo(4, "2247", "BMW", "m1");
		v[2] = new VehiculoDeportivo(8, "5849L", "Toyota", "Corolla");
		v[3] = new VehiculoFurgoneta(3000, "3321H", "Ferrari", "California");

		for(Vehiculo vehiculos: v) {
			System.out.println(vehiculos.toString());
			System.out.println("");
		}
	}
}