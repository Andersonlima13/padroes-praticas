package org.example;

public class VeiculoBrasileiro implements VeiculoInterface{
    private double velocidadeMaxima;
    private boolean isTurbo;
    private AdapterToKmh adapter;

    public VeiculoBrasileiro(double velocidadeMaxima, Boolean isTurbo){
        this.isTurbo = isTurbo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.adapter = new AdapterToKmh(this);
    }



    public double getVelocidadeMaximaKmh() {
        return this.velocidadeMaxima;
    }

    public boolean isTurbo() {
        return this.isTurbo;
    }


    public double getSpeed() {
        return adapter.getVelocidadeMaximaToMph();
    }


}
