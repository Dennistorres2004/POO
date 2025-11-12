import java.util.*;

public class Ascensor {
    private int pisoActual;
    private Direccion direccion;
    private Puerta puerta;
    private Map<Integer, BotonAscensor> botonesInternos;

    private TreeSet<Integer> solicitudesSubir;
    private TreeSet<Integer> solicitudesBajar;
    private int pisoMinimo = 1;
    private int pisoMaximo;

    public Ascensor(int pisoInicial, int pisoMaximo) {
        this.pisoActual = pisoInicial;
        this.direccion = Direccion.QUIETO;
        this.puerta = new Puerta();
        this.pisoMaximo = pisoMaximo;
        this.botonesInternos = new HashMap<>();

        for (int i = pisoMinimo; i <= pisoMaximo; i++) {
            botonesInternos.put(i, new BotonAscensor(i));
        }

        solicitudesSubir = new TreeSet<>();
        solicitudesBajar = new TreeSet<>(Comparator.reverseOrder());
    }

    public void agregarSolicitudInterna(int piso) {
        if (piso == pisoActual) return;

        botonesInternos.get(piso).encenderLuz();
        if (piso > pisoActual)
            solicitudesSubir.add(piso);
        else
            solicitudesBajar.add(piso);
    }

    public void agregarSolicitudExterna(int piso, Direccion direccion) {
        if (piso == pisoActual) return;

        if (direccion == Direccion.SUBIENDO)
            solicitudesSubir.add(piso);
        else
            solicitudesBajar.add(piso);
    }

    public void mover() {
        if (puerta.estaAbierta()) {
            puerta.cerrar();
            if (puerta.estaAbierta()) return; // Si sigue abierta, no se mueve
        }

        if (direccion == Direccion.QUIETO) {
            if (!solicitudesSubir.isEmpty())
                direccion = Direccion.SUBIENDO;
            else if (!solicitudesBajar.isEmpty())
                direccion = Direccion.BAJANDO;
            else
                return;
        }

        if (direccion == Direccion.SUBIENDO) {
            if (pisoActual < pisoMaximo) pisoActual++;
            System.out.println("Ascensor sube al piso " + pisoActual);

            if (solicitudesSubir.contains(pisoActual) || solicitudesBajar.contains(pisoActual)) {
                detenerEnPiso(pisoActual);
                solicitudesSubir.remove(pisoActual);
                solicitudesBajar.remove(pisoActual);
                botonesInternos.get(pisoActual).apagarLuz();
            }

            if (solicitudesSubir.isEmpty() && !solicitudesBajar.isEmpty())
                direccion = Direccion.BAJANDO;
            else if (solicitudesSubir.isEmpty() && solicitudesBajar.isEmpty())
                direccion = Direccion.QUIETO;
        } else if (direccion == Direccion.BAJANDO) {
            if (pisoActual > pisoMinimo) pisoActual--;
            System.out.println("Ascensor baja al piso " + pisoActual);

            if (solicitudesBajar.contains(pisoActual) || solicitudesSubir.contains(pisoActual)) {
                detenerEnPiso(pisoActual);
                solicitudesBajar.remove(pisoActual);
                solicitudesSubir.remove(pisoActual);
                botonesInternos.get(pisoActual).apagarLuz();
            }

            if (solicitudesBajar.isEmpty() && !solicitudesSubir.isEmpty())
                direccion = Direccion.SUBIENDO;
            else if (solicitudesSubir.isEmpty() && solicitudesBajar.isEmpty())
                direccion = Direccion.QUIETO;
        }
    }

    private void detenerEnPiso(int piso) {
        puerta.abrir();
        System.out.println("Ascensor llega al piso " + piso + ". Puerta abierta.");
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Puerta getPuerta() {
        return puerta;
    }
}