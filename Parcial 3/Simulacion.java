public class Simulacion {
    public static void main(String[] args) throws InterruptedException {
        ControlAscensor control = new ControlAscensor(5);

        control.presionarBotonPiso(3, Direccion.SUBIENDO);
        control.ejecutarCiclo();
        control.mostrarEstado();

        control.ejecutarCiclo();
        control.ejecutarCiclo();
        control.mostrarEstado();

        control.presionarBotonAscensor(5);

        for (int i = 0; i < 5; i++) {
            control.ejecutarCiclo();
            Thread.sleep(300);
        }

        control.mantenerPuertaAbierta(true);
        control.ejecutarCiclo();

        control.mantenerPuertaAbierta(false);
        control.ejecutarCiclo();

        control.mostrarEstado();
    }
}
