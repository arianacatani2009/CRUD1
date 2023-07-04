public class Doctor extends Persona{
    private String especialidad;
    private int cod;
    private String horario;
    private int anio;
    private String signo;
    public Doctor(){
      super(ci, telefono, nombre, apellido, direccion);
}
    public Doctor(int ci, String nombre, String apellido, String direccion, String telefono,String especialidad,int cod,String horario,int anio,String signo) {
        super(ci, nombre, apellido, direccion, telefono);
        this.cod=cod;
        this.especialidad=especialidad;
        this.horario=horario;
        this.anio=anio;
        this.signo=signo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
