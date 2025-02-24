package sistema.encapsulamiento;

public class Empleado {
    
    private String nombre;
    private final int id;
    private double salario;

    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        setSalario(salario);
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public final void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Error: El salario no puede ser negativo");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario: $" + salario);
    }
}