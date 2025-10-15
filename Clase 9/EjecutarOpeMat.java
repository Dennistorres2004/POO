import java.util.Scanner;

public class EjecutarOpeMat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

                int opcion;
        
        do {
        System.out.print("ingrese el primer numero...");
        int a = sc.nextInt();
        System.out.print("ingrese el segundo numero...");
        int b = sc.nextInt();
        OperacionesMatematicas objOp = new OperacionesMatematicas(a,b);
         
            System.out.println("===== CALCULADORA =====");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Elevar a la potencia de 2");
            System.out.println("6. Elevar a la 3");
            System.out.println("7. Elevar a un numero deseado");
            System.out.println("8. Sacar raíz cuadrada");
            System.out.println("9. Sacar raíz cúbica");
            System.out.println("10. Sacar raíz deseada");
            System.out.println("11. Salir");
            System.out.println("=======================");
            System.out.print("Seleccione una opción: ");
            
            opcion = sc.nextInt();
            
    
            switch (opcion) {
                case 1:
                    System.out.println("\nHa seleccionado: Sumar");
                    System.out.println("El resultado de la suma es: " + objOp.sumar());
                 
                    break;
                    
                case 2:
                    System.out.println("\nHa seleccionado: Restar");
                    System.out.println("El resultado de la resta es: " + objOp.restar());
                 
                    break;
                    
                case 3:
                    System.out.println("\nHa seleccionado: Multiplicar");
                    System.out.println("El resultado de la multiplicacion es: " + objOp.multiplicar());
              
                    break;
                    
                case 4:
                    System.out.println("\nHa seleccionado: Dividir");
                     System.out.println("el resultado de la division es: " + objOp.dividir());
                 
                    break;
                    
                case 5:
                    System.out.println("\nHa seleccionado: Elevar a la potencia de 2");
                     System.out.println("el resultado de elevar el primer numero al cuadrado es: " + objOp.potencia2());
                  
                    break;

                                case 6:
                    System.out.println("\nHa seleccionado: Elevar al cubo");
                    System.out.println("el resultado de elevar al cubo es " + objOp.potenciacubo());
                   
                    break;
                    
                case 7:
                    System.out.println("\nHa seleccionado: Elevar a la n");
                    System.out.println("el resultado de esta potencia del primer numero es " + objOp.n());
              
                    break;
                    
                case 8:
                    System.out.println("Ha seleccionado: Sacar raíz cuadrada");
                    System.out.println("el resultado de sacarle raiz cuadrada al primer numero es " + objOp.raizcuadra());
      
                    break;
                    
                case 9:
                    System.out.println("\nHa seleccionado: Sacar raíz cúbica");
                    System.out.println("el resultado de la raiz cubica al primer numero es " + objOp.raizcubic());
                  
                    break;
                    
                case 10:
                    System.out.println("\nHa seleccionado: Sacar raíz n");
                    System.out.println("el resultado de la raiz entre los 2 numero es " + objOp.raizn());
                 
                    break;
                    
                case 11:
                    System.out.println("\nNos vemos");
                    break;
                    
                default:
                    System.out.println("\nERROR. Intente nuevamente.");

            
                    
            }
            
        } while (opcion != 11);



        
        
        
       
       


        sc.close();

       //tarea: implementar los métodos: elevar el cuadrado
       // -elevar al cubo
       // - elevar a la n
       // - sacar la raiz cuadrada
       // - sacar la raiz cubica
       // - sacar la raiz n 
       // todo con menu de opciones  
    }
}
