public class EjecutarProducto {
    public static void main(String[] args) {

        // Crear un producto usando el constructor con parámetros
        Producto prod1 = new Producto("B205", "Mouse inalámbrico", 3, 80.0);

        // Mostrar la información del producto
        System.out.println("=== Datos del producto ===");
        System.out.println(prod1.toString());

        // Calcular subtotal
        double subtotal = prod1.calcularSubtotal();
        System.out.println("\nSubtotal: $" + subtotal);

        // Aplicar un descuento
        double totalConDescuento = prod1.aplicarDescuento(15);
        System.out.println("Total con 15% de descuento: $" + totalConDescuento);

        // Aumentar cantidad
        prod1.incrementarCantidad(2);
        System.out.println("\nCantidad después de incrementar: " + prod1.getCantidad());
        System.out.println("Nuevo subtotal: $" + prod1.calcularSubtotal());

        // Calcular total final con impuesto del 8%
        double totalFinal = totalConDescuento * 1.08;
        System.out.println("\nTotal final con impuesto (8%): $" + totalFinal);
    }
}

