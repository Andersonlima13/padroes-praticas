package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // dando inicio ao subscriber

        Canal canal = new Canal();

        // dando inicio aos subscribers

        Observer anderson = new InscritoBasico("anderson@gmail");

        // registrando a intecao de receber atualizacoes da publisher

        canal.adcionarInscrito(anderson);


        // executando metodos da publisher
        canal.publicarVideo("aprendendo observer");


    }
}