package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Chamado chamado = new Chamado("Notebook não liga", "Hardware");

        chamado.moverParaAtendimento(); // muda para EstadoEmAtendimento
        chamado.concluirChamado();      // muda para EstadoFechado
        chamado.moverParaAtendimento(); // não funciona pois está fechado
    }
}