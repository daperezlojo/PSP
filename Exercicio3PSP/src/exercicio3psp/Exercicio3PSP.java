﻿
package exercicio3psp;

/**
 *
 * @damian
 * 
 *  Realizar un programa que cree un fío, que a súa vez cree outro fío, e así consecutivamente,
    ata un total de cinco fíos. Cada fío debe presentar o seu nome indicando que comenzou, crear
    o seu fío fillo e presentar o seu nome 10 veces indicando que se está procesando, esperando
    un tempo aleatorio entre 100 e 600 milisegundos entre cada presentación. Cada fío deberá
    esperar a que o seu fillo termine antes de presentar o seu último mensaxe indicando o seu
    nome e que rematou.
 */
public class Exercicio3PSP {

    
    public static void main(String[] args) {
            //Inicia el hilo
             new Hilo(0).start();
        
       
    }

}
