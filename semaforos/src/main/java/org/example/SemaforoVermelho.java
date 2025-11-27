    package org.example;

    public class SemaforoVermelho implements Semaforo {

        private final int tempo = 15; // segundos

        @Override
        public void executarEstado(EstadoSemaforo contexto) {
            System.out.println("🔴 Luz VERMELHA acesa por " + tempo + " segundos.");

            esperar(tempo);

            contexto.proximoEstado(new SemaforoVerde() {
            });
        }

        private void esperar(int s) {
            try { Thread.sleep(s * 1000); } catch (InterruptedException e) { }
        }
    }
