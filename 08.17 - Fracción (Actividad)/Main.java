//Ramiro Castellanos Barr�n
//606938
//17 de agosto de 2021
//Doy mi palabra de que he realizado esta actividad con integridad acad�mica.
//Realizar un programa que realize la operaci�n de una fracci�n, el denominador
//no puede ser 0, realizar la validaci�n de la entrada de informaci�n y
//desplegar el resultado.

//librer�as
import java.io.*;
import java.text.*;
import java.util.*;

//clase programa
class Programa{
   public static void main(String[] args){
   
      //funciones
      DecimalFormat w=new DecimalFormat("0.00");
      Scanner s=new Scanner(System.in);
      
      //variables
      float d1,n1;
      d1=1;
      n1=1;
      float o=1;
      
      //loop
      while(d1 == 0){
         System.out.println("Ingresa el numerador: ");
         n1=s.nextFloat();
         System.out.println("Ingresa el denominador: ");
         d1=s.nextFloat();
         if(d1==0){
            System.out.println("El denominador no puede ser 0.");
         }
      }
      o=n1/d1;
      System.out.println(o);
   }
}