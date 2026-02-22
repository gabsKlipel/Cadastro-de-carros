package org.example;

public class pessoa {
    String nome;

    public pessoa(String nome){
        this.nome = nome;
        int quantCarros;
    }
    public void abastecer(carro carro){
        carro.combustivel += 60;
    }
}
