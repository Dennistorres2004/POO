public abstract class Boton {
    private boolean iluminado;
    private String id;

    public Boton(String id) {
        this.id = id;
        this.iluminado = false;
    }

    public boolean estaIluminado() {
        return iluminado;
    }

    public void encenderLuz() {
        iluminado = true;
    }

    public void apagarLuz() {
        iluminado = false;
    }

    public String getId() {
        return id;
    }
}