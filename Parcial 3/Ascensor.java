import java.util.PriorityQueue;

public class Ascensor {
    private int pisoActual;
    private Direccion direccion;
    private Puerta puerta;
    private PriorityQueue<Integer> destinos;

    public Ascensor() {
        pisoActual = 0;
        direccion = Direccion.QUIETO;
        puerta = new Puerta();
        destinos = new PriorityQueue<>();
    }

    public void agregarDestino(int piso) {
        destinos.add(piso);
        System.out.println(" Nueva solicitud: ir al piso " + piso);
    }

    public void tick() {
        if (destinos.isEmpty()) {
            direccion = Direccion.QUIETO;
            return;
        }

        int destino = destinos.peek();

        if (destino > pisoActual) {
            direccion = Direccion.SUBIR;
            pisoActual++;
            System.out.println("⬆ Ascensor sube al piso " + pisoActual);
        } else if (destino < pisoActual) {
            direccion = Direccion.BAJAR;
            pisoActual--;
            System.out.println("⬇ Ascensor baja al piso " + pisoActual);
        } else {
            System.out.println(" Ascensor llegó al piso " + pisoActual);
            destinos.poll();
            puerta.abrir();
            puerta.cerrar();
        }
    }

    public int getPisoActual() {
        return pisoActual;
    }
}

