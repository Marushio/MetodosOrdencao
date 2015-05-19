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
public class BubbleSort {
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
    public void bubbleSort1(){
        int i,j,tmp;
       
        long inicio=System.nanoTime(); 
        for (i=0; i<n-1; i++){
            for (j=0; j<n-2-i; j++)
                if (v[j]<v[j+1]) {
                    tmp= v[j];
                    v[j]= v[j+1];
                    v[j+1] = tmp;
                    trocas++;
                }
            
        }
        long fim = System.nanoTime();
       
        tempoExecucao=fim-inicio;
        System.out.println("Tempo em nanosegundo :"+tempoExecucao);
   
    }

    public int[] getV() {
        return v;
    }

    public int getTrocas() {
        return trocas;
    }

    public long getTempoExecucao() {
        return tempoExecucao;
    }
    
}
