package sistema;

import sistema.bancario.CuentaAhorros;

public class TestCuentaAhorro {
    public static void main(String[] args) {
        CuentaAhorros cuenta = new CuentaAhorros("123456", 1000, 2);

        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        cuenta.depositar(500);
        
        cuenta.retirar(300);

        cuenta.aplicarInteres();
        
        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}
