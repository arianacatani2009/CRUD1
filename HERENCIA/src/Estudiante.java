public class Estudiante extends Persona{
    private int codigo;
    private String correo;
    private String semestre;
    private String Carrera;
    public Estudiante(){
        super(ci, telefono, nombre, apellido, direccion);
    }
    public Estudiante(int ci, String telefono, String nombre, String apellido, String direccion,int codigo,String correo,String semestre,String Carrera ) {
        super(ci,telefono, nombre, apellido, direccion);
        this.codigo=codigo;
        this.Carrera=Carrera;
        this.correo=correo;
        this.semestre=semestre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }
}
