public class Main {

    public static void main(String[] args) throws InterruptedException {

        SistemaControl sc = new SistemaControl();

        sc.solicitudDesdePiso(2, Direccion.SUBIR);
        sc.solicitudDesdeAscensor(5);

        for (int i = 0; i < 15; i++) {
            System.out.println("\n=== TICK " + i + " ===");
            sc.ejecutarTick();
            Thread.sleep(500);
        }
    }
}
