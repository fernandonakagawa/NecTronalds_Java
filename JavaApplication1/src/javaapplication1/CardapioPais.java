/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.ArrayList;
public class CardapioPais {
    private String nomePais;
    private ArrayList<Lanche> lanches;
    public CardapioPais(String nomePais){
        this.nomePais = nomePais;
        this.lanches = new ArrayList<>();
    }
    public void AdicionarLanche(Lanche l){
        this.lanches.add(l);
    }
    public void AdicionarLanche(String nome, 
            String descricao, 
            float preco){
        Lanche l = new Lanche(nome, descricao, preco);
        AdicionarLanche(l);
    }
    public void RemoverLanche(Lanche l){
        this.lanches.remove(l);
    }
    
    public String getNomePais(){return nomePais;}
    public ArrayList<Lanche> getLanches(){
        return lanches;
    }
}
