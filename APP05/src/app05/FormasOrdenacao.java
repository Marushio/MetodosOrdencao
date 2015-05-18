/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app05;
/**
 *
 * @author Marcio
 */
public class FormasOrdenacao {
    
    public void insertionSort(int [] a){
        
        System.out.println("Inserction");
       // mostrarVetor(a);
        long inicio=System.nanoTime();  
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j;
            for (j = i - 1; j >= 0 && temp <a[j]; j--) {
                a[j+1] = a[j];
            }
            a[j + 1] = temp;
        }
        long fim = System.nanoTime();
       // mostrarVetor(a);
        long resultado =fim-inicio;
        System.out.println("Tempo em nanosegundo :"+resultado);
    }
    
    public void bubbleSort1(int v[]){
        int i,j,tmp,n;
        n=v.length;
        System.out.println("Bolha versão 1");
      //  mostrarVetor(v);
        long inicio=System.nanoTime(); 
        for (i=0; i<n-1; i++){
            for (j=0; j<n-2-i; j++)
                if (v[j]<v[j+1]) {
                    tmp= v[j];
                    v[j]= v[j+1];
                    v[j+1] = tmp;
                }
            
        }
        long fim = System.nanoTime();
       // mostrarVetor(v);
        long resultado =fim-inicio;
        System.out.println("Tempo em nanosegundo :"+resultado);
   
    }
    
    public void bubbleSort2(int v[]){
        int i, j, tmp,n;
        
        boolean trocas = true;
        n=v.length;
        System.out.println("Bolha versão 2");
    //    mostrarVetor(v);
        long inicio=System.nanoTime();
        for (i = 0; i < n-1 && trocas; i++) {
            trocas = false;        
            for (j = 0; j< n-2-i; j++) {
                if (v[j] > v[j+1]) {
                    tmp = v[j];
                    v[j]=v[j+1];
                    v[j+1] = tmp;
                    trocas = true;
                }
            }
        }
        long fim = System.nanoTime();
     //   mostrarVetor(v);
        long resultado =fim-inicio;
        System.out.println("Tempo em nanosegundo :"+resultado);
    }
    
    public void bubbleSort3(int v[]){
        int i, j, p, ptrocas = 0, tmp, n;
        boolean trocas = true;
        n=v.length;
        System.out.println("Bolha versão 3");
//        mostrarVetor(v);
        long inicio=System.nanoTime();
        p = n-1;
        for (i = 0; i < n-1 && trocas; i++) {
            trocas = false;
        
            for (j = 0; j < p; j++) {
                if (v[j] > v[j+1]) {
                    tmp = v[j];
                    v[j]=v[j+1];
                    v[j+1] = tmp;
                    trocas = true;
                    ptrocas = j;
                }
            }    
            p = ptrocas;
            
        }    
        long fim = System.nanoTime();
//       mostrarVetor(v);
        long resultado =fim-inicio;
        System.out.println("Tempo em nanosegundo :"+resultado);
    }

    
//Metodo implentado meramente para testes e confirmações de conteudo...    
//    public void mostrarVetor(int [] v){
//        for (int i = 0; i < 30; i++) {
//            System.out.print(v[i]+ ", ");
//        }
//        System.out.println();
//    }
    
}
