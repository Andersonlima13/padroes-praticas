package org.example;

// concrete visitor, diretamente daqui, executamos de uma vez , todos os metodos de
// "visitar" em nossos concrete Elements, nesse caso , calculo de imposto

import org.example.concreteElements.Contrato;
import org.example.concreteElements.NotaFiscal;
import org.example.concreteElements.Relatorio;

public class CalcularImposto implements DocumentoVisitor {


    @Override
    public void visitar(Contrato contrato) {
        // logica de imposto para contrato
    }

    @Override
    public void visitar(NotaFiscal notaFiscal) {
        // logica de imposto para notafiscal

    }

    @Override
    public void visitar(Relatorio relatorio) {
        // logica de imposto para relatorio
    }
}
