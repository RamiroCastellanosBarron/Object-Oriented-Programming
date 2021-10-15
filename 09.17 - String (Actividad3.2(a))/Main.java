import java.io.*;
import java.util.*;

class Texto {
  private String t;
  public Texto(String t){
  setTexto(t);
  }

  public void setTexto(String t){
    this.t=t;
  }

  public String getTexto() {
    return t;
  }

  //metodo calcular longitud del texto
  public int calcularLong() {
    return t.length();
  }

  //metodo calcular cantidad de palabras
  public int calcularCantPalabras() {
    StringTokenizer w=new StringTokenizer(t," ");
    return w.countTokens();
  }

  //metodo para desplegar lista de palabras
  public void desplegarListaPalabras() {
    String pal[]=t.split(" ");
    for(int i=0;i<pal.length;i++)
     System.out.println(pal[i]);
   }


  public String toString(){
    return contenido;
  }
}

class Main {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    System.out.println("ingresa el texto");
    String texto=x.nextLine();
    Texto t1=new Texto(texto);
    int opcion;
    do {
      System.out.println("1.Longitud del texto.\n2.Cantidad de palabras.\n3.Desplegar palabras.\n4.Salir.");
      opcion=x.nextInt();
        switch (opcion){
        case 1: System.out.println("la longitud es:"+ t1.calcularLong());break;
        case 2: System.out.println("cantidad de palabras:" +t1.calcularCantPalabras());break;
        case 3: t1.desplegarListaPalabras();break;
      }
    } while (opcion != 4);
  }
}
