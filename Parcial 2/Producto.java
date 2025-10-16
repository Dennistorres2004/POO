public class Producto {
    // Atributos privados
    private String codigo;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    // Constructor por defecto
    public Producto() {
        codigo = "P000";
        descripcion = "Producto genérico";
        cantidad = 1;
        precioUnitario = 0.0;
    }

    // Constructor con parámetros (con validaciones)
    public Producto(String codigo, String descripcion, int cantidad, double precioUnitario) {
        if (codigo != null && !codigo.equals("")) {
            this.codigo = codigo;
        } else {
            this.codigo = "P000";
        }

        if (descripcion != null && !descripcion.equals("")) {
            this.descripcion = descripcion;
        } else {
            this.descripcion = "Producto genérico";
        }

        this.cantidad = (cantidad >= 1) ? cantidad : 1;
        this.precioUnitario = (precioUnitario >= 0) ? precioUnitario : 0.0;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.equals("")) {
            this.codigo = codigo;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion != null && !descripcion.equals("")) {
            this.descripcion = descripcion;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 1) {
            this.cantidad = cantidad;
        }
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario >= 0) {
            this.precioUnitario = precioUnitario;
        }
    }

    // Método que calcula el subtotal
    public double calcularSubtotal() {
        return cantidad * precioUnitario;
    }

    // Método que aplica un descuento si está entre 0 y 50%
    public double aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 50) {
            System.out.println("El descuento no es válido (0 - 50%).");
            return calcularSubtotal();
        }
        double subtotal = calcularSubtotal();
        double descuento = subtotal * (porcentaje / 100);
        return subtotal - descuento;
    }

    // Método para aumentar la cantidad
    public void incrementarCantidad(int valor) {
        if (valor > 0) {
            cantidad += valor;
        }
    }

    // Mostrar información del producto
    @Override
    public String toString() {
        return "Código: " + codigo +
               "\nDescripción: " + descripcion +
               "\nCantidad: " + cantidad +
               "\nPrecio Unitario: $" + precioUnitario +
               "\nSubtotal: $" + calcularSubtotal();
    }
}
