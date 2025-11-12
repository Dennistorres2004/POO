public class BotonPiso extends Boton {
    private int numeroPiso;
    private Direccion direccionSolicitada;

    public BotonPiso(int numeroPiso, Direccion direccion) {
        super("BP-" + numeroPiso + "-" + direccion);
        this.numeroPiso = numeroPiso;
        this.direccionSolicitada = direccion;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public Direccion getDireccionSolicitada() {
        return direccionSolicitada;
    }
}
