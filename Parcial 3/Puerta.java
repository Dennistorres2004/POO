public class Puerta {
    private boolean abierta;
    private boolean obstaculo;

    public Puerta() {
        abierta = false;
        obstaculo = false;
    }

    public void abrir() {
        abierta = true;
        System.out.println(" Puerta abierta");
    }

    public void cerrar() {
        if (obstaculo) {
            System.out.println(" No se puede cerrar: obstáculo detectado");
            return;
        }
        abierta = false;
        System.out.println(" Puerta cerrada");
    }

    public void activarObstaculo(boolean estado) {
        obstaculo = estado;
    }
}

