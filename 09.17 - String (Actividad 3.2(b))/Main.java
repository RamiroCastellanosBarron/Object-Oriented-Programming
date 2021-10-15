import java.io.*;
import java.util.*;

class Cadena {

   //atributo
   private String t;

   //constructor
   public Cadena(String t) {
      setT(t);
   }

   //set
   public void setT(String t) {
      this.t=t;
   }

   //get
   public String getT() {
      return t;
   }

   

   //1. Determinar cantidad de vocales (substring)
   

   //2. Determinar cantidad de palabras en el texto
   
   //3. Sustituir palabras
   
   //4. Convertir a mayusculas
   public String convertirMayus() {
      return this.t.toUpperCase();
   }
   
   public String toString() {
      return "la cadena de caracteres: "+t;
   }
}

class Main {
   public static void main(String[] args){
      Scanner s=new Scanner(System.in);
      System.out.println("Ingrese el texto: ");
      String texto=s.nextLine();
      Cadena c1=new Cadena(texto);
      int op;
      do {
         System.out.println("Ingrese lo que desee realizar: ");
         System.out.println("1. Mostrar cantidad de vocales.");
         System.out.println("2. Contar palabras.");
         System.out.println("3. Sustituir palabras.");
         System.out.println("4. Convertir a mayusculas.");
         System.out.println("5. Salir.");
         op=s.nextInt();
         switch(op) {
            // case 1: System.out.println("La cantidad de vocales es: "+c1.contVocales());break;
            // case 2: System.out.println("La cantidad de palabras es: "+c1.sacarCantidad());break;
            // case 3: System.out.println("Ingrese la palabra que sera reemplazada en el texto: ");
            //         String palabra=s.nextLine();
            //         System.out.println("La nueva cadena de caracteres es: "+c1.sustituirPalabras(palabra));break; 
            case 4: System.out.println("La nueva cadena de caracteres es: "+c1.convertirMayus());break;
            case 5: 
         }
      } while (op != 5);
   }
}

