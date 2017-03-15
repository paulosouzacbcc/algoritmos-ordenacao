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
public class SeletionSort {

      public static void main(String[] args) throws IOException {
   
    int quantidade = 10000;
    int[] vetor = new int[quantidade];
    for (int i = 0; i < vetor.length; i++) {
       vetor[i] = (int) (Math.random()*quantidade);
    }
   
    long tempoInicial = System.currentTimeMillis();
   
    selectionSort(vetor);
   
    long tempoFinal = System.currentTimeMillis();
   
    System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
   
  }
                  
  public static void selectionSort(int[] array) {
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
