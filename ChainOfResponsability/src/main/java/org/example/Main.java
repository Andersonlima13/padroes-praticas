package org.example;

import org.example.Chains.SuporteGeral;
import org.example.Chains.SuporteRede;
import org.example.Chains.SuporteSoftware;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        SuporteHandler rede = new SuporteRede();
        SuporteHandler software = new SuporteSoftware();
        SuporteHandler geral = new SuporteGeral();

        // montagem da cadeia (uma única vez)
        rede
                .setProximo(software)
                .setProximo(geral);

        Chamado chamado = new Chamado(
                "Notebook não conecta no Wi-Fi",
                "Rede"
        );

        // inicia a cadeia
        rede.atenderChamado(chamado);
    }
}