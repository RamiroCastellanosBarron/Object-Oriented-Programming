import java.util.*;

class Main {
	public static void main(String[] args){

		String nombre[] = new String[3];
		for(int i=0;i<3;i++){
			nombre[i]=leer();
		}
		for(int i=0;i<3;i++){
			System.out.println(nombre[i]);
		}
	
		
	}



	static String leer(){
		Scanner sc=new Scanner(System.in);
		System.out.print("  >>  "+"Ingresa tu nombre: ");
		return sc.nextLine();
	}

	

}