package org.example;

import org.example.concreteElements.Contrato;
import org.example.concreteElements.NotaFiscal;
import org.example.concreteElements.Relatorio;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


            // 1️⃣ Criamos os elementos (documentos)
            List<Documento> documentos = List.of(
                    new Contrato(),
                    new NotaFiscal(),
                    new Relatorio()
            );

            // 2️⃣ Criamos o visitor
            DocumentoVisitor calcularImposto = new CalcularImposto();

            // 3️⃣ Aplicamos o visitor a todos os elementos
            for (Documento documento : documentos) {
                documento.aceitar(calcularImposto);

        }
    }
}