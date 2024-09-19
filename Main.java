/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author jeann
 */
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
        Moto moto = new Moto("Honda", "CB 500", 2021, true);

        System.out.println("Informações do carro:");
        carro.exibirInformacao();
        carro.abrirPortaMalas();

        System.out.println("\nInformações da moto:");
        moto.exibirInformacao();
        moto.empinar();
    }
}

