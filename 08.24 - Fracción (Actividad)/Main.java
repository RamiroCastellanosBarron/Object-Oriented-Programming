//Ramiro Castellanos Barr�n
//606938
//24 de agosto de 2021
//Doy mi palabra de que he realizado esta actividad con integridad acad�mica
//Hacer un programa que realice la operaci�n de una fracci�n, tienen que ser
//valores enteros y el denominador no puede ser 0, realizar la validaci�n del
//denominador.

//librer�as
import java.io.*;
import java.util.*;

//clase fracci�n
class Fraccion{

   //atributos
   private float numerador;
   private float denominador;
   
   //constructor
   public Fraccion(float numerador,float denominador){
      this.numerador=numerador;
      this.denominador=denominador;
   }
   
   //metodos
   
   //m�todo 1
   public double resultado(){
      return numerador/denominador;
   }
   
   //m�todo 2
   public String toString() {
	   return "Resultado:"+resultado();
	}
}

//clase principal
class Principal{
   public static void main(String arg[]){
   
      //funciones
      Scanner s=new Scanner(System.in);
      
      //variables
      float n,d;
      
      System.out.println("Ingresa el numerador: ");
      n=s.nextFloat();
      
      do{
         System.out.println("Ingresa el denominador: ");
         d=s.nextFloat();
      }while(d==0);
      
      //se crea el primer objeto
      Fraccion f1=new Fraccion(n,d);
      System.out.println(f1);
   }
}