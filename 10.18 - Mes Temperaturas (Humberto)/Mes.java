import java.util.*;
import java.io.*;

class Mes {
   private String nombreMes;
   private double promedioTemp;

  public Mes(String nombreMes, double promedioTemp){
      setNombreMes(nombreMes);
      setPromedioTemp(promedioTemp);
   }

   public void setNombreMes(String nombreMes){
      this.nombreMes=nombreMes;
   }
   
   public void setPromedioTemp(double promedioTemp){
      this.promedioTemp=promedioTemp;
   }
   
   public String getNombreMes(){
     return nombreMes;
   }

   public double getPromedioTemp(){
     return promedioTemp;
   }
   
   public String toString(){
      String formato = "\n%-15s%-15s";
      
      return String.format(formato, nombreMes, promedioTemp+"�C");     
   }

}

class ReporteAnual{

   Mes[] meses;
   int anio;
   
   public ReporteAnual(int anio, Mes[] meses){
      setAnio(anio);
      setMeses(meses);
   }
   
   public void setMeses(Mes[] meses){
      this.meses=meses;
   }
   
   public Mes[] getMeses(){
      return meses;
   }
   
   public void setAnio(int anio){
      this.anio=anio;
   }
   
   public int getAnio(){
      return anio;
   }
   
   public Mes calcularMayorPromedio(){
     double mayor = 0;
     Mes mesMayor=null; 
     for(Mes mes : meses){
       if(mes.getPromedioTemp() > mayor){
         mayor = mes.getPromedioTemp();
         mesMayor=mes;  
       }  
     }
      return mesMayor;
   }
   
   public String toString(){
      String formato = "\n%-15s%-15s";
      String texto = "\nPromedios de temperatura del " + anio + "\n";
      texto+=String.format(formato, "Mes", "PromTemp");
      for(Mes mes : meses)
        texto+=mes;

      Mes mesMasAlto = calcularMayorPromedio();
      texto+="\n\nEl promedio de temperatura mas alto es " + mesMasAlto.getPromedioTemp() + " y pertenece al mes " + mesMasAlto.getNombreMes();
      
      return texto;
   }

}

class Principal{

  public static void main(String[] args) {
      ReporteAnual reporte1 = new ReporteAnual(leerAnio(), leerMeses());
      System.out.println(reporte1);

  }

  public static Mes[] leerMeses(){
    String[] nombres = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    Mes[] meses = new Mes[nombres.length];
    for (int i=0; i<meses.length; i++)
       meses[i]= new Mes(nombres[i], leerPromedio(nombres[i]));
    
    return meses;
    
  }
  
  public static int leerAnio(){
     Scanner x = new Scanner(System.in);
     System.out.print("\nIntroduce el anio a evaluar: ");
     
     return x.nextInt();
  }

  public static double leerPromedio(String nom){
    Scanner x = new Scanner(System.in);
    System.out.print("Introduce el promedio de temperatura mes de " + nom + ": ");

    return x.nextDouble();
  }
    
}
