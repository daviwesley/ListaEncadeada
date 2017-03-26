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
    
    public void InserirPos(int pos, Integer data){
        if(pos <=0 || pos > tam)
            return;
        else if(pos == 1){
            adicionarInicio(data);            
        }
        else if(pos == tam){
            adicionaFinal(data);
        }
        else{
        No n = new No(data);
        No x = inicio.prox;
        int count = 1;
        
        while(count != pos - 1){
            x = x.prox;
            count++;
        }
        No temp = x.prox;
        x.prox = n;
        n.prox = temp;
        tam++;
    }
    }
    
    public void adicionarInicio(Integer data){
        No n = new No(data);
        if(tam == 0){
            inicio.prox = n;
            ultimo = n;
            tam++;
        }else{
            No temp = inicio.prox;
            inicio.prox = n;
            n.prox = temp;
            tam++;
        }
    }
    
    public void adicionaFinal(Integer data){
        No n = new No(data);
        if(tam == 0){
            inicio.prox = n;
            ultimo = n;
            tam++;
        }else{
            ultimo.prox = n;
            ultimo = n;
            tam++;
        }
    }
    
    public void removerInicio(){
        if(tam != 0){
        inicio.prox = inicio.prox.prox;
        tam--;
        }
    }
    
    public void removerFinal(){
        if(tam == 1){
            inicio.prox = null;
            ultimo = inicio;
        }else if(tam != 0){
            No n = inicio.prox;
            int count = 1;
            while(count != tam - 1){
                n = n.prox;
                count++;                
            }
            ultimo = n;
            ultimo.prox = null;
            tam--;
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
