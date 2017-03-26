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
        l.adicionarInicio(1);
        l.adicionarInicio(2);
        l.adicionarInicio(3);
        l.adicionarInicio(4);
        l.adicionarInicio(5);
        l.adicionaFinal(6);
               
        System.out.println(l);
        
        l.removerInicio();
         
        System.out.println(l);
        
        l.removerFinal();
        System.out.println(l);
        l.InserirPos(3, 40);
        System.out.println(l);
        l.removerPos(4);
        System.out.println(l);
         
    }
    
}
