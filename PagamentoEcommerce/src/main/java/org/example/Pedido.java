package org.example;

public class Pedido {
    private double valorTotal;
    private int quantiaPedidos;



    public void Pedido(double valorTotal,int quantiaPedidos){
        this.valorTotal = valorTotal;
        this.quantiaPedidos = quantiaPedidos;
    }

    public double getValorTotal(){
        return this.valorTotal;
    }


}
