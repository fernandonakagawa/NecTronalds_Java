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
public class Restaurante {
    private String nome;
    private CardapioPais cardapio;
    private String endereco;
    public Restaurante(String nome, 
            CardapioPais cardapio,
            String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.cardapio = cardapio;
    }
    public String getNome(){return nome;}
    public String getEndereco(){return endereco;}
    public CardapioPais getCardapio(){return cardapio;}
    public void setNome(String nome){this.nome = nome;}
    public void setEndereco(String endereco){this.endereco = endereco;}
}
