import java.util.Scanner;

public class Addition {
    public static void main (String [] args){
       Scanner input = new Scanner(System.in);
       int number1;
       int number2;
       int sum,res,mul;

       System.out.print("Ingresar el primer numero:");
       number1= input.nextInt();

       System.out.print("Ingresar el segundo numero:");
       number2= input.nextInt();

       sum = number1 +number2;
       System.out.println("La suma de los numero es:"+sum);

       res = number1 -number2;
        System.out.println("La resta de los numero es:"+res);

        mul = number1 *number2;
        System.out.println("La multiplicacion de los numero es:"+mul);

    }
}
