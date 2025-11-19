public class Piso {
    private int numero;
    public BotonPiso botonSubir;
    public BotonPiso botonBajar;

    public Piso(int numero) {
        this.numero = numero;

        if (numero == 0) {
            botonSubir = new BotonPiso("Piso " + numero + " SUBIR", Direccion.SUBIR);
            botonBajar = null;
        } else if (numero == SistemaControl.NUM_PISOS - 1) {
            botonSubir = null;
            botonBajar = new BotonPiso("Piso " + numero + " BAJAR", Direccion.BAJAR);
        } else {
            botonSubir = new BotonPiso("Piso " + numero + " SUBIR", Direccion.SUBIR);
            botonBajar = new BotonPiso("Piso " + numero + " BAJAR", Direccion.BAJAR);
        }
    }

    public int getNumero() {
        return numero;
    }
}

