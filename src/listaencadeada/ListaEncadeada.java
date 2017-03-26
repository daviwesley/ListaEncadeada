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
public class ListaEncadeada {
    private No inicio;
    private No ultimo;
    private int tam;
    
    public ListaEncadeada(){
        inicio = new No(null);
        ultimo = inicio;
        
    }
    
    public void adicionar(Integer data){
        No n = new No(data);
        if(tam == 0){
            inicio.prox = n;
            ultimo = n;
            tam++;
        }else{
            No temp = inicio.prox;
            inicio.prox = n;
            n.prox = temp;
        }
    }
    public int getTam(){
        return tam;
    }
    public String toString(){
        No n = inicio.prox;
        String temp = "";
        
        while(n !=null){
            temp = temp + n.data;
            n = n.prox;
        }
        return temp;
    }
    
}
