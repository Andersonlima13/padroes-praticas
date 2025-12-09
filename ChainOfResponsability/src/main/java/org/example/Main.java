package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Chamado chamado = new Chamado("Notebook não liga", "Hardware");

        Suporte s1 = new SuporteRede();
        Suporte s2 = new SuporteRede();
        Suporte s3 = new SuporteSoftware();
        Suporte s4 = new SuporteGeral();

        // encadeamento da cadeia
        s1.proximoSuporte(s2);
        s2.proximoSuporte(s3);
        s3.proximoSuporte(s4);
        s1.setProximo(s)


        // iniciar a cadeia
        s1.atenderChamado(chamado);

    }
}