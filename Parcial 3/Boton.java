public class Boton {
    protected boolean encendido;
    protected String nombre;

    public Boton(String nombre) {
        this.nombre = nombre;
        this.encendido = false;
    }

    public void presionar() {
        encendido = true;
        System.out.println(" Botón presionado: " + nombre);
    }

    public void apagar() {
        encendido = false;
    }

    public boolean estaEncendido() {
        return encendido;
    }
}

