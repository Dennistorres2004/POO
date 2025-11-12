public class BotonAscensor extends Boton {
    private int numeroPiso;

    public BotonAscensor(int numeroPiso) {
        super("BA-" + numeroPiso);
        this.numeroPiso = numeroPiso;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }
}
