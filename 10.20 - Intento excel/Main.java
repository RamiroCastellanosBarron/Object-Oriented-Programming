

class Main {
	public static void main(String[] args) {
		int[][] tabla = new int[50][50];
		for(int i = 0; i < 50; i++) {
			for(int j = 0; j < 50; j++) {
				tabla[i][j] = (int)(Math.random()*100);
			}
		}
	}
}