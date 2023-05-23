import java.util.Scanner;

public class PruebaLibroCalificacion {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        LibroCalificaciones milibroCalificaciones = new LibroCalificaciones();
        System.out.printf("\nEl nombre de la inicial del curso: "+milibroCalificaciones.obtenerNombreDelCurso());
        System.out.print("\nEscriba el nombre del curso:");
        String elNombre = entrada.nextLine();
        milibroCalificaciones.establecerNombreDelCurso(elNombre);
        System.out.println();

        milibroCalificaciones.mostrarMensaje();
    }
}
