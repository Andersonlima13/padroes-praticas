package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EstadoSemaforo semaforo = new EstadoSemaforo();

        semaforo.setEstado(new SemaforoAmarelo()); // estado inicial
        semaforo.iniciar();
    }
}