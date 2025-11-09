package org.example;

public class SemaforoAmarelo implements Semaforo {

    private final int tempo = 5;

    @Override
    public void executarEstado(EstadoSemaforo contexto) {
        System.out.println("🟡 Luz AMARELA acesa por " + tempo + " segundos.");

        esperar(tempo);

        contexto.proximoEstado(new SemaforoVermelho());
    }

    private void esperar(int s) {
        try { Thread.sleep(s * 1000); } catch (InterruptedException e) { }
    }
}
