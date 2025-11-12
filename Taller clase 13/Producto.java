public abstract class Producto {
    protected int numero;

    public Producto(int numero) {
        this.numero = numero;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public abstract void mostrarInfo();
}
