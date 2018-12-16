package exercicio5psp;

import static exercicio5psp.Exercicio5PSP.count;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author damian
 */
public class HiloPrior extends Thread {

    /**
     * Constructor del Hilo.
     *
     * @param st nombre del hilo
     */
    public HiloPrior(String st) {
        super(st);
    }

    /**
     * Metodo run Contiene el bloque de ejecución del hilo. 
     * Condicion que dice que cuando el valor es superior a 2 se acaba. 
     * Si entra dentro de la condicion crea un hilo 
     * Al acabar muestra  Termina el hilo + el nombre del hilo.
     * 
     *
     */

    @Override
    public void run() {
        while (count <= 2) {
            count++;
            //Crea el hilo 1 y 2
            Hilo Hilo = new Hilo("Hilo " + count);
            //Arranca el hilo creado anteriormente.

            Hilo.setPriority(MIN_PRIORITY);

            Hilo.start();
            try {
                Hilo.sleep(1);
                //Espera el hilo padre a que termine primero el hilo hijo
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloPrior.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println("Soy el Hilo " + getName());
        }
    }
}
