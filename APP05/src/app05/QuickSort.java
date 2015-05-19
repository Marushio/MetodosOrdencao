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
public class QuickSort {
    private int v[];
    private int n;
    private int trocas;
    private long tempoExecucao;
    
    public void leVector(int v[]){
        this.v = v;
        this.n=v.length;
        trocas=0;
        tempoExecucao = 0;
    }
    public void qSort(){
        
        long inicio=System.nanoTime(); 
        qSort2(0,n-1);
        long fim = System.nanoTime();
       // mostrarVetor(a);
        this.tempoExecucao=fim-inicio;
        System.out.println("Tempo em nanosegundo :"+tempoExecucao);
        for (int i = 0; i < 30; i++) {
            System.out.print(v[i]+ ", ");
        }
        System.out.println();
       
    } 
    private void qSort2(int esq, int dir){
        int posPivot;
        
        if(esq<dir){
            posPivot=particao(esq,dir);
            qSort2(esq,posPivot - 1);
            qSort2(posPivot+1,dir);
        }
    }
    private int particao(int e,int d){
        int a, b , aux;
        a=e;
        b=d;
        
        while(b>=a){
            if(v[a]<=v[e])
                a++;
            else if(v[b]>v[e])
                b--;
            else{
                
                troca(a, b);
                a++;
                b--;
                        
            }
        }
        troca(e, b);
        return b;
    }
    private void troca(int x,int y){
        int aux;
        aux=v[x];
        v[x]=v[y];
        v[y]=aux;
        trocas ++;
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
