public class Main{
	public static void main(String[] args){
		Name nam = new Name("Ramiro", "Castellanos", "Barron");
		Address add = new Address("La Gloria", 220, "Hacienda del Rosario", "San Pedro Garza Garcia", 66247);
		Date dob = new Date(2, 5, 2000);
		Date doe = new Date(1, 8, 2025);
		Customer cus = new Customer(nam, dob, add, "+52 812 080 0336", "ramiro.castellanos@udem.edu", "CABR000502HNLSRMA9");
		Account acc = new Account(cus, 606938, "Premium", "Pesos mexicanos", 3.00f, 5000.00f, doe, 6000.00f);

		
	}
}