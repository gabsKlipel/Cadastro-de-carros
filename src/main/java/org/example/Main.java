package org.example;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        List<carro> carros = new ArrayList<carro>();
        pessoa marcos = new pessoa("Marcos");

        System.out.println("---inicio das opções---");
        System.out.println("1- cadastro de carros\n2- escolher carro para dirigir\n3- abastecer");
        int alt = scanner.nextInt();

        switch (alt){
            //cadastro de carros
            case 1:
                System.out.printf("quantos carros %s tem?", marcos.nome);
                marcos.quantCarros = scanner.nextInt();
                while (marcos.quantCarros > 0 ){
                    System.out.println("qual o modelo do carro?: ");
                    String modelo = scanner.next();
                    System.out.println("qual a cor do carro?: ");
                    String cor = scanner.next();
                    carros.add(new carro(modelo, cor));
                    marcos.quantCarros--;
                    if (marcos.quantCarros == 0){
                        System.out.println("carros cadastrados");
                    }
                }
            // escolher carro para dirigir
            case 2:
                System.out.println("qual carro deseja dirigir?");
                String escolha = scanner.nextLine();
                for(int i = 0; i < carros.size(); i++){
                    if(Objects.equals(carros.get(i).modelo, escolha)){
                        System.out.println("voce esta dirigindo o carro" + carros.get(i).modelo);
                    }
                }
        }

    }
}