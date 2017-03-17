/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrados;

import java.io.IOException;
import java.util.ArrayList;
import library.LerArquivo;

/**
 *
 * @author paulosouza
 */
public class BubbleSort {

    public static void main(String[] args) throws IOException {

        LerArquivo lerArquivo = new LerArquivo();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList = lerArquivo.getLinhasArquivo(LerArquivo.file5000);

        int[] vetor = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            vetor[i] = Integer.parseInt(arrayList.get(i));
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
