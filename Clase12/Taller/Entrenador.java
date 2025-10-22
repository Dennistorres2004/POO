public class Entrenador extends EquipoDeFutbol {
    private int experiencia;

    public Entrenador(String nombre, int edad, int experiencia) {
        super(nombre, edad);
        this.experiencia = experiencia;
    }

    @Override
    public void entrenar() {
        System.out.println(nombre + " dirige el entrenamiento.");
    }

    @Override
    public String info() {
        return "Entrenador: " + nombre + " - Experiencia: " + experiencia + " años";
    }
}




