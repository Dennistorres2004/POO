public class Main {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente1 = new Cliente("123456", "Ana Torres");

        // Crear fotos
        Foto f1 = new Foto("playa.jpg");
        Foto f2 = new Foto("montaña.png");

        // Crear impresión y añadir fotos
        Impresion impresion1 = new Impresion(101, "Color");
        impresion1.agregarFoto(f1);
        impresion1.agregarFoto(f2);

        // Crear cámara
        Camara camara1 = new Camara(202, "Canon", "EOS Rebel T7");

        // Crear pedido
        Pedido pedido1 = new Pedido(cliente1, 789456);
        pedido1.agregarProducto(impresion1);
        pedido1.agregarProducto(camara1);

        // Mostrar pedido
        pedido1.mostrarPedido();

        // Simular impresión de fotos
        f1.print();
        f2.print();
    }
}
