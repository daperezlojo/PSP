package exercicio7psp;

/**
 *
 * @author damian
 */

import javax.swing.JOptionPane;

public class Buzon {
    
    private boolean cheo = false;
    private String mensaxe;

    /**
     * Creamos un método sincronizado para escribir el mensaje. 
     * Por lo que si ya hay un mensaje no nos deja escribirlo
     * @throws InterruptedException 
     */
    public synchronized void escribir() throws InterruptedException {
        
        if(cheo == true){
            wait();
        }
        mensaxe = String.valueOf(JOptionPane.showInputDialog("Escriba a mensaxe:"));
        cheo = true;
         notify();
    }
    /**
     * Método sincronizado para ler mensajes. Si el buzon esta vacio no permite
     * leer. Si esta lleno muestra el mensaje escrito
     * @throws InterruptedException 
     */
    
    public synchronized void ler() throws InterruptedException {
        
        if(cheo == false){
            wait();
        }
        JOptionPane.showMessageDialog(null, mensaxe);
        cheo = false;
        notify();
    }

}
