package org.example;

// de fato o visitor, esse deve passear por varias classes, as quais serão nossos elementos
// concretos, que herdam a ideia da interface "documento"

import org.example.concreteElements.Contrato;
import org.example.concreteElements.NotaFiscal;
import org.example.concreteElements.Relatorio;

public interface DocumentoVisitor {
    public void visitar(Contrato contrato);
    public void visitar(NotaFiscal notaFiscal);
    public void visitar(Relatorio relatorio);
}
