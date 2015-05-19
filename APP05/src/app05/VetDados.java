/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Marcio
 */
public class VetDados {
    private List prateleira;
    
    public VetDados (){
        this.prateleira = new ArrayList();
    }
    
    public void add(Dados d){
        prateleira.add(d);
        
    }
   
    public Object get(int i){
        return prateleira.get(i);
        
    }
    public int size(){
        return prateleira.size();
        
    }
    public void remove(int i){
        prateleira.remove(i);
        
        
    }
    public Iterator iterator(){
        return prateleira.iterator();
        
    } 
    public List getPrateleira(){
        return prateleira;
    }
      
}
