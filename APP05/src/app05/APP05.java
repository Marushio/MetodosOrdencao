/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app05;

import java.util.Random;

/**
 *
 * @author Marcio
 */
public class APP05 {

   public static void main(String[] args) {
   
        Random novonum = new Random();
        
        int[] vetor30 = new int[30];
        int[] nVetor30 = new int[30];
        int[] vetor20k = new int[20000];
        //Criação do vetor de 30 posições
        
        
        for (int i = 0; i < 30; i++) {
            vetor30[i]= novonum.nextInt(15)+novonum.nextInt(10);
        }
        ///Criação do vetor de 20000 posições
        for (int i = 0; i < 20000; i++) {
            vetor20k[i] = novonum.nextInt(45000)+novonum.nextInt(5000);
        }
        
        
        MergeSort mergeSort = new MergeSort();
        
        
        System.out.println("Vetor de 30 elementos :");
        FormasOrdenacao formasOrdenacao = new FormasOrdenacao();
        mergeSort.mergesort(vetor30, nVetor30, 0, 29);
        System.out.println();
        
        
        for (int i = 0; i < 30; i++) {
            System.out.print(vetor30[i]+ ", ");
        }
        System.out.println();
        
//        System.out.println("Vetor de 20.000 elementos :");
//        formasOrdenacao.insertionSort(vetor20k.clone());
//        formasOrdenacao.bubbleSort1(vetor20k.clone());
//        formasOrdenacao.bubbleSort2(vetor20k.clone());
//        formasOrdenacao.bubbleSort3(vetor20k.clone());
//        
        
    }  
}
