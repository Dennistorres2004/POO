public class Jugador extends EquipoDeFutbol {
    private String posicion;

    public Jugador(String nombre, int edad, String posicion) {
        super(nombre, edad);
        this.posicion = posicion;
    }

    @Override
    public void entrenar() {
        System.out.println(nombre + " practica en su posición de " + posicion + ".");
    }

    @Override
    public String info() {
        return "Jugador: " + nombre + " - Posición: " + posicion;
    }
}


