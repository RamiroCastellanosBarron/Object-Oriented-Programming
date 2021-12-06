// practica de herencia


class Arithmetic {
	public int add(int x, int y) {
		int sum = x + y;
		return sum;
	}
}

class Adder extends Arithmetic {
	public int addCall(int x, int y) {
		return add(x, y);
	}
}

class Main {
	public static void main(String[] args) {
		Adder a = new Adder();
		System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
		System.out.print(a.add(10, 30) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
	}
}