package exercicio4psp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author damian
 */
public class Hilo2y3 extends Thread implements Runnable{
    private int cuenta=0;
    /**
     * Constructor del Hilo.
     * @param st nombre del hilo
     */
    public Hilo2y3(String st){
        super(st);
    }
    /**
     * Metodo run
     * Contiene el bloque de ejecución del hilo.
     *Contador de 0 a 1000 que muestra en pantalla 2y3  y la cuenta.
     * Duerme el hilo 10 milisegundos.
     * Al acabar muestra el mensaje Termina el hilo y el nombre del hilo.
     */

    @Override
    public void run(){
        for(int i=0; i<=1000; i++){
            if(i%10==2||i%10==3){
                try{
                    cuenta=cuenta+i;
                    System.out.println("2y3 -"+cuenta);
                    Hilo2y3.sleep(10);
                }catch(InterruptedException ex){
                    Logger.getLogger(Hilo2y3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        System.out.println("Termina el hilo "+getName());
    }

}
