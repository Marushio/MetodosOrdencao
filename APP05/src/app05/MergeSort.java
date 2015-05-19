/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app05;


public class MergeSort {
    private int trocas;
    private long tempoExecucao;
    public void mergesort(int v[], int nv[], int esquerda, int direita){
        int meio;
        
        if (esquerda<direita) {
            meio = (esquerda+direita)/2;
            mergesort(v, nv, esquerda, meio);
            mergesort(v, nv, meio+1, direita);
            juntar(v, nv, esquerda, meio+1, direita);
        }
    }
    
    private void juntar(int v[], int nv[], int esquerda, int meio, int fimDireita){
        int fimEsquerda=meio-1;
        int cursor = 0;
        int cursorE=esquerda;
        int cursorD=meio;
        
        while (cursorE <= fimEsquerda && cursorD<=fimDireita) {            
            if (v[cursorE]<v[cursorD]) {
                nv[cursor]=v[cursorE];
                cursorE++;
            }
            else {
                nv[cursor] = v[cursorD];
                cursorD++;
            }
            cursor++;
        }
        while (cursorE <= fimEsquerda) {
            nv[cursor]=v[cursorE];
            cursorE++;
            cursor++;
        }
        while (cursorE <= fimDireita) {
            nv[cursor]=v[cursorD];
            cursorD++;
            cursor++;
        }
    }
}
