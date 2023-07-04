public class Futbolista extends Persona{
    private String equipo;
    private String posicion;
    private int nCamiseta;
    private String representante;
    private int entrena;
    public Futbolista(){
        super(ci, telefono, nombre, apellido, direccion);
    }
    public Futbolista(int ci, String nombre, String apellido, String direccion, String telefono,String equipo,String posicion,int nCamiseta,String representante, int entrena) {
        super(ci, nombre, apellido, direccion, telefono);
        this.equipo=equipo;
        this.nCamiseta=nCamiseta;
        this.posicion=posicion;
        this.representante=representante;
        this.entrena=entrena;
    }

    public int getEntrena() {
        return entrena;
    }

    public void setEntrena(int entrena) {
        this.entrena = entrena;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getnCamiseta() {
        return nCamiseta;
    }

    public void setnCamiseta(int nCamiseta) {
        this.nCamiseta = nCamiseta;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }
}

