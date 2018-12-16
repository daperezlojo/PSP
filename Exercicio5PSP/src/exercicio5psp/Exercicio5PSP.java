
package exercicio5psp;

/**
 *
 * @author damian
 * 
 *  Escribe unha clase que cree dous fíos e force que a escritura do segundo sexa sempre anterior á
    escritura por pantalla do primeiro.
    Exemplo de ejecución:
    Ola, son o fío número 2
    Ola, son o fío número 1
    a) faino con join
    b )faino con prioridades
 */
public class Exercicio5PSP {
    static int count=1;
    
    public static void main(String[] args) throws InterruptedException {
       new Hilo("Hilo " + count).start();
        
    }

}
