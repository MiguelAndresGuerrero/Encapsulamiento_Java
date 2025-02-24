package sistema.inventario;

public class InventarioTest {
    public static void main(String[] args) {
        Producto P1 = new Producto("P001", "Laptop Gamer", 10, 800);
        Producto P2 = new Producto("P002", "Mouse Gamer", 50, 30);
        Producto P3 = new Producto("P003", "Teclado Gamer", 20, 80);
        
        System.out.println("Estado del inventario");
        P1.mostrarInformacion();
        P2.mostrarInformacion();
        P3.mostrarInformacion();
        
        System.out.println("-----------------------------");
        System.out.println("Se vendieron 3 laptops gamer");
        P1.actualizarStock(-3);
        
        System.out.println("-----------------------------");
        System.out.println("Se vendieron 15 laptops gamer");
        P1.actualizarStock(-15);
        
        System.out.println("-----------------------------");
        System.out.println("Se reabastecio la cantidad de laptops gamer (10)");
        P1.actualizarStock(10);
        
        System.out.println("Nuevo estado del inventario ");
        P1.mostrarInformacion();
        P2.mostrarInformacion();
        P3.mostrarInformacion();
    }
}