package exercicio1psp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author damian
 */
public class Hilo extends Thread {
    
    /**
     * @param str nombre del hilo.
     */
    public Hilo(String str) {
        super(str);
    }
       /**
        * Metodo run:
        * Con un contador de 0 a 10 mostramos el numero y el nombre dle hilo y lo duerme al final
        * Cuando acaba muestra final y el nombre del hilo
        */
       @Override
       public void run(){
           
           for (int i = 0; i < 10; i++) {
               System.out.println(i+" "+getName());
               try {
                   Hilo.sleep((long) (Math.random()*1000)+1);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           System.out.println("Final "+getName());
           
       }
}
