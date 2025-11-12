public class Piso {
    private int numero;
    private BotonPiso botonSubir;
    private BotonPiso botonBajar;

    public Piso(int numero, int totalPisos) {
        this.numero = numero;

        if (numero < totalPisos)
            botonSubir = new BotonPiso(numero, Direccion.SUBIENDO);
        if (numero > 1)
            botonBajar = new BotonPiso(numero, Direccion.BAJANDO);
    }

    public int getNumero() {
        return numero;
    }

    public BotonPiso getBotonSubir() {
        return botonSubir;
    }

    public BotonPiso getBotonBajar() {
        return botonBajar;
    }
}
