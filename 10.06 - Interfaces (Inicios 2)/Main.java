public class Main{
	public static void main(String[] args){
		Pordos classs = new Pordos();
		Portres classss = new Portres();

		for(int i=0;i<5;i++){
			System.out.println(classs.getNext());
		}	

		System.out.print("\n"+"\n"+"\n");
		for(int i=0;i<5;i++){
			System.out.println(classss.getNext());
		}	
	}
}