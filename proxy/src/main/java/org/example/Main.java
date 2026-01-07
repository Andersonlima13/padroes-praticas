package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Video video = new VideoProxy("Aula de Design Patterns");

        System.out.println("📄 Listando vídeos...");
        System.out.println("Nenhum vídeo foi carregado ainda.\n");

        System.out.println("👆 Usuário clicou no vídeo");
        video.play();
    }
}
