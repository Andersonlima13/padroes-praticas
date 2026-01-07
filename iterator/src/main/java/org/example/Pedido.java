package org.example;

public class Pedido {
    private String nome;
    private boolean pago;

    public Pedido(String nome, boolean pago) {
        this.nome = nome;
        this.pago = pago;
    }

    public boolean isPago() {
        return pago;
    }

    public String getNome() {
        return nome;
    }
}
