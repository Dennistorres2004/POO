public class Persona{

    //Atributos
    private int identificacion;
    private String nombres;
    private String apellidos;
    private int edad;
    private double estatura;
    private double peso;

    //Método constructor de la clase se reconoce porque tiene el mismo nombre de la clase
    //El constructor de la clase me permite inicializar la clase
    //La pañabra reservada this se usa para referenciar el atributo de la clase
    
    public Persona(int identificacion, String nombres, String apellidos,
                    int edad, double estatura, double peso){
     this.identificacion = identificacion;
     this.nombres = nombres;
     this.apellidos = apellidos;
     this.edad = edad;
     this.peso = peso;

    }


    //Métodos 
    public void caminar(){
        System.out.println( "caminar");
    }
     public boolean jugar(){
        return true;
     }
     public void comer(){
        System.err.println("Comiendo");
     }
     public String  estudiar(String carrera){
        return "usted esta estudiando" + carrera;
     }
}