package exercicio2psp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author damian
 */
public class Hilo extends Thread {
    /**
     * 
     * @param st nombre del hilo.
     */
    public Hilo(String st){
        super(st);
    }

    
    /**
     * Metodo run:
     * 
     *Con un contador de 0 a 5 que muestra el numero y nombre del hilo
     * Tambien duerme el hilo un segundo.
     * Cuando termina muestra final y nombre del hilo
     * 
     */
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            try{
                System.out.println(i+" "+getName());
                Hilo.sleep(1000);
            }catch(InterruptedException ex){
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Final hilo "+getName());
    }
}
