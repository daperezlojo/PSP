package exercicio7psp;

/**
 *
 * @author damian
 */


public class Exercicio7PSP {

    /**
     * Programa que simule un buzón de correo (recurso compartido), de xeito que
     * se poida leer unha mensaje ou envialo. O buzón soamente pode almacear
     * unha mensaxe, de xeito que para poder escribir débese atopar baleiro e
     * para poder leer debe de estar cheo. Crear varios fíos lectores e
     * escritores que manexen o buzón de xeito sincronizado.
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Instanciamos e iniciamos os dous fios que chamarán aos métodos 
         * sincronizados de leer e escribir mensaxes.
         * Instanciamos e iniciamos los dos hilos que llamaran a los metodos 
         * sincronizados de leer y escribir mensajes
         */
        Buzon buz = new Buzon();

        Escritor esc = new Escritor(buz);
        esc.start();

        Lector lec = new Lector(buz);
        lec.start();

    }

}
