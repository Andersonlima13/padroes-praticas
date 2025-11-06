package org.example;

public class EstadoEmAtendimento implements EstadoChamado {

    @Override
    public void moverParaAtendimento(Chamado chamado) {
        System.out.println("Chamado já está em atendimento.");
    }

    @Override
    public void concluirChamado(Chamado chamado) {
        System.out.println("Chamado concluído com sucesso!");
        chamado.setEstado(new EstadoFechado());
    }
}
