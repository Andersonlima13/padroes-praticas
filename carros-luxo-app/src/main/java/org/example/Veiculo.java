package org.example;

public class Veiculo implements VeiculoInterface {
    private double velocidadeMaxima;

    public Veiculo(double velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public double getSpeed() {
        return this.velocidadeMaxima;
    }
}



