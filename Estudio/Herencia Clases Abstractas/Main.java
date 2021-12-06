// practica de herencia con clases abstractas

import java.util.Scanner;

abstract class Book {
	String title;
	abstract void setTitle(String s);
	String getTitle() {
		return title;
	}
}

class MyBook extends Book {
	@Override
	void setTitle(String s) {
		title = s;
	}
}

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("  >>  Ingrese el nombre del libro: ");
		String title = sc.nextLine();
		MyBook mb = new MyBook();
		mb.setTitle(title);
		System.out.println("The title is: " + mb.getTitle());
		sc.close();
	}
}