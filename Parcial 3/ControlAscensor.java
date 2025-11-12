import java.util.*;

public class ControlAscensor {
    private Ascensor ascensor;
    private Map<Integer, Piso> pisos;

    public ControlAscensor(int cantidadPisos) {
        ascensor = new Ascensor(1, cantidadPisos);
        pisos = new HashMap<>();

        for (int i = 1; i <= cantidadPisos; i++) {
            pisos.put(i, new Piso(i, cantidadPisos));
        }
    }

    public void presionarBotonPiso(int piso, Direccion direccion) {
        Piso p = pisos.get(piso);
        if (p == null) return;

        if (direccion == Direccion.SUBIENDO && p.getBotonSubir() != null)
            p.getBotonSubir().encenderLuz();
        else if (direccion == Direccion.BAJANDO && p.getBotonBajar() != null)
            p.getBotonBajar().encenderLuz();

        ascensor.agregarSolicitudExterna(piso, direccion);
        System.out.println("Botón de piso " + piso + " (" + direccion + ") presionado.");
    }

    public void presionarBotonAscensor(int piso) {
        ascensor.agregarSolicitudInterna(piso);
        System.out.println("Botón interno para piso " + piso + " presionado.");
    }

    public void mantenerPuertaAbierta(boolean mantener) {
        ascensor.getPuerta().activarSensorObstaculo(mantener);
    }

    public void ejecutarCiclo() {
        ascensor.mover();
    }

    public void mostrarEstado() {
        System.out.println("----------------------------");
        System.out.println("Piso actual: " + ascensor.getPisoActual());
        System.out.println("Dirección: " + ascensor.getDireccion());
        System.out.println("Puerta abierta: " + ascensor.getPuerta().estaAbierta());
        System.out.println("----------------------------");
    }
}
