/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrados;

/**
 *
 * @author paulosouza
 */
import java.io.IOException;
import java.util.ArrayList;
import library.LerArquivo;

public class HeapSort {

    public static void main(String args[]) throws IOException {

        LerArquivo lerArquivo = new LerArquivo();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList = lerArquivo.getLinhasArquivo(LerArquivo.file20000);

        int[] vetor = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            vetor[i] = Integer.parseInt(arrayList.get(i));
        }

        long tempoInicial = System.currentTimeMillis();
        heap(vetor);
        long tempoFinal = System.currentTimeMillis();

        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

    }

    static void heapify(int a[], int n, int i) {
        int max, child;
        child = 2 * i + 1;
        max = i;
        if (child < n) {
            if (a[child] > a[max]) {
                max = child;
            }
        }
        if (child + 1 < n) {
            if (a[child + 1] > a[max]) {
                max = child + 1;
            }
        }
        if (max != i) {
            int temp = a[i];
            a[i] = a[max];
            a[max] = temp;
            heapify(a, n, max);
        }
    }

    static void buildheap(int a[]) {
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            heapify(a, a.length, i);
        }
    }

    static void heap(int a[]) {
        buildheap(a);
        for (int i = a.length - 1; i >= 1; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, i, 0);
        }
    }
}
