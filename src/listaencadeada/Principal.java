/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencadeada;

/**
 *
 * @author davi
 */
public class Principal {
    
    public static void main(String [] args){
        ListaEncadeada l = new ListaEncadeada();
        l.adicionar(1);
        l.adicionar(2);
        l.adicionar(3);
        l.adicionar(4);
        
        System.out.println(l);
    }
    
}
