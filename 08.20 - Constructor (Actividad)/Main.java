//Ramiro Castellanos Barrón
//606938
//24 de agosto de 2021
//Doy mi palabra de que he realizado esta actividad con integridad académica
//Crear una clase, asignarle atributos, crear métodos y hacer el constructor.

//librerías
import java.io.*;

//clase de audífonos
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
   
   //método 1
   public void reproducirSonido(){}
   
   //método 2
   public void conectar(){}
   }
   


//clase principal
class Programa{
   public static void main(String arg[]){
      Audifono var=new Audifono("AirPods", "Blanco", "Básico");
      System.out.println(Audifono);
   }
}