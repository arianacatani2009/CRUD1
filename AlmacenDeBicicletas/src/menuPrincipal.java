import java.util.Scanner;

public class menuPrincipal {
  public static void main(String[] args){
    Scanner entrada=new Scanner(System.in);
    Bicicleta miBicicleta= new Bicicleta();
    Bicicleta tuBicicleta= new Bicicleta();
    Bicicleta nuestraBicicleta= new Bicicleta();

    int temporal=entrada.nextInt();
    miBicicleta.establecerMarchas(temporal);
    tuBicicleta.establecerMarchas( 5);
    nuestraBicicleta.establecerMarchas( 4);

    System.out.println(miBicicleta.obtenerMarchas());
    System.out.println(tuBicicleta.obtenerMarchas());
    System.out.println(nuestraBicicleta.obtenerMarchas());

  }
}