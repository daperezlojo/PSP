package exercicio6psp;

/**
 *
 * @author damian
 */
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ingreso extends Thread {

    private Conta conta;
    private double cantidad;

    public Ingreso(Conta conta, double cantidad) {
        this.conta = conta;
        this.cantidad = cantidad;
    }

    /**
     *Creamos un bucle que realiza 10 ingresos a la cuenta
     */
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                conta.ingresar(cantidad);

            } catch (InterruptedException ex) {
                Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
