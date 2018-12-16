package Exercicio8psp;

/**
 *
 * @author damian
 */

import java.util.logging.Level;
import java.util.logging.Logger;

public class Lebre extends Thread {

    private Carreira carreira;
    private int posicion = 1;

    public Lebre(Carreira carreira) {
        this.carreira = carreira;
    }
    
    /**
     * Mientra la liebre no llegue a la casilla 70 y no halla llegado ya la 
     * tortuga a meta, ejecuta el método carreiraLebre para avanzar, suspendiendose
     * un segundo entre iteraciones.Dependiendo de si gana o pierde mestra el mensaje
     * correspondiente y se finaliza el hilo
     */
    @Override
    public void run() {

        try {
            while (posicion < 70 && carreira.fin == false) {
                posicion = carreira.carreiraLebre(posicion);
                sleep(1000);
            }
            if (carreira.ganaLiebre == true) {
                System.out.println("Gana la liebre");
                this.stop();
            } else {
                System.out.println("La liebre pierde");
                this.stop();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Lebre.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
