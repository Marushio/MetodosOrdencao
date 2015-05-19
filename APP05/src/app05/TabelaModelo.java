/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app05;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marcio
 */
public class TabelaModelo extends AbstractTableModel {
    private VetDados vetDados;
    String[] nomeColunas = {"Algoritmo","Tempo de Execução","Qntd. de Trocas"};
    
    public TabelaModelo(VetDados vetDados) {
        this.vetDados = vetDados;
        
    }

    @Override
    public int getRowCount() {
        return vetDados.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }
    
    @Override
    public String getColumnName(int col){
        return nomeColunas[col];
    }
    
    @Override
    public boolean isCellEditable(int row, int col){
        if(col == 0) {
            return false;
        }
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
}
