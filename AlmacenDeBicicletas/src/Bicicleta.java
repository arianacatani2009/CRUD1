public class Bicicleta {
    String tipo;
    int marchas;

    public void establecerTipo(String miTipo){
        tipo=miTipo;
    }
    public void establecerMarchas(int misMarchas){
        marchas=misMarchas;
    }
    public String obtenerTipo() {
        return tipo;
    }
    public int obtenerMarchas() {
        return marchas;
    }
    public void imprimirTipo(){
        System.out.println("Tipo"+tipo);
    }
    public void imprimirMarchas(){
        System.out.println("Marchas"+marchas);
    }
}

