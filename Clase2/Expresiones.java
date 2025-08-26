public class Expresiones {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 1;

        // Uso de Math.pow para elevar b al cuadrado
        int resultado = (b * a) - (int)Math.pow(b, 2) / (4 * c);

        System.out.println("El resultado es: " + resultado);
    }
}
