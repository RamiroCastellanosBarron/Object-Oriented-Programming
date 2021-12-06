import java.io.*;
import java.util.*;
import java.text.*;

class Hotel{
   private Cliente cliente;
   private Habitacion habitacion;
   
   public Hotel(Cliente cliente, Habitacion habitacion){
      //Se deberia de crear como un arreglo de objetos, donde se pueda tener un numero de clientes y habitaciones. Para este problema se realizara como uno para cada uno.
      setCliente(cliente);
      setHabitacion(habitacion);
   }
   
   public void setCliente(Cliente cliente){
      this.cliente=cliente;
   }
   
   public Cliente getCliente(){
      return cliente;
   }
   
   public void setHabitacion(Habitacion habitacion){
      this.habitacion=habitacion;
   }
   
   public Habitacion getHabitacion(){
      return habitacion;
   }
   
   public double calcularDescuento(){
      byte descuento=0;
      if(cliente.getDias()>15)
         descuento=20;
      else if(cliente.getDias()>10)
         descuento=15;
      else if(cliente.getDias()>5)
         descuento=10;
      return calcularSubtotal()*(descuento/100.0);
   }
   
   public double calcularSubtotal(){
      return cliente.getDias()*habitacion.getCostoDiario();
   }
   
   public double calcularTotal(){
      return calcularSubtotal()-calcularDescuento();
   }
   
   public String toString(){
      DecimalFormat df=new DecimalFormat("0.00");
      return "Subtotal: $"+df.format(calcularSubtotal())+"\nDescuento: $"+df.format(calcularDescuento())+"\nTotal: $"+df.format(calcularTotal());
   }
}

class Cliente{
   private int dias;
   
   public Cliente(int dias){
      setDias(dias);
   }
   
   public void setDias(int dias){
      this.dias=dias;
   }
   
   public int getDias(){
      return dias;
   }
   
   public String toString(){
      return "El cliente se quedara por "+getDias()+" dias.";
   }
}

class Habitacion{
   private double costoDiario;
   
   public Habitacion(double costoDiario){
      setCostoDiario(costoDiario);
   }
   
   public void setCostoDiario(double costoDiario){
      this.costoDiario=costoDiario;
   }
   
   public double getCostoDiario(){
      return costoDiario;
   }
   
   public String toString(){
      return "El costo diario de la habitacion es: $"+getCostoDiario();
   }
}

class Principal{
   public static void main(String args[]){   
      Hotel h1=new Hotel(new Cliente(pedirDias()), new Habitacion(pedirCostoDiario()));
      System.out.println(h1);
   }
   
   public static byte pedirDias(){
      boolean error=true;
      byte dias=0;
      System.out.println("Ingrese numero de dias que se hospedara el cliente");
      do{
         Scanner s=new Scanner(System.in);
         error=false;
         try{
            do{
               dias=s.nextByte();
               if(dias<1)
                  System.out.println("Ingrese una cantidad mayor a 0");
            }while(dias<1);
         }
         catch(InputMismatchException e){
            System.out.println("Error en la lectura");
            error=true;
         }
         
      }while(error);
      return dias;
   }
   
   public static double pedirCostoDiario(){
      boolean error=true;
      double costo=0;
      System.out.println("Ingrese costo diario de la habitacion");
      do{
         Scanner s=new Scanner(System.in);
         error=false;
         try{
            do{
               costo=s.nextDouble();
               if(costo<1)
                  System.out.println("Ingrese una cantidad mayor a 0");
            }while(costo<1);
         }
         catch(InputMismatchException e){
            System.out.println("Error en la lectura");
            error=true;
         }
         
      }while(error);
      return costo;
   }
}