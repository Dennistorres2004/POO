public class Puerta {
    private boolean abierta;
    private boolean sensorObstaculo;

    public Puerta() {
        abierta = false;
        sensorObstaculo = false;
    }

    public void abrir() {
        abierta = true;
        System.out.println("Puerta abierta.");
    }

    public void cerrar() {
        if (!sensorObstaculo) {
            abierta = false;
            System.out.println("Puerta cerrada.");
        } else {
            System.out.println("¡Obstáculo detectado! No se puede cerrar la puerta.");
        }
    }

    public void activarSensorObstaculo(boolean estado) {
        sensorObstaculo = estado;
    }

    public boolean estaAbierta() {
        return abierta;
    }
}
