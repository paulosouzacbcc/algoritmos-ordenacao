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
import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {

    public static void main(String args[]) {

        int quantidade = 10000;
        int[] vetor = new int[quantidade];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * quantidade);
        }

        System.out.println("The unsorted array is:");
        System.out.println(Arrays.toString(vetor));

        long tempoInicial = System.currentTimeMillis();
        heap(vetor);
        long tempoFinal = System.currentTimeMillis();
        
        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");


        System.out.println("The sorted array is:");
        System.out.println(Arrays.toString(vetor));
        
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
