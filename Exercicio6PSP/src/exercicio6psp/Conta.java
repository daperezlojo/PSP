package exercicio6psp;

/**
 *
 * @author damian
 */
public class Conta {

    private double capital = 1000;
    private boolean retirando = false;
    private boolean ingresando = true;

    /**
     * permite recoger el capital
     * @return 
     */
    public double getCapital() {
        return capital;
    }
    /**
     * permite cambiar cambiar el capital
     * @param capital 
     */
    public void setCapital(double capital) {
        this.capital = capital;
    }

    /**
     * Metodo para ingresar dinero, sincronizado con el método de retirar. 
     * Lo que permite que no se puedan hacer ambas cosas a la vez impidiendo que haya errores con la cantidad de capital 
     * Si se esta retirando se espera y al terminar de ingresar se notifica
     * @param cantidad
     * @throws InterruptedException 
     */
    public synchronized void ingresar(double cantidad) throws InterruptedException {
        ingresando = true;
        while (retirando == true) {
            wait();
        }
        capital = capital + cantidad;
        ingresando = false;
        System.out.println("Saldo: " + capital + " -->INGRESO");
        notify();

    }

     /**
     * Metodo para ingresar dinero, sincronizado con el método de retirar. 
     * Lo que permite que no se puedan hacer ambas cosas a la vez impidiendo que haya errores con la cantidad de capital 
     * Si se esta retirando se espera y al terminar de retirar se notifica
     * @param cantidad
     * @throws InterruptedException 
     */
    public synchronized void retirar(double cantidad) throws InterruptedException {
        retirando = true;
        while (ingresando == true) {
            wait();
        }
        capital = capital - cantidad;
        retirando = false;
        System.out.println("Saldo: " + capital + " --> RETIRADA");
        notify();

    }

}
