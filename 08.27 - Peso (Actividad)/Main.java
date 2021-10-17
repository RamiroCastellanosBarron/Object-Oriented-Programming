/*Ramiro Castellanos Barr�n
606938
27 de agosto de 2021
Un programa con objeto persona que pueda ser hombre o mujer
que calcule el �ndice de grasa corporal y la masa ideal de
un paciente
Doy mi palabra de qeu he realizado esta actividad con integridad acad�mica.*/

import java.io.*;          //librerias
import java.util.*;

class Persona{             //clase persona
   private String userName,password,sex;      //atributos
   private int height,mass;
   public Persona(String userName,String password,String sex,int height,int mass){     //constructor
      this.userName=userName;
      this.password=password;
      this.sex=sex;
      this.height=height;
      this.mass=mass;
   }
   public int calcularIndiceMasaCorporal(){        //metodo 1
      return mass/(height/100)*(height/100);
   }
   public int calcularMasaIdeal(){                 //metodo 2
      if(sex=="M"){
         return height-((height/100)*100);
      }
      else{
         int variableN;
         variableN=(height-((height/100)*100))-10;
         return variableN;
      }
   }
   public String toString(){                       //metodo 3
	   return "El indice de masa corporal es: "+calcularIndiceMasaCorporal()+" y la masa ideal es: "+calcularMasaIdeal();
	}
}

//..................................................................................................................................................

class Principal{                                                                             //clase principal
   public static void main(String arg[]){
      Scanner s=new Scanner(System.in);                                                      //funciones
      String nombreUsuario,passwordUsuario,caracteres,numeros,sexoUsuario;                                     //variables
      int longitudPassword,altura,masa;
      caracteres="!@#$%&*()'+,-./:;<=>?[]^_`{|}";
      numeros="1234567890";
      boolean val[]=new boolean[5];
      for(int i=0;i<5;i++){val[i]=false;}
      char actChar[]=new char[3];
      System.out.println("\nBIENVENIDO AL SISTEMA!\n");
      System.out.print("  >>  Ingresa el nombre de usuario: ");
      nombreUsuario=s.nextLine();                                                                           //leer nombre del usuario
      System.out.print("\n  >>  Ingresa tu password "+nombreUsuario+": ");                                  //decir nombre del usuario
      do{
         passwordUsuario=s.nextLine();                                                                      //leer password
         System.out.println("\n  >>  Password ingresado: "+passwordUsuario+".\n");                          //decir password
         
         longitudPassword=passwordUsuario.length();                                                             //calcular longitud del password
         if(longitudPassword<8){System.out.println("\tno\t\tlongitud ("+longitudPassword+" caracteres).");}      //longitud
         else{
            val[0]=true;
            System.out.println("\tsi\t\tlongitud ("+longitudPassword+" caracteres).");
         }
         for(int i=0;i<passwordUsuario.length();i++){                                                       //mayuscula
            actChar[0]=passwordUsuario.charAt(i);
            if(Character.isUpperCase(actChar[0])){
                val[1]=true;
                break;
            }
         }
         if(val[1]==true){System.out.println("\tsi\t\tmayuscula");}
         else{System.out.println("\tno\t\tmayuscula");}
         
         for(int i=0;i<passwordUsuario.length();i++){                                                       //especial
            actChar[1]=passwordUsuario.charAt(i);
            if(caracteres.contains(Character.toString(actChar[1]))){
               val[2]=true;
               break;
            }
         }
         if(val[2]==true){System.out.println("\tsi\t\tcaracter especial");}
         else{System.out.println("\tno\t\tcaracter especial");}
         
         for(int i=0;i<passwordUsuario.length();i++){                                                       //numero
            actChar[2]=passwordUsuario.charAt(i);
            if(numeros.contains(Character.toString(actChar[2]))){
               val[3]=true;
               break;
            }
         }
         if(val[3]==true){System.out.println("\tsi\t\tnumero");}
         else{System.out.println("\tno\t\tnumero");}
         
         if(val[0]==true && val[1]==true && val[2]==true && val[3]==true){                                  //todas
            System.out.println("\tsi\t\ttodas");
            System.out.println("\n  >>  "+passwordUsuario+" es un password valido.\n");
            val[4]=true;
         }
         else{
            for(int i=0;i<5;i++){val[i]=false;}
            System.out.println("\tno\t\ttodas");
            System.out.print("\n  >>  Ingrese un nuevo password: ");
         }
         
      }while(val[4]==false);
      
      System.out.println("  >>  BIENVENIDO "+nombreUsuario+".\n");
      System.out.println("  >>  Ingresa el sexo del paciente: ");                            //sexo del paciente
      System.out.println("\n         M --> Masculino");
      System.out.println("         F --> Femenino");
      sexoUsuario=s.nextLine(); 
      System.out.println("  >>  Ingresa la altura del paciente en centimetros: ");                 //altura
      altura=s.nextInt();
      System.out.println("Ingresa la masa del paciente: ");
      masa=s.nextInt();
      Persona p1=new Persona(nombreUsuario,passwordUsuario,sexoUsuario,altura,masa);
      System.out.println(p1);
   }
}

/*Autenticaci�n y autorizaci�n (password longitud de 8 caracteres
por lo menos, una may�scula, un caracter especial y un n�mero)
Comentarios-objetivo y en m�todos
Indentaci�n en el c�digo
Validaci�n de datos en la captura (por m�todos)*/