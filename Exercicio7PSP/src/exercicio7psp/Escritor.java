package exercicio7psp;

/**
 *
 * @author damian
 */

import java.util.logging.Level;
import java.util.logging.Logger;

public class Escritor extends Thread {

    private Buzon buzon;

    public Escritor(Buzon buzon) {
        this.buzon = buzon;
    }

    /**
     * En este hilo creamos un bucle que llama 5 veces al metodo escribir de la clase buzon
     */
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            try {
                buzon.escribir();
            } catch (InterruptedException ex) {
                Logger.getLogger(Escritor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
