public class figuras2D {

    int nLados; // numero de lados
    float lado; // longitud del lado

    public figuras2D(int nLados, float lado) {
        this.nLados = nLados;
        this.lado = lado;
    }



    public figuras2D(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }


    public figuras2D(int nLados) {
        this.nLados = nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }

    public int getnLados() {
        return nLados;
    }
    public float areaCuadrado(int lado){
        return this.lado*this.lado;
    };
    private float perimetroCuadrado(){
        return 0;
    };

    public float areaTrianngulo(){};
    public float pwrimwtroTriangulo(){};





}
