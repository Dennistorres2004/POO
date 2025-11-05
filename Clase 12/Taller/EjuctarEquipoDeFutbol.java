public class EjuctarEquipoDeFutbol {
    public static void main(String[] args) {
        EquipoDeFutbol j1 = new Jugador("Luis", 22, "Defensa");
        EquipoDeFutbol e1 = new Entrenador("Andrés", 45, 10);

        j1.entrenar();
        e1.entrenar();

        System.out.println(j1.info());
        System.out.println(e1.info());
    }
}




