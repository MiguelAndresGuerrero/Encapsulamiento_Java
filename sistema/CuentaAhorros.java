package sistema.bancario;

public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorros(String numeroCuenta, double saldo, double tasaInteres) {
        super(numeroCuenta, saldo);
        this.tasaInteres = tasaInteres;
    }

    public void aplicarInteres() {
        double interes = saldo * (tasaInteres / 100);
        saldo += interes;
        System.out.println("Interes aplicado: " + interes);
        System.out.println("Nuevo saldo: " + saldo);
    }
}