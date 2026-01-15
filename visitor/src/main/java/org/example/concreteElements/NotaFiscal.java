package org.example.concreteElements;

import org.example.Documento;
import org.example.DocumentoVisitor;

public class NotaFiscal implements Documento {

    @Override
    public void aceitar(DocumentoVisitor visitor) {
        visitor.visitar(this);
    }
}
