public class PracticasCondicionales { 
    
    

    public static void main(String [] args) { 
        
        /* 
         *Ejercicio 4.1.a)
         Requerimiento:Si un ángulo es igual a 90 grados, imprimir el
         mensaje "El ángulo es un ángulo recto"
         sino imprimir el mensaje "El ángulo no es
         un ángulo recto".
         *
         * Entrada angulo
         * Proceso: validad si el angulo es igual a 90 grados
         * Salida: obtener el mensaje si es o no es recto
         * 
          */

         int angulo = 80;
         
         if (angulo == 90){
            System.out.println("El angulo es un angulo recto");
          }else{ 
            System.err.println("El angulo no es un angulo rescto");
         }

         //-----------------------------------------------------------------------------------------------

         /*
         * Ejercicio 4.1.b)
         * Requerimiento:Si la temperatura es superior a 100 grados, visualizar el mensaje “por encima del punto de ebullición del agua” sino visualizar el mensaje “por
         * debajo del punto de ebullición del agua”.
         *
         * Entrada: temperatura
         * Proceso:validar que la temperatura sea superior a 100 grados
         * Salida: si alcanza o no el punto de ebullicion
         */
        
         double temperatura = 90.0;

         if (temperatura > 100){

            System.out.println("por encima del punto de ebullición del agua");
            }else{
            System.out.println(" debajo del punto de ebullición del agua");
            }
         
         //----------------------------------------------------------------------------------------------
        
         /*
         *Ejercicio 4.1.c)
         *Si el número es positivo, sumar el número a total
         *de positivos, sino sumar al total de negativos
         *
         *Entrada: Sumar
         *Proceso: Sumar numero total de positivos, sumar numero total negativos 
         *Salida: Sumar el total de positivos o el numero total de negativos
         */


         int sumar = 7+ 8 + 9;

         if (sumar == -7 -8 + -9) {
            System.out.println("sumar el número a total");
            }else{
            System.out.println("sumar al total de negativos");
            }
            
          //-----------------------------------------------------------------------------------------------

         /*
          *Ejercicio 4.9
          *Un ángulo se considera agudo si es menor de 90
          *grados, obtuso si es mayor de 90 grados y recto si
          *es igual a 90 grados. Utilizando esta información,
          *escribir un algoritmo que acepte un ángulo en grados
          *y visualice el tipo de ángulo correspondiente a los
          *grados introducidos. 

          *Entrada: angulo
          *Proceso: Vaidar si el angulo esta entre los siguiente rangos
          angulo menor que 90, angulo mayor a 90, angulo igual a 90
          *Salida: mostrar
          */

          int a = 90;
        if (a < 90) {
            System.out.println("Ángulo Agudo");
        } else {
            if (a > 90) {
                System.out.println("Ángulo Obtuso");
            } else {
                System.out.println("Ángulo Recto");
            }
        }
    }
}

        
        
        
        
       
