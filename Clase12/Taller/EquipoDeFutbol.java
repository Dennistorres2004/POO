//Clase Padre
public class EquipoDeFutbol {
    protected String nombre;
    protected int edad;

    public EquipoDeFutbol(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void entrenar() {
        System.out.println(nombre + " está entrenando.");
    }

    public String info() {
        return nombre + " tiene " + edad + " años.";
    }
}


