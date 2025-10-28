package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VeiculoBrasileiro carroTurbo = new VeiculoBrasileiro(200, true);
        VeiculoBrasileiro carroNormal = new VeiculoBrasileiro(200, false);
        Veiculo astonMartin = new AstonMartin();
        System.out.println(astonMartin.getSpeed());
        System.out.println(carroTurbo.getSpeed());
        System.out.println(carroNormal.getSpeed());


    }
}