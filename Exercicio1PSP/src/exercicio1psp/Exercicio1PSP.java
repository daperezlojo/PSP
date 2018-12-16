
package exercicio1psp;

/**
 *
 * @author damian
 * 
 *  Programa en Java que cree dous fíos e os executa. Os fíos escriben dez veces un número de
    iteración do bucle e seu nome. En cada iteración, despois de escribir o seu nome, se bloquean
    durante un tempo aleatorio de segundos e después volven a estar dispoñibles para a súa
    execución.
 * 
 */
public class Exercicio1PSP {

    
    public static void main(String[] args) {
        //Inicio hilos
        new Hilo("Hilo a").start();
        new Hilo("Hilo b").start();
    }

}
