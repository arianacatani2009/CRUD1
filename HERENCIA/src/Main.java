public class Main {
    public static void main (String[]args) {
        Persona Pedro = new Persona();
        Persona persona1 = new Doctor();
        Persona persona2= new Empleado();
        Persona persona3= new Futbolista();
        Persona persona4= new Estudiante();
        System.out.println(Pedro.getCi());

        Estudiante Mayerli = new Estudiante(
                1724321011, "Mayerli", "Catani", "La floresta", "0997547518", 2334, "ariana.catani@gmail.com", "tercer semestre", "Desarrollo software"
        );
        Estudiante David = new Estudiante(1724321011, "David", "Hidalgo", "Guamani", "0958624563", 14513, "David.hidalgo@gmail.com", "3ro", "STSD");
        System.out.println("Nombre" + Mayerli.getNombre());
        Mayerli.caminar();
        Mayerli.estudiar();
        Mayerli.trabajar();
        Mayerli.leer();
        Mayerli.memorizar();

        David.setNombre("David");
        System.out.println("Nombre:" + David.getNombre());
        David.caminar();
        David.estudiar();
        David.trabajar();
        David.leer();
        David.memorizar();
        Doctor Persona1= new Doctor(17265156,"Ana","Ana","Guamani","033865549","Pediatra",23516,"MAÑANA",33,"lEO");
        System.out.println("Nombre" + persona1.getNombre());
        System.out.println("Edad" + persona1.getAnio());
        System.out.println("Signo" + persona1.getSigno());
        persona1.examinar();
        Empleado Persona2= new Empleado(17265156,"Margarita","Margarita","Barrio nuevo","062415164165","3 PUESTO","jefe area",5641);
        System.out.println("Nombre" + persona2.getNombre());
        System.out.println("Telefono" + persona2.getTelefono());
        persona2.tramitar();
        Futbolista Persona3= new Futbolista(17265156,"Ana","Ana","Guamani","033865549","Los Leones","5",10,"Juan pablo",5);
        System.out.println("Cuantas horas entreana?" + persona3.getEntrena());
        persona3.correr();
        Estudiante Persona4= new Estudiante(1725648966,"Melani","Melani","Chillogallo","0998563259",1568,"Melani@gmail.com","3RO SEMESTRE","DS");
        System.out.println("Nombre" + persona4.getNombre());
        System.out.println("Esta en" + persona4.getSemestre());
        persona4.leer();

    }
}
