package exercicio7psp;

/**
 *
 * @author damian
 */

import java.util.logging.Level;
import java.util.logging.Logger;


public class Lector extends Thread{
    
    private Buzon buzon;

    public Lector(Buzon buzon) {
        this.buzon = buzon;
    }
    
    /**
     * En este hilo creamos un bucle que llama 5 veces al metodo leer de la clase Buzón
     */

    @Override
    public void run() {
         
        for(int i = 0; i<5 ; i++){
            try {
                buzon.ler();
            } catch (InterruptedException ex) {
                Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
    
}
