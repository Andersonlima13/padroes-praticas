package org.example;

public class EstadoSemaforo {

    private Semaforo estadoAtual;

    public void setEstado(Semaforo novoEstado) {
        this.estadoAtual = novoEstado;
    }

    public void iniciar() {
        estadoAtual.executarEstado(this);
    }

    public void proximoEstado(Semaforo novoEstado) {
        setEstado(novoEstado);
        iniciar();
    }
}
