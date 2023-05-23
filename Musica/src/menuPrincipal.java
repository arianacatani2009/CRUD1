import java.util.Scanner;

public class menuPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Genero rock = new Genero("Rock", "120bpn", 1950, "EU", "Chuck Berry", "Festival de california");
        Genero Pop = new Genero("Pop", "90bpn", 2017, "Ecuador", "Melendi", "Festival en Ecuador");
        Genero Vallenato = new Genero("Vallenato", "80bpn", 2023, "Colombia", "Binomio de oro", "Festival de colombia");

        System.out.println(Pop.getAnio());
        System.out.println(rock.getAnio());
        System.out.println(Vallenato.getAnio());

        System.out.println(rock.getAnio() + Pop.getAnio() + Vallenato.getAnio());
        rock.setAnio(1900);
        Pop.setAnio(2000);
        Vallenato.setAnio(2010);

        System.out.println(rock.getAnio());
        System.out.println(Pop.getAnio());
        System.out.println(Vallenato.getAnio());
//ingreso de datos
        int anioTemporal=2010;
        int opcion;
        String generos;
        String tipo;
        String ritmo;
        int anio;
        String pais;
        String artista;
        String festival;

        System.out.println("USUARIO desea cambiar de genero");
        System.out.println("1.-Si");
        System.out.println("2.-No");
        opcion = sc.nextInt();
        if (opcion == 1 || opcion == 2){
            System.out.println("Ingrese un genero:");
            generos = sc.nextLine();
            System.out.println("Ingrese un tipo:");
            tipo = sc.nextLine();
            System.out.println("Ingrese un ritmo:");
            ritmo = sc.nextLine();
            System.out.println("Ingrese un anio:");
            anio = sc.nextInt();
            System.out.println("Ingrese un pais:");
            pais = sc.nextLine();
            System.out.println("Ingrese un artista:");
            artista = sc.nextLine();
            System.out.println("Ingrese un festival:");
            festival = sc.nextLine();

        }else{
            System.out.println("ERROR!");
        }
        Genero genero1 = new Genero("","",0,"","","");
        System.out.println("Datos de tu genero:");
        System.out.println(genero1.tipo);
        System.out.println(genero1.getRitmo());
        System.out.println(genero1.getAnio());
        System.out.println(genero1.getPais());
        System.out.println(genero1.getArtista());
        System.out.println(genero1.getFestival());
//echo un cambio
    }
}