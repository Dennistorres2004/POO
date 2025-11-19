public class BotonAscensor extends Boton {
    private int pisoDestino;

    public BotonAscensor(String nombre, int destino) {
        super(nombre);
        this.pisoDestino = destino;
    }

    public int getDestino() {
        return pisoDestino;
    }
}

