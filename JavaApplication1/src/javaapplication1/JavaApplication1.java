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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lanche l1 = new Lanche("NecFeijoada", 
                "Lanche delicioso de feijoada", 5.5f);
        Lanche l2 = new Lanche("NecBacon",
        "Lanche de bacon", 6.20f);
        Lanche l3 = new Lanche("NecPicanha",
        "Lanche com molho sabor picanha", 8f);
        Lanche l4 = new Lanche("NecChimichurri",
        "Sabor de chimichurri", 7f);
        Lanche l5 = new Lanche("NecCheddar",
        "Lanche com cheddar feito de petróleo", 4f);
        CardapioPais cp1 = new CardapioPais("Brasil");
        cp1.AdicionarLanche(l1);
        cp1.AdicionarLanche(l2);
        //cp1.RemoverLanche(l2);
        CardapioPais cp2 = new CardapioPais("Argentina");
        cp2.AdicionarLanche(l3);
        cp2.AdicionarLanche(l4);
        CardapioPais cp3 = new CardapioPais("EUA");
        cp3.AdicionarLanche(l2);
        cp3.AdicionarLanche(l5);
        Restaurante r1 = new Restaurante(
                "Loja Senai",cp1,
                "Rua Belem 844 Londrina");
        Restaurante r2 = new Restaurante(
               "Loja Buenos Aires", cp2, "Rua Los Hermanos");
        Restaurante r3 = new Restaurante(
            "Loja Nova York", cp3, "Av. 5");
        RedeRestaurantes rr = new RedeRestaurantes("NecTronalds");
        rr.AdicionarRestaurante(r1);
        rr.AdicionarRestaurante(r2);
        rr.AdicionarRestaurante(r3);
        rr.AdicionarCardapio(cp1);
        rr.AdicionarCardapio(cp2);
        rr.AdicionarCardapio(cp3);
        //mostrarLanche(l1);     
        //mostrarCardapio(cp1);
        //mostrarCardapio(cp2);
        //mostrarCardapio(cp3);
        //mostrarCardapioPais(rr, "Brasil");
        mostrarTodosCardapios(rr);
    }
    public static void mostrarLanche(Lanche l){
        System.out.println(l.getNome() + " " 
        + l.getPreco() +  " " + l.getDescricao());
    }
    public static void mostrarCardapio(CardapioPais cp){
        System.out.println(cp.getNomePais());
        for(Lanche l: cp.getLanches()){
            mostrarLanche(l);
        }
    }
    public static void mostrarCardapioPais(
            RedeRestaurantes rr,
            String nome){
        for(CardapioPais cp: rr.getCardapiosPais()){
            if(cp.getNomePais().equals(nome)){
                mostrarCardapio(cp);
            }
        }
    }
    public static void mostrarTodosCardapios(
            RedeRestaurantes rr){
        for (CardapioPais cp: rr.getCardapiosPais()){
            mostrarCardapio(cp);
        }
    }
    
}
