package br.dio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //
        double valorAbastecimento;
        Scanner scan = new Scanner(System.in);

        Carro carro1 = new Carro();

        System.out.println("Cor do carro:");
        carro1.setModelo(scan.next());
        System.out.println("Modelo do carro:");
        carro1.setCor(scan.next());
        System.out.println("Capacidade do Tanque:");
        carro1.setCapacidadeTanque(scan.nextInt());
        System.out.println("Preço do combustive:");
        valorAbastecimento=(scan.nextInt());

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println("Total para completar o tanque: " + carro1.totalValorTanque(valorAbastecimento));

/*
        Carro carro2 = new Carro("vermelho","corsa",45);
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(10));
*/

    }
}
