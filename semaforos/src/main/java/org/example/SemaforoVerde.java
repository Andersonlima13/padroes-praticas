package org.example;

public class SemaforoVerde implements Semaforo {

    private final int tempo = 25; // segundos

    @Override
    public void executarEstado(EstadoSemaforo contexto) {
        System.out.println("🟢 Luz VERDE acesa por " + tempo + " segundos.");

        esperar(tempo);

        contexto.proximoEstado(new SemaforoAmarelo());
    }

    private void esperar(int s) {
        try { Thread.sleep(s * 1000); } catch (InterruptedException e) { }
    }
}
