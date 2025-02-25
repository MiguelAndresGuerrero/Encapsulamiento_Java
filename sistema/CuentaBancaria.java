package sistema.bancario;

public class CuentaBancaria {
    protected String numeroCuenta;
    protected double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Deposito realizado, Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad debe ser positiva");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro realizado, Nuevo saldo: " + saldo);
        } else {
            System.out.println("Fondos insuficientes o cantidad invalida");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}