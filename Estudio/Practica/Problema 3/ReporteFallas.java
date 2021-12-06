import java.io.*;
import java.util.*;

class ReporteFallas{
   private int fallas[][];
   
   public ReporteFallas(int fallas[][]){
      setFallas(fallas);
   }
   
   public void setFallas(int fallas[][]){
      this.fallas=fallas;
   }
   
   public int[][] getFallas(){
      return fallas;
   }
   
   public int[] calcularSumas(){
      int sumas[]=new int[9];
      int fallas[][]=getFallas();
      for(byte j=0; j<9; j++){
         int acum=0;
         for(byte i=0; i<6; i++){
            acum+=fallas[i][j];
         }
         sumas[j]=acum;
      }
      return sumas;
   }
   
   public int calcularTotalFallas(){
      int total=0;
      int sumas[]=calcularSumas();
      for(byte i=0; i<9; i++){
         total+=sumas[i];
      }
      return total;
   }
   
   public String calcularMayor(){
      int sumas[]=calcularSumas();
      int total=calcularTotalFallas();
      int mayor=sumas[0];
      for(byte i=1; i<9; i++){
         if(sumas[i]>mayor){
            mayor=sumas[i];
         }
      }
      String mayores="";
      for(byte i=0; i<9; i++){
         if(sumas[i]==mayor){
            mayores+=String.valueOf(i+1)+" ";
         }
      }
      return mayores;
   }
  
   public String toString(){
      int sumas[]=calcularSumas();
      int total=calcularTotalFallas();
      String mayores=calcularMayor();
      
      String msj="Total de fallas tipo ";
      String mensaje="";
      for(byte i=0; i<9;i++){
         mensaje+=msj+(i+1)+": "+sumas[i]+"\n";
      }
      
      try{
         File f=new File("c:\\Users\\Oscar\\Documents\\Universidad\\3 Tercer Semestre\\Programación Intermedia\\Programas Java\\Problemas practica\\Reporte.txt");
         FileOutputStream f2=new FileOutputStream(f,true);
         PrintStream f3=new PrintStream(f2);
         f3.println("Reporte semanal de fallas\n\n--------------------------------------------\nTotal de fallas ocurridas: "+total+"\n"+mensaje+"\n\nTipo de falla que mas ocurrio: "+mayores+"\n\n--------------------------------------------");
         f3.close();
      }  
      catch(IOException e){
         System.out.println("Error en archivo");
      }

      
      return "Reporte semanal de fallas\n\n--------------------------------------------\nTotal de fallas ocurridas: "+total+"\n"+mensaje+"\n\nTipo de falla que mas ocurrio: "+mayores+"\n\n--------------------------------------------";
   }
}

class Principal{
   public static void main(String args[]){
      int fallas[][]=new int[6][9];
      byte menu=0;
      menu=desplegarMenu();
      switch(menu){
         case 1:
            fallas=llenarFallas();
            break;
         case 2:
            fallas=extraerFallas();
            break;
      }
      ReporteFallas r1=new ReporteFallas(fallas);
      System.out.println(r1);
      
   }
   
   public static int[][] llenarFallas(){
      int fallas[][]=new int[6][9];
      boolean error=false;
      
      for(byte i=0; i<6; i++){
         for(byte j=0; j<9; j++){
            System.out.println("Ingrese el numero de fallas del tipo "+(j+1)+" para el dia "+(i+1));
            do{
               Scanner s=new Scanner(System.in);
               error=false;
               try{
                  do{
                     fallas[i][j]=s.nextInt();
                     if(fallas[i][j]<0)
                        System.out.println("Ingrese un numero igual y mayor que 0 para el tipo de falla "+(j+1)+" del dia "+(i+1));
                  }while(fallas[i][j]<0);
               }
               catch(InputMismatchException e){
                  System.out.println("Ingrese un valor numerico");
                  error=true;
               }
            }while(error);
         }
      }
      
      try{
         File f=new File("c:\\Users\\Oscar\\Documents\\Universidad\\3 Tercer Semestre\\Programación Intermedia\\Programas Java\\Problemas practica\\Fallas.txt");
         FileOutputStream f2=new FileOutputStream(f,true);
         PrintStream f3=new PrintStream(f2);
         Scanner s=new Scanner(System.in);
         for(int i=0; i<6; i++){
            for(int j=0; j<9; j++){
               f3.println(fallas[i][j]);
            }
         }
         f3.close();
      }
      catch(IOException e){
         System.out.println("Error en archivo");
      }
      return fallas; 
   }
    
   public static byte desplegarMenu(){
      System.out.println("[1]Para registrar errores manualmente\n[2]Para extraer errores de archivo");
      byte a=0;
      boolean error=false;
      do{
         Scanner s=new Scanner(System.in);
         error=false;
         try{
            do{
               a=s.nextByte();
               if(!(a==1 || a==2))
                  System.out.println("Ingrese 1 o 2");
            }while(!(a==1 || a==2));
         }
         catch(InputMismatchException e){
            System.out.println("Ingrese un valor numerico");
            error=true;
         }
      }while(error);
      return a;
   }
   
   public static int[][] extraerFallas(){
      int fallas[][]=new int[6][9];
      try{
         File f=new File("c:\\Users\\Oscar\\Documents\\Universidad\\3 Tercer Semestre\\Programación Intermedia\\Programas Java\\Problemas practica\\Fallas.txt");
         FileInputStream f2=new FileInputStream(f);
         InputStreamReader f3=new InputStreamReader(f2);
         BufferedReader f4=new BufferedReader(f3);
         for(int i=0; i<6; i++){
            for(int j=0; j<9; j++){
               fallas[i][j]=Integer.parseInt(f4.readLine());
            }
         }
         f4.close();
      }
      catch(IOException e){
         System.out.println("Error en archivo");
      }
      return fallas; 
   }
} 
   
   