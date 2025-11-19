package org.example;

public class BlocoDesocupado implements EstadoBloco {

    @Override
    public void entrar(Bloco bloco) {
        System.out.println("Primeiro docente entrou. Ligando ar e luzes...");
        bloco.ligarEquipamentos();

        bloco.incrementarDocentes();
        bloco.setEstado(new BlocoOcupado());
    }

    @Override
    public void sair(Bloco bloco) {
        System.out.println("Não há docentes para sair.");
    }
}
