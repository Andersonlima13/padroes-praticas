package org.example;
// objeto real // service



public class VideoReal implements Video {

    private String nome;

    public VideoReal(String nome) {
        this.nome = nome;
        carregarVideoDoServidor();
    }

    private void carregarVideoDoServidor() {
        System.out.println("📡 Carregando vídeo pesado do servidor: " + nome);
    }

    @Override
    public void play() {
        System.out.println("▶️ Reproduzindo vídeo: " + nome);
    }
}
