public class OperacionesMatematicas {
    //Atributos
    private int n1;
    private int n2;

    //Constructor de la clase: permite inicalizar la clase
    //Tiene el mismo nombre de la clase
    /*
    *Firma del metodo constructor
    *visibilidad: publico
    *nombre: OperrcionesMatematicas
    *Cuantos parametros: 2
    *parametro 1 tipo entero
    *parametro 2 tipo entero
    */ 
    public OperacionesMatematicas(int n1, int n2){
        this.n1 = n1; // this significa una autoreferencia al atribut de la clase
        this.n2 = n2;

    }
    
    //Metodos
    public int sumar(){
        return n1 + n2;
    }

    public int restar(){
        return n1 - n2;
    }

    public int multiplicar(){
        return n1 * n2;
    }
    
    public double dividir(){
       double resultado;
        if(n2 == 0){
        resultado = 0.0;
       }else{
           resultado = (double) n1 / (double) n2; // convertir un entero a real
       }
        return n1 / n2;
    }

    


}


