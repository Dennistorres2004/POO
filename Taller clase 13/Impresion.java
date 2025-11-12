import java.util.ArrayList;
import java.util.List;

public class Impresion extends Producto {
    private String color;
    private List<Foto> fotos;

    public Impresion(int numero, String color) {
        super(numero);
        this.color = color;
        this.fotos = new ArrayList<>();
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public void agregarFoto(Foto foto) {
        fotos.add(foto);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Impresión #" + numero + " - Color: " + color);
        for (Foto f : fotos) {
            System.out.println("  - " + f);
        }
    }
}