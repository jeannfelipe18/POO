/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author jeann
 */
public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    public void abrirPortaMalas() {
        System.out.println("Porta-malas do carro está aberto.");
    }

    @Override
    public void exibirInformacao() {
        super.exibirInformacao();
        System.out.println("Portas: " + portas);
    }
}
