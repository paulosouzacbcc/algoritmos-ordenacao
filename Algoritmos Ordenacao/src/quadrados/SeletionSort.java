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
public class SeletionSort {

    public static void main(String[] args) throws IOException {

        LerArquivo lerArquivo = new LerArquivo();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList = lerArquivo.getLinhasArquivo(LerArquivo.file20000);

        int[] vetor = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            vetor[i] = Integer.parseInt(arrayList.get(i));
        }

        long tempoInicial = System.currentTimeMillis();

        selectionSort(vetor);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

    }

    static void selectionSort(int[] array) {
        for (int fixo = 0; fixo < array.length - 1; fixo++) {
            int menor = fixo;

            for (int i = menor + 1; i < array.length; i++) {
                if (array[i] < array[menor]) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                int t = array[fixo];
                array[fixo] = array[menor];
                array[menor] = t;
            }
        }
    }
}
