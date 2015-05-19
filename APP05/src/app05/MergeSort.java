/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app05;


public class MergeSort {
    private int trocas;  
    private int v[];
    private long tempoExecucao;

    public int getTrocas() {
        return trocas;
    }

    public int[] getV() {
        return v;
    }

    public long getTempoExecucao() {
        return tempoExecucao;
    }
    
   
    public void leVector(int v[]){
        this.v = v;
        trocas=0;
        tempoExecucao = 0;
    }
    public void executarOrdenacao(){
        long inicio=System.nanoTime(); 
        mergeSortRecurso(v,0,v.length-1);
        long fim = System.nanoTime();
  
        this.tempoExecucao=fim-inicio;
        
    }
            
            
    private void mergeSortRecurso(int[] array, int inicio, int fim) {
	if (fim <= inicio) {
		return;
	}
	int meio = (inicio + fim) / 2;
	mergeSortRecurso(array, inicio, meio);
	mergeSortRecurso(array, meio + 1, fim);
	int[] A = new int[meio - inicio + 1];
	int[] B = new int[fim - meio];
	for (int i = 0; i <= meio - inicio; i++) {
		A[i] = array[inicio + i];
                
	}
	for (int i = 0; i <= fim - meio - 1; i++) {
		B[i] = array[meio + 1 + i];
	}
	int i = 0;
	int j = 0;
	for (int k = inicio; k <= fim; k++) {
		if (i < A.length && j < B.length) {
			if (A[i] < B[j]) {
				array[k] = A[i++];
                                trocas++;
                                
			} else {
				array[k] = B[j++];
                                trocas++;
			}
		} else if (i < A.length) {
			array[k] = A[i++];
                        trocas++;
		} else if (j < B.length) {
			array[k] = B[j++];
                        trocas++;
		}
	}
    }
}
