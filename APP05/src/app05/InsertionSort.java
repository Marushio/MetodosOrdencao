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
public class InsertionSort {
    private int v[];
    private int n;
    private int trocas;
    private long tempoExecucao;
    
    public void leVector(int v[]){
        this.v = v;
        n=v.length;
        trocas=0;
        tempoExecucao = 0;
    }
    public void insertionSort(){
        
        System.out.println("Inserction");
       // mostrarVetor(a);
        long inicio=System.nanoTime();  
        for (int i = 1; i < v.length; i++) {
            int temp = v[i];
            int j;
            for (j = i - 1; j >= 0 && temp <v[j]; j--) {
                v[j+1] = v[j];
                trocas++;
            }
            v[j + 1] = temp;
        }
        long fim = System.nanoTime();
       // mostrarVetor(a);
        tempoExecucao =fim-inicio;
        System.out.println("Tempo em nanosegundo :"+tempoExecucao);
    }
     public int getTrocas() {
        return trocas;
    }
    
    public long getTempoExecucao() {
        return tempoExecucao;
    }

    public int[] getV() {
        return v;
    }
    
    
}
