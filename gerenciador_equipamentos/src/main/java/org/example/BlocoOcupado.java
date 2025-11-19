package org.example;

public class BlocoOcupado implements EstadoBloco {

    @Override
    public void entrar(Bloco bloco) {
        bloco.incrementarDocentes();
        System.out.println("Outro docente entrou. Equipamentos continuam ligados.");
    }

    @Override
    public void sair(Bloco bloco) {
        bloco.decrementarDocentes();

        if (bloco.getNumDocentes() == 0) {
            System.out.println("Último docente saiu. Desligando equipamentos...");
            bloco.desligarEquipamentos();
            bloco.setEstado(new BlocoDesocupado());
        } else {
            System.out.println("Um docente saiu. Ainda há pessoas no bloco.");
        }
    }
}
