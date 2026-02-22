package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        List<carro> carros = new ArrayList<carro>();
        pessoa marcos = new pessoa("Marcos");
        System.out.printf("quantos carros %s tem?", marcos.nome);
        int resposta = scanner.nextInt();
        while (resposta > 0 ){
            System.out.println("qual o modelo do carro?: ");
            String modelo = scanner.next();
            System.out.println("qual a cor do carro?: ");
            String cor = scanner.next();
            carros.add(new carro(modelo, cor));
            resposta--;
            if (resposta == 0){
                System.out.println("carros cadastrados");
            }
        }
        System.out.println("qual carro deseja dirigir?: ");
        String resposta2 = scanner.nextLine();
        if (Objects.equals(carros.get(0).modelo == resposta2)){
            System.out.printf("voce esta dirigindo o carro: %s", carros.get(0).modelo);
        }
    }
}