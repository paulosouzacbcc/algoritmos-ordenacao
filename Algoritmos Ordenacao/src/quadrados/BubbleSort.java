/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrados;

import java.io.IOException;

/**
 *
 * @author paulosouza
 */
public class BubbleSort {

    public static void main(String[] args) throws IOException {

        int quantidade = 10000;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * quantidade);
        }

        long tempoInicial = System.currentTimeMillis();

        bubbleSort(vetor);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

    }

    private static void bubbleSort(int vetor[]) {
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
    }
}
