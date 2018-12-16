
package exercicio4psp;

/**
 *
 * @author damian
 * 
 *  Realiza un programa en java que execute tres fíos de forma concurrente. Un de eles debe sumar os
    números pares del 1 ao 1000, outro os impares, e outro, os que terminen en dous ou en tres.
 */
public class Exercicio4PSP {

    
    public static void main(String[] args) {
        //Iniciamos hilos
        new HiloPar("Pares").start();
        new HiloImpar("Impares").start();
        new Hilo2y3("Hilo 2 y 3").start();
        
    }

}
