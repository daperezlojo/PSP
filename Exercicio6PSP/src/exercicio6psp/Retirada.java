package exercicio6psp;

/**
 *
 * @author damian
 */

import java.util.logging.Level;
import java.util.logging.Logger;

public class Retirada extends Thread {

    private Conta conta;
    private double cantidad;

    public Retirada(Conta conta, double cantidad) {
        this.conta = conta;
        this.cantidad = cantidad;
    }

    /**
     * Creamos un bucle que realiza 5 retiradas de la cuenta
     */
    @Override
    public void run() {

        for (int r = 0; r < 5; r++) {
            try {
                conta.retirar(cantidad);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Retirada.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
