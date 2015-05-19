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
public class Dados {
    private String nAlgoritmo;
    private int nTrocas;
    private long tExecução;

    public String getnAlgoritmo() {
        return nAlgoritmo;
    }

    public void setnAlgoritmo(String nAlgoritmo) {
        this.nAlgoritmo = nAlgoritmo;
    }

    public int getnTrocas() {
        return nTrocas;
    }

    public void setnTrocas(int nTrocas) {
        this.nTrocas = nTrocas;
    }

    public long gettExecução() {
        return tExecução;
    }

    public void settExecução(long tExecução) {
        this.tExecução = tExecução;
    }
}
