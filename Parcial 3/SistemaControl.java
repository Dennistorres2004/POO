public class SistemaControl {

    public static final int NUM_PISOS = 6;

    private Piso[] pisos;
    private Ascensor ascensor;

    public SistemaControl() {
        pisos = new Piso[NUM_PISOS];
        for (int i = 0; i < NUM_PISOS; i++) {
            pisos[i] = new Piso(i);
        }
        ascensor = new Ascensor();
    }

    public void solicitudDesdePiso(int numeroPiso, Direccion direccion) {
        System.out.println("\n Solicitud desde piso " + numeroPiso + " (" + direccion + ")");
        ascensor.agregarDestino(numeroPiso);
    }

    public void solicitudDesdeAscensor(int pisoDestino) {
        System.out.println("\n Solicitud interna: ir a piso " + pisoDestino);
        ascensor.agregarDestino(pisoDestino);
    }

    public void ejecutarTick() {
        ascensor.tick();
    }
}

