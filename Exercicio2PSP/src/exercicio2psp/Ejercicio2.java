
package exercicio2psp;

/**
 *
 * @author damian
 * 
 *  Programa que crea 4 fíos, os executa e espera a que estes terminen. Os fíos escriben 5 veces o
    número de iteración do bucle e o seu nome. En cada iteración, despois de escribir o seu nome,
    bloquéanse durante un segundo e volven a estar dispoñibles para a súa execución.
 * 
 */
public class Ejercicio2 {

    
    public static void main(String[] args) {
        
        //Inician los hilos
        new Hilo("Hilo a").start();
        new Hilo("Hilo b").start();
        new Hilo("HIlo c").start();
        new Hilo("Hilo d").start();
        
    }

}
