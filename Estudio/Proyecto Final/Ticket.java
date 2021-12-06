import java.text.DecimalFormat;
import java.io.*;

public class Ticket implements Serializable{

	private int numTicket;
	private Nombre nombreOperador;
	private String nombreCine;
	private DetalleTicket[] detalleTicket;
	   
	DecimalFormat w = new DecimalFormat("0.00");
	
	public Ticket(int numTicket, Nombre nombreOperador, String nombreCine, DetalleTicket[] d){
	   setNumTicket(numTicket);
	   setNombreOperador(nombreOperador);
	   setNombreCine(nombreCine);
	   setDetalleTicket(detalleTicket);
	}

	public void setDetalleTicket(DetalleTicket[] detalleTicket) {
		this.detalleTicket = detalleTicket;
	}

	public DetalleTicket[] getDetalleTicket() {
		return detalleTicket;
	}
	
	
	public void setNumTicket(int numTicket){
	   this.numTicket=numTicket;
	}
	
	public void setNombreOperador(Nombre nombreOperador){
	   this.nombreOperador=nombreOperador;
	}
	
	public void setNombreCine(String nombreCine){
	   this.nombreCine=nombreCine;
	}
 
	public void setDetalle(DetalleTicket[] detalleTicket){
	   this.detalleTicket = detalleTicket;
	}
	   
	public int getNumTicket(){
	   return numTicket;
	}
	
	public Nombre getNombreOperador(){
	   return nombreOperador;
	}
	
	public String getNombreCine(){
	   return nombreCine;
	}
   
	public double calcularDescuento(){
	   double descuento=0;
	   
	   for(DetalleTicket df : detalleTicket) {
		   descuento+=df.calcularDescuento();
	   }
	   return descuento;
	}
	
	public double calcularSubtotal(){
	   double subtotal = 0;
	   
	   for(DetalleTicket DetalleTicket : detalleTicket) {
		   subtotal += DetalleTicket.calcularImporte();
	   }
	   return subtotal;
	}
	
	public double calcularIVA(){
	   return calcularSubtotal()*0.16;   
	}
	
	public double calcularTotal(){
	   return calcularSubtotal()+calcularIVA();
	}
	
	public String desplegarDetalles(){
	   String detalles = "";
	   
	   for(DetalleTicket DetalleTicket : detalleTicket) {
		   detalles += "\n" + DetalleTicket;
	   }
	   return detalles;
	}

	public String toString() {
		DecimalFormat w = new DecimalFormat("0.00");
		String formato = "%-10s%-10s%-15s%-45s%-15s%-15s%-15s%-15s";
		return "\n\t\t\t" + nombreCine + "\nNumero de Ticket " + numTicket + "\nNombre del operador: " + nombreOperador + 
		"\n\n" + String.format(formato, "Cantidad", "Funcion", "Precio", "% descuento", "Descuento", "Importe") + desplegarDetalles() + 
		"\n\nDescuento: $" + w.format(calcularDescuento()) + "\nSubtotal: $" + w.format(calcularSubtotal()) + "\nIVA 16%: $" + w.format(calcularIVA()) + "\nTotal: $" + w.format(calcularTotal());
	}
}