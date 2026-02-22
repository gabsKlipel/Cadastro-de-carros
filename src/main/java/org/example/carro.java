package org.example;
import java.util.Objects;
import java.util.Scanner;

public class carro {
    String modelo;
    String cor;
    public carro(String modelo, String cor){
        this.modelo = modelo;
        this.cor = cor;
    }
    Scanner scanner = new Scanner(System.in);
    int combustivel = 50;
    int velocidade = 0;
    public void ligar(boolean ligar){
        System.out.println(ligar ? "vrum vrum" : "carro desligado");
    }

    public void acelerar(){
        velocidade+=10;
        System.out.println("acelerando carro \nvelocidade: " + velocidade);
    }

}
