package sistema.encapsulamiento;

public class Archivador {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Andres", 1, 500);
        
        empleado1.mostrarInformacion();

        empleado1.setSalario(-100);

        empleado1.setNombre("Carlos");
        empleado1.mostrarInformacion();
    }
}
