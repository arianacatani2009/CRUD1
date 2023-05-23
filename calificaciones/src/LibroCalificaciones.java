public class LibroCalificaciones {
    private String nombreDelCurso;
    public void establecerNombreDelCurso(String nombre){
        nombreDelCurso = nombre;
    }
    public String obtenerNombreDelCurso(){
        return nombreDelCurso;
    }
    public void mostrarMensaje(){
        System.out.printf("Bienvenido al libro calificaciones! "+"\n"+obtenerNombreDelCurso()+"!");
    }
    /*public void mostrarMensaje(String nombreDelCurso)
    {
        System.out.println("Bienvenido al libro calificaciones! "+"\n" +nombreDelCurso+"!");
    }fin de mostrar mensaje*/
}
