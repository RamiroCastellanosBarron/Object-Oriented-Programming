//Ramiro Castellanos Barr�n
//606938
//24 de agosto de 2021
//Doy mi palabra de que he realizado esta actividad con integridad acad�mica
//Crear una clase, asignarle atributos, crear m�todos y hacer el constructor.

//librer�as
import java.io.*;

//clase de aud�fonos
class Audifono{

   //atributos
	private String nombre;
	private String color;
	private String tipo;
   
   //constructor
   public Audifono(String nombre, String color, String tipo){
      this.nombre=nombre;
      this.color=color;
      this.tipo=tipo;
   }
   
   //metodos
   
   //m�todo 1
   public void reproducirSonido(){}
   
   //m�todo 2
   public void conectar(){}
   }
   


//clase principal
class Programa{
   public static void main(String arg[]){
      Audifono var=new Audifono("AirPods", "Blanco", "B�sico");
      System.out.println(Audifono);
   }
}