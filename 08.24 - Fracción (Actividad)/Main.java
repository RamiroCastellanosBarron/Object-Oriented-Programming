//Ramiro Castellanos Barrón
//606938
//24 de agosto de 2021
//Doy mi palabra de que he realizado esta actividad con integridad académica
//Hacer un programa que realice la operación de una fracción, tienen que ser
//valores enteros y el denominador no puede ser 0, realizar la validación del
//denominador.

//librerías
import java.io.*;
import java.util.*;

//clase fracción
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
   
   //método 1
   public double resultado(){
      return numerador/denominador;
   }
   
   //método 2
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