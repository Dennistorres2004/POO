public class Persona {
    private int identificacion;
    private String nombres;
    private String apellidos;
    private int edad;
    private double estatura;
    private double peso;

    public Persona(int identificacion, String nombres, String apellidos, int edad, double estatura, double peso){
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }

    public void caminar(){
        System.out.println(nombres + " está caminando");
    }

    public boolean jugar(){
        return true;
    }

    public void comer(){
        System.out.println(nombres + " está comiendo");
    }

    public String estudiar(String carrera){
        return nombres + " está estudiando: " + carrera;
    }

    // Método para mostrar la info de la persona
    public String mostrarInfo(){
        return "ID: " + identificacion + ", Nombre: " + nombres + " " + apellidos +
               ", Edad: " + edad + ", Estatura: " + estatura + ", Peso: " + peso;
    }
}
