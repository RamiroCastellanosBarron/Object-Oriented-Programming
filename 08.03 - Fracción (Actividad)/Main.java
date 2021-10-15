//Ramiro Castellanos Barrón
//606938
//3 de agosto de 2021
//Doy mi palabra de que he realizado esta actividad con integridad académica.
//Realizar un programa que realize la operación de una fracción, el denominador
//no puede ser 0, realizar la validación de la entrada de información y
//desplegar el resultado.

//librerías
import java.io.*;
import java.util.*;
import java.text.*;

//clase principal
class Calculo{
    public static void main(String[] arg){
    
        //funciones
        Scanner s=new Scanner(System.in);
        DecimalFormat w=new DecimalFormat("0.00");
        
        //variables
        int x=0;
        int token=0;
        float acumulador=0;
        float operacion=0;
        int iteracion=0;
        int numero=1;
        float factorial=0;
        
        //interfaz
        System.out.println("\n\n\n");
        System.out.print("____________________________________________________\n");
        System.out.print("|                                                  |\n");
        System.out.print("|                  CALCULADORA                     |\n");
        System.out.print("|__________________________________________________|\n");
        System.out.print("____________________________________________________\n");
        System.out.print("|                                                  |\n");
        System.out.print("|   >> Este programa calcula la siguiente serie:   |\n");
        System.out.print("|                                                  |\n");
        System.out.print("|                2     3     4                     |\n");
        System.out.print("|               X     X     X                      |\n");
        System.out.print("|          1 + --- + --- + --- ...                 |\n");
        System.out.print("|               2!    3!    4!                     |\n");
        System.out.print("|                                                  |\n");
        System.out.print("|   >> El valor de x debe ser mayor o igual que 0, |\n");
        System.out.print("|      o menor o igual a 1.                        |\n");
        System.out.print("|__________________________________________________|\n\n");
        
        
        while(token==0){
            System.out.print("    >> Ingresa el valor de x: ");
            x = s.nextInt();
            if(x>1){
                System.out.println("\n    >> "+x+" no es un numero valido.\n");
            }
            if(x<0){
                System.out.println("\n    >> "+x+" no es un numero valido.\n");
            }
            if(x>0 && x<1){
                while(iteracion<10){
                    for(int i=1;i<=numero;i++){
                        factorial=factorial*i;
                    }
                    iteracion++;
                    operacion=((x)^(numero))/(factorial);
                    numero++;
                    acumulador=acumulador+operacion;
                    System.out.println("   "+iteracion+".  "+w.format(acumulador));
                }
                System.out.println("El numero final es: "+acumulador);
            token=1;
            }
        }
    }
}