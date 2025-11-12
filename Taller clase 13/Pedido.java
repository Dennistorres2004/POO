import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
        this.productos = new ArrayList<>();
        this.fecha = new Date();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarPedido() {
        System.out.println("===== PEDIDO =====");
        System.out.println(cliente);
        System.out.println("Fecha: " + fecha);
        System.out.println("Productos:");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
        System.out.println("==================\n");
    }
}
