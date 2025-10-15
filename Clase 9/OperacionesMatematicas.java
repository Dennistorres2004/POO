public class OperacionesMatematicas {
//atributos
    private int n1;
    private int n2;

    //constructor de la clase

    public OperacionesMatematicas(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    
    //metodos
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
        }else {
            resultado = (double) n1 / (double) n2;
        }
        return resultado;
    }

    public double potencia2(){
        return Math.pow(n1, 2);
    }
    
    public double potenciacubo(){
        return Math.pow(n2, 3);
    }

    public double n(){
        return Math.pow(n1, n2);
    }

    public double raizcuadra(){
        return Math.sqrt(n1);
    }

    public double raizcubic(){
        return Math.pow(n1, 1.0/3);
    }

    public double raizn(){
        return Math.pow(n1, 1.0/n2);
    }
}
   

