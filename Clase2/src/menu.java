public class menu {
    public static void main(String[] args){
        //creamos una instancia llamada avion
        transporte avion = new transporte();
        transporte bus = new transporte();
        transporte barco = new transporte();

        avion.acelerar();
        avion.frenar();
        avion.Volar();
        bus.acelerar();
        avion.frenar();
        barco.acelerar();
        barco.frenar();

        System.out.println(avion.capacidad);
        System.out.println(barco.velMaxima);

    }
}

