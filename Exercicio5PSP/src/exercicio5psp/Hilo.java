package exercicio5psp;

import static exercicio5psp.Exercicio5PSP.count;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author damian
 */
public class Hilo extends Thread{
    /**
     * Constructor del Hilo.
     * @param st nombre del hilo
     */
     public Hilo(String st){
        super(st);
    }
     /**
     * Metodo run
     * Contiene el bloque de ejecución del hilo.
     * Condicion que dice que cuando el valor es superior a 2 se acaba.
     * Si entra dentro de la condicion crea un hilo 
     * Al acabar muestra el mensaje Termina el hilo + el nombre del hilo.
     * 
     */

    @Override
    public void run(){
        try{

            while(count<=2){
                count++;
                //Crea el hilo 1 y 2
                Hilo Hilo=new Hilo("Hilo "+ count);
                //Inicia el hilo creado anteriormente.    
                Hilo.start();
                //Espera el hilo padre a que termine primero el hilo hijo
                Hilo.join();

                System.out.println("Soy el Hilo "+getName());
            }
        }catch(InterruptedException ex){
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}