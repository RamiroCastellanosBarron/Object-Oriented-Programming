/*Ramiro Castellanos Barr�n         606938
Axel Leonardo Quintanilla Sustaita  567662
Juan Pablo Garc�a Ruiz              572721
Luis Villacorta Pacheco             558190
Jos� Humberto Cavazos Trevi�o       531712

3 de septiembre de 2021

Actividad 6.1 - Arreglar el programa dado en la actividad
Damos nuestra palabra de que hemos realizado esta
actividad con integridad acad�mica.*/

class Ecuacion{
  //atributos
  private double a; /* a. representa el valor del coeficiente cuadratico */ 
  private double b; /* b. representa el valor del coeficiente lineal */ 
  private double c; /* c. representa el valor de la constante */ 
   
  //constructor
  public Ecuacion(double a,double b,double c){
    seta(a);
    setb(b);
    setc(c);
  }
  
  //metodo set a
  public void seta(double a){
    this.a=a;
  }
  
  //metodo set b
  public void setb(double b){
    this.b=b;
  }
  
  //metodo set c
  public void setc(double c){
    this.c=c;
  }
  
  //metodo get a
  public double geta(){
    return a;
  }
  
  //metodo get b
  public double getb(){
    return b;
  }
  
  //metodo get c
  public double getc(){
    return c;
  }

  //metodo que calcula la raiz
  public double calcularRaiz(){
    double d,r;
    d=((b*b)-(4*a*c));
    if(d<0){
      r=0;
      System.out.println("Error:discriminante negativo.");
    }  
    else{
      r=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
    }
    return r;
  }
  
  //metodo que calcula la segunda raiz
  public double calcularRaiz2(){
    double d=(b*b)-(4*a*c);
    double r;
    if(d<0){
      r=0;
      System.out.println ("Error:discriminante negativo");
    }
    else{
      r=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
    }
    return r;
  }

  //metodo toString
  public String toString(){
    return "Las raices de la Ecuacion:"+geta()+"x^2 + "+getb()+"x + "+getc()+"son:"+"r1="+calcularRaiz()+"r2="+calcularRaiz2();
  }
}

//clase principal
class Principal{
   public static void main(String args[]){
      Ecuacion Ec1=new Ecuacion(1,2,1);
      System.out.println(Ec1);
      Ecuacion Ec2=new Ecuacion(8,6,4);
      System.out.println(Ec2);
      Ecuacion Ec3=new Ecuacion(4,2,3);
      System.out.println(Ec3);
   }
}
