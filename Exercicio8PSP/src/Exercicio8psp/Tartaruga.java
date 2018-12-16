package Exercicio8psp;

/**
 *
 * @author damian
 */

import java.util.logging.Level;
import java.util.logging.Logger;

public class Tartaruga extends Thread {

    private Carreira carreira;
    private int posicion = 1;

    public Tartaruga(Carreira carreira) {
        this.carreira = carreira;
    }

    
    /**
     * Mientra la tortuga no llegue a la casilla 70 y no halla llegado ya la 
     * liebre a meta, ejecuta el método carreiraTortuga para avanzar, suspendiendose
     * un segundo entre iteraciones.Dependiendo de si gana o pierde mestra el mensaje
     * correspondiente y se finaliza el hilo
     */
    @Override
    public void run() {

        try {
            while (posicion < 70 && carreira.fin == false) {
                posicion = carreira.carreiraTartaruga(posicion);
                sleep(1000);
            }
            if (carreira.ganaTartaruga == true) {

                System.out.println("Gana la tortuga");
                this.stop();
            } else{
                System.out.println("La tortuga pierde");
                this.stop();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Tartaruga.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
