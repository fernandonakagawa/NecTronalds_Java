/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author senai
 */
public class Lanche {
    private String nome;
    private String descricao;
    //preço em dólar
    private float preco;
    public Lanche(String nome, String descricao, 
            float preco){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
    public String getNome() {return this.nome;}
    public String getDescricao() {return this.descricao;}
    public float getPreco(){return this.preco;}
    public void setNome(String nome){this.nome = nome;}
    public void setDescricao(String descricao){ 
        this.descricao = descricao;
    }
    public boolean setPreco(float preco){
        if (preco >= 0) {
            this.preco = preco;
            return true;
        }
        return false;
    }
}
