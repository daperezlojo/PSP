package exercicio6psp;

/**
 *
 * @author damian
 */

public class Exercicio6PSP {

    /**
     * Simular a caixa dunha empresa con dous fíos. Un simulará o ingreso, ca
     * compra de artigos por parte de clientes e o outro a extracción de cartos
     * da caixa co pago a proveedores. A conta terá un capital inicial. Realizar
     * 10 ingresos e 5 extraccións.
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Instanciamos un hilo para los ingresos y otro para las retiradas y los iniciamos
         * La cantidad para ingresar y retirar sera 1
         */
        Conta conta = new Conta();
        Ingreso ing = new Ingreso(conta,1);
        Retirada ret = new Retirada(conta,1);
        
        ing.start();
        ret.start();

    }

}
