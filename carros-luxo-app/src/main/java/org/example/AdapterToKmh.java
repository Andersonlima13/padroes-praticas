package org.example;

public class AdapterToKmh {
    private VeiculoBrasileiro veiculoBrasileiro;

    public AdapterToKmh(VeiculoBrasileiro veiculoBrasileiro) {
        this.veiculoBrasileiro = veiculoBrasileiro;
    }

    public double getVelocidadeMaximaToMph() {
        double velocidadeKmh = veiculoBrasileiro.getVelocidadeMaximaKmh();

        if (veiculoBrasileiro.isTurbo()) {
            velocidadeKmh *= 1.3; // 30% de aumento (CORRETO)
        }
        return velocidadeKmh * 0.621371;
    }

    public double getVelocidadeMaximaKmh() {
        double velocidade = veiculoBrasileiro.getVelocidadeMaximaKmh();

        if (veiculoBrasileiro.isTurbo()) {
            velocidade *= 1.3; // 30% de aumento (CORRETO)
        }

        return velocidade;
    }
}