import java.util.*;

public class Main{
    public static void main(String[] args){
        Persona p=new Persona(readName(), readCurp(), readPhone(), readDate());
        System.out.println(p);
    }

    //function to pass data to object person
    public static String readName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre completo: ");
        return sc.nextLine();
    }

    //function to pass data to object person
    public static String readCurp(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su CURP: ");
        return sc.nextLine();
    }

    //function to pass data to object person
    public static String readPhone(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su telefono: ");
        return sc.nextLine();
    }

    //function to pass data to object person
    public static String readDate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su fecha de nacimiento: ");
        return sc.nextLine();
    }
}