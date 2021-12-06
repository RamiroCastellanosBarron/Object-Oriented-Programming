import java.io.*;
import java.util.*;

class Ecuacion {
   private double x;

   public Ecuacion(double x) {
      setX(x);
   }

   public void setX(double x) {
      this.x = x;
   }

   public double getX() {
      return x;
   }

   public String toString() {
      return String.valueOf(3 * Math.pow(getX(), 2) + 7 * getX());
   }
}

class Principal {
   public static void main(String args[]) {
      Ecuacion e1 = new Ecuacion(pedirX());
      System.out.println(e1);
   }

   public static double pedirX() {
      boolean error = true;
      double x = 0;
      System.out.println("Ingrese el valor de X para calcular Y, debe de ser numerico");
      do {
         Scanner s = new Scanner(System.in);
         error = false;
         try {
            x = s.nextDouble();
         } catch (InputMismatchException e) {
            System.out.println("Error en la captura, ingrese un valor numerico");
            error = true;
         }

      } while (error);
      return x;
   }
}