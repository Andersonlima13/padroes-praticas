package org.example;

public class EstadoFechado implements EstadoChamado {

    @Override
    public void moverParaAtendimento(Chamado chamado) {
        System.out.println("Chamado já foi encerrado. Não pode voltar.");
    }

    @Override
    public void concluirChamado(Chamado chamado) {
        System.out.println("Chamado já está concluído.");
    }
}
