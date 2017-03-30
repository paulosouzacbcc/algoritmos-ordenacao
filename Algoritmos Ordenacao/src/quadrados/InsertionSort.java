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
public class InsertionSort {

    public static void main(String[] args) throws IOException {

        LerArquivo lerArquivo = new LerArquivo();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList = lerArquivo.getLinhasArquivo(LerArquivo.file20000);

        int[] vetor = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            vetor[i] = Integer.parseInt(arrayList.get(i));
        }

        long tempoInicial = System.currentTimeMillis();

        insertionSort(vetor);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

    }

    static void insertionSort(int[] vetor) {
        int j;
        int key;
        int i;

        for (j = 1; j < vetor.length; j++) {
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }
    }

}
