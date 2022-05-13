/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author senai
 */
public class RedeRestaurantes {
    private String nome;
    private ArrayList<Restaurante> restaurantes;
    private ArrayList<CardapioPais> cardapios;
    public RedeRestaurantes(String nome){
        this.nome = nome;
        this.restaurantes = new ArrayList<>();
        this.cardapios = new ArrayList<>();
    }
    public void AdicionarRestaurante(Restaurante r){
        this.restaurantes.add(r);
    }
    public void RemoverRestaurante(Restaurante r){
        this.restaurantes.remove(r);
    }
    public void AdicionarCardapio(CardapioPais c){
        this.cardapios.add(c);
    }
    public void RemoverCardapio(CardapioPais c){
        this.cardapios.remove(c);
    }
    public String getNome(){return nome;}
    public ArrayList<Restaurante> getRestaurantes(){
        return restaurantes;
    }
    public ArrayList<CardapioPais> getCardapiosPais(){
        return cardapios;
    }
}
