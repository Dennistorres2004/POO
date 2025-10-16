public class EjecutarCuentaBancaria{
    public static void main(String[] args) {
        // Crear cuenta con valores válidos
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Pérez", "123456", 1000);

        // Mostrar información inicial
        System.out.println("=== Información de la cuenta ===");
        System.out.println(cuenta1.toString());

        // Realizar operaciones
        System.out.println("\n=== Operaciones ===");
        cuenta1.depositar(500);
        cuenta1.retirar(300);
        cuenta1.retirar(1500); // Prueba con saldo insuficiente

        // Mostrar estado final
        System.out.println("\n=== Estado final ===");
        System.out.println(cuenta1.toString());
    }
}
