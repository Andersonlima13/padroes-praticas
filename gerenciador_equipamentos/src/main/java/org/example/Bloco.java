package org.example;

public class Bloco {

    private EstadoBloco estadoAtual;
    private int docentes = 0;

    public Bloco() {
        this.estadoAtual = new BlocoDesocupado(); // estado inicial
    }

    public void setEstado(EstadoBloco estado) {
        this.estadoAtual = estado;
    }

    public void entrarDocente() {
        estadoAtual.entrar(this);
    }

    public void sairDocente() {
        estadoAtual.sair(this);
    }

    public void ligarEquipamentos() {
        System.out.println("Ar-condicionado = ON, Luzes = ON");
    }

    public void desligarEquipamentos() {
        System.out.println("Ar-condicionado = OFF, Luzes = OFF");
    }

    public void incrementarDocentes() {
        docentes++;
    }

    public void decrementarDocentes() {
        docentes--;
    }

    public int getNumDocentes() {
        return docentes;
    }
}
