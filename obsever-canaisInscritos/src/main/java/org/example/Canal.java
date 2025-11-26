package org.example;

import java.util.ArrayList;
import java.util.List;

public class Canal {
    private List<Observer> inscritos = new ArrayList<>();
    private String nomeDoVideo;

    public void adcionarInscrito(Observer o){
        inscritos.add(o);
    }

    public void removerInscritos(Observer o){
        inscritos.remove(o);
    }
    // esses dois metodos aqui, manifestam ou nao o interesse de adcionar
    // observaveis, que sao as classes concretas dentro da nossa publisher.

    // em seguida, declaramos os metodos que a publisher possui, e é interessante
    // aos nossos subscribers


    // oque a publisher deve fazer
    public void publicarVideo(String nomeDoVideo){
        System.out.println("Video publicado!!");
        notificarInscritos();
    }

    // e aquim notificar a cada observavel chamando o metodo de atualizar para cada

    public void notificarInscritos(){
            for (Observer o : inscritos){
                o.atualizar(nomeDoVideo);
            }
    }

}

