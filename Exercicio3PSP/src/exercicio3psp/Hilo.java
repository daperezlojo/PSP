package exercicio3psp;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author damian
 * 
 */
public class Hilo extends Thread{
    
    Hilo a;
    /**
     * 
     * 
     * @param contador variable  int para establecer un maximo de 5 hilos, creando asi hilos hijos.
     */
     public Hilo (int contador) {
        contador = contador + 1;
        //Mensaje cuando inicia el hilo
        System.out.println(getName() + " Comienzo");
        //Condicion para que se creen 5 hilos.
        if (contador < 5) {
            a=new Hilo(contador);
            a.start();
        }
     }
     /**
      * Metodo run
      * 
      * Contador de 0 a 10 que muestra nombre y numero del hilo
      * Tambien duerme el hilo.
      */
    @Override
    public void run() {
          //
          for (int i = 0; i < 10; i++) {
            System.out.println(getName() + " funcionando");
            try {
                Thread.sleep((long) (Math.random() * 600) + 1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          //Identificacion del ultimo hilo
        if (!getName().equals("Thread-4")) {
            try {
                //Usamos el join para que los padres esperen a que terminen los hijos
                a.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println(getName() + " fin");
    }
    }


