public class Empleado extends Persona{
    private String puesto;
    private String cargo;
    private int cod;

    public Empleado(){
        super(ci, telefono, nombre, apellido, direccion);
    }
    public Empleado(int ci, String nombre, String apellido, String direccion, String telefono,String puesto,String cargo,int cod) {
        super(ci, nombre, apellido, direccion, telefono);
        this.cargo=cargo;
        this.cod=cod;
        this.puesto=puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}

