public class figuras2D {

    public float nLados; // numero de lados
    public float lado; // longitud del lado

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
        return (int) nLados;
    }
    public float areaCuadrado(int lado){
        return this.lado*this.lado;
    };
    private float perimetroCuadrado(int lado){
        return this.lado+this.lado+this.lado+this.lado;
    };

    public float areaTrianngulo(int lado){
        return (this.lado*this.lado)/2;
    };
    public float perimetroTriangulo(int lado){
        return this.lado+this.lado+this.lado;
    };





}
