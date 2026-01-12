package org.example;

import org.example.concreteElements.Contrato;

import javax.print.Doc;

// aqui , atua como a interface do elemento central do nosso visitor
public interface Documento  {
    void aceitar(DocumentoVisitor visitor);
}
