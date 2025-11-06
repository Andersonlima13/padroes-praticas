package org.example;

public class EstadoAberto implements EstadoChamado {

    @Override
    public void moverParaAtendimento(Chamado chamado) {
        // Aqui decide qual setor atenderá
        System.out.println("Chamado encaminhado para o suporte correto...");
        chamado.setEstado(new EstadoEmAtendimento());
    }

    @Override
    public void concluirChamado(Chamado chamado) {
        System.out.println("Não é possível concluir um chamado que nem entrou em atendimento.");
    }
}
