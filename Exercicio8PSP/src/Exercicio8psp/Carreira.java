package Exercicio8psp;

/**
 *
 * @author damian
 */

public class Carreira {

    public boolean ctartaruga = true;
    public boolean clebre = false;
    public boolean ganaLiebre = false;
    public boolean ganaTartaruga = false;
    public boolean fin = false;

    /**
     * Indicamos en el constructor el comienzo de la carrera
     */
    public Carreira() {
        System.out.println("Comienza la carrera");
    }
    /**
     * Método para calcular los movimientos de la liebre, sincronizado con el de
     * la tortuga, para que no haya conflicto. Si la tortuga se esta moviendo 
     * esperamos y una vez termina de moverse la liebre lo notifica. Generamos un
     * número aleatorio y dependiendo cual toque avanza o retrocede x casillas.
     * @param posicion
     * @return
     * @throws InterruptedException 
     */
    public synchronized int carreiraLebre(int posicion) throws InterruptedException {
        clebre = true;

        if (ctartaruga == true) {
            wait();
        }

        int prob = (int) ((Math.random() * (100)) + 1);

        if (prob <= 20) {
            posicion = posicion + 0; 
        } else if (prob > 20 && prob <= 40) {
            posicion = posicion + 9;
        } else if (prob > 40 && prob <= 50) {
            posicion = posicion - 12;
        } else if (prob > 50 && prob <= 80) {
            posicion = posicion + 1;
        } else if (prob > 80 && prob <= 100) {
            posicion = posicion - 2;
        }
        //Si al retroceder se la la posibilidad de que genere un número negativo, vuelve a la casilla de salida
        if (posicion < 0) {
            posicion = 1;
        //Si la liebre llega a la casilla 70 cambiamos dichos boleanos a true para notificar el fin de la carrera en el thread
        } else if (posicion >= 70) {
            ganaLiebre = true;
            fin = true;
        }
        //indicamos la posicion actual de la liebre 
        System.out.println("Lebre-->" + posicion);
        //cambiamos el boleano para dar paso a la tortuga
        clebre = false;
        notify();
        return posicion;
    }
    /**
     * Método para calcular los movimientos de la tortuga, sincronizado con el de
     * la liebre, para que no haya conflicto. Si la liebre se esta moviendo 
     * esperamos y una vez termina de moverse la tortuga lo notifica. Generamos un
     * número aleatorio y dependiendo cual toque avanza o retrocede x casillas.
     * @param posicion
     * @return
     * @throws InterruptedException 
     */
    public synchronized int carreiraTartaruga(int posicion) throws InterruptedException {
        ctartaruga = true;

        if (clebre == true) {
            wait();
        }

        int prob = (int) ((Math.random() * (100)) + 1);

        if (prob <= 50) {
            posicion = posicion + 3;
        } else if (prob > 50 && prob <= 70) {
            posicion = posicion - 6;
        } else if (prob > 70 && prob <= 100) {
            posicion = posicion + 1;
        }
        //indicamos la posicion actual de la tortuga 
        System.out.println("Tartaruga-->" + posicion);
        //Si al retroceder se la la posibilidad de que genere un número negativo, vuelve a la casilla de salida
        if (posicion < 0) {
            posicion = 1;
        }
        //Si la tortuga llega a la casilla 70 cambiamos dichos boleanos a true para notificar el fin de la carrera en el thread
        if (posicion >= 70) {
            ganaTartaruga = true;
            fin = true;
        }
        //cambiamos el boleano para dar paso a la liebre
        ctartaruga = false;
        notify();
        return posicion;
    }

}
