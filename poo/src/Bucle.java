import java.util.Scanner;

public class Bucle {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un numero:");
        num= input.nextInt();
        for (int i = 0; i < num; ++i){
            System.out.println(i);
        }
    }
}
