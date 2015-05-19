package app05;

import javax.swing.table.AbstractTableModel;

/**
 * @author DiógenesGalileu
 */
public abstract class TestesTabelaModelo extends AbstractTableModel{
    BubbleSort bubble = new BubbleSort();
    InsertionSort insertion = new InsertionSort();
    MergeSort merge = new MergeSort();
    QuickSort quick = new QuickSort();
    
    String [] nomeColunas = {"Algoritmo", "Tempo de Execução", "Qntd. de Trocas"};
    
    Object [][] dados = {
        {"Bubble Sort", bubble.getTempoExecucao(),bubble.getTrocas()},
        {"Insertion Sort", insertion.getTempoExecucao(), insertion.getTrocas()},
        {"Merge Sort", "", "", ""},
        {"Quick Sort", quick.getTempoExecucao(), quick.getTrocas()}
    };
}
