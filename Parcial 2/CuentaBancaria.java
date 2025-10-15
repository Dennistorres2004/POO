public class CuentaBancaria {
    // Atributos
    private String numeroCuenta;
    private String nombreTitular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String numeroCuenta, String nombreTitular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("El saldo inicial no puede ser negativo. Se ha establecido en 0.");
        }
    }

    // Métodos
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else if (monto > saldo) {
            System.out.println("Fondos insuficientes para el retiro.");
        } else {
            System.out.println("El monto a retirar debe ser positivo.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    // Getters y Setters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }




















}

