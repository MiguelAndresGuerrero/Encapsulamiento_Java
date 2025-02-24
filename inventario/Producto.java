package sistema.inventario;

public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto (String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        setCantidad(cantidad);
        setPrecio(precio);
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCantidad(int cantidad){
        if (cantidad > 0) {
            this.precio = precio;
        } else {
            System.out.println("La cantidad es negativa");
        }
    }
    
    public void setPrecio(double precio){
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio debe ser mayor a 0");
        }
    }
    
    public void actualizarStock(int cantidad){
        if (this.cantidad + cantidad > 0) {
            this.cantidad += cantidad;
            System.out.println("Stock actualizado, " + nombre + " - " + this.cantidad);
        } else {
            System.out.println("Stock insuficiente");
            
        }
    }
    
    public void mostrarInformacion(){
        System.out.println("==========================");
        System.out.println("Codigo " + codigo);
        System.out.println("Nombre " + nombre);
        System.out.println("Cantidad Stock " + cantidad);
        System.out.println("Precio " + precio);
        System.out.println("==========================");
    }
}
