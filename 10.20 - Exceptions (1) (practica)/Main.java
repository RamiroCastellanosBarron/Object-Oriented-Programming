class Main {
	public static void main(String[] args) {
		int[] numeros = new int[10];
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random()*100);
		}
		try {
			for(int i = 0; i < 20; i++) {
				System.out.println(numeros[i]);
			}
		} catch (Exception e) {
			System.out.println("Ese numero no existe.");
		}
	}
}