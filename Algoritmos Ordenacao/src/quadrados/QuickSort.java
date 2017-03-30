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
public class QuickSort {

    public static void main(String[] args) throws IOException {

        LerArquivo lerArquivo = new LerArquivo();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList = lerArquivo.getLinhasArquivo(LerArquivo.file20000);

        int[] vetor = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            vetor[i] = Integer.parseInt(arrayList.get(i));
        }

        long tempoInicial = System.currentTimeMillis();

        quickSort(vetor, 0, vetor.length - 1);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

    }

    private static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    private static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo) {
                i++;
            } else if (pivo < vetor[f]) {
                f--;
            } else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }

}
