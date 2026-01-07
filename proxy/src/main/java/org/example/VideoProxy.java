package org.example;

// proxy

public class VideoProxy implements Video {

    private VideoReal videoReal;
    private String nome;

    public VideoProxy(String nome) {
        this.nome = nome;
    }

    @Override
    public void play() {
        if (videoReal == null) {
            videoReal = new VideoReal(nome); // lazy loading
        }
        videoReal.play();
    }
}
