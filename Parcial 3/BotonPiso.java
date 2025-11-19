public class BotonPiso extends Boton {
    private Direccion direccion;

    public BotonPiso(String nombre, Direccion direccion) {
        super(nombre);
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
