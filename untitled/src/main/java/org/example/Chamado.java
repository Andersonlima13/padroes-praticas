package org.example;

public class Chamado {
    private EstadoChamado estado;
    private String problema;
    private String categoria;

    public Chamado(String problema, String categoria) {
        this.problema = problema;
        this.categoria = categoria;
        this.estado = new EstadoAberto(); // estado inicial
    }

    public void setEstado(EstadoChamado novoEstado) {
        this.estado = novoEstado;
    }

    public void moverParaAtendimento() {
        estado.moverParaAtendimento(this);
    }

    public void concluirChamado() {
        estado.concluirChamado(this);
    }
}
