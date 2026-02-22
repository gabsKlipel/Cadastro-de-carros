package org.example;

public class pessoa {
    String nome;
    int quantCarros;

    public pessoa(String nome){
        this.nome = nome;
    }
    public void abastecer(carro carro){
        carro.combustivel += 60;
    }
}
