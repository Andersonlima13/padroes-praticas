package org.example.concreteElements;

import org.example.Documento;
import org.example.DocumentoVisitor;

public class Relatorio implements Documento {

    @Override
    public void aceitar(DocumentoVisitor visitor) {
        visitor.visitar(this);
    }

}
