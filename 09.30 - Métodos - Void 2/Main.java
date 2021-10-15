import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("\n"+"\n"+"\t"+"PROGRAMA"+"\n");
		String pn,sn;
		System.out.print("Ingresa tu primer nombre: ");
		pn=sc.nextLine();
		System.out.print("Ingresa tu segundo nombre: ");
		sn=sc.nextLine();
		imprimir(pn,sn);

	}
	
	static void imprimir(String primerNombre, String segundoNombre){
		System.out.println("Tu primer nombre es: "+primerNombre);
		System.out.println("Tu segundo nombre es: "+segundoNombre);
	}
}