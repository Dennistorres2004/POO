public class CuentaBancaria {
    // Atributos privados
    private String titular;
    private String numeroCuenta;
    private double saldo;

    // Constructor por defecto
    public CuentaBancaria() {
        this.titular = "Sin nombre";
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
    }

    // Constructor parametrizado con validaciones
    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        if (titular == null || titular.trim().isEmpty()) {
            this.titular = "Desconocido";
        } else {
            this.titular = titular;
        }

        if (numeroCuenta != null && numeroCuenta.length() >= 6) {
            this.numeroCuenta = numeroCuenta;
        } else {
            this.numeroCuenta = "000000";
        }

        this.saldo = (saldo >= 0) ? saldo : 0.0;
    }

    // Getters y Setters con validaciones
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.trim().isEmpty()) {
            this.titular = titular;
        }
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        if (numeroCuenta != null && numeroCuenta.length() >= 6) {
            this.numeroCuenta = numeroCuenta;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    // Método depositar
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Error: el monto debe ser mayor a 0.");
        }
    }

    // Método retirar
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Error: monto inválido o saldo insuficiente.");
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "Titular: " + titular + "\nNúmero de cuenta: " + numeroCuenta + "\nSaldo: $" + saldo;
    }
}
















