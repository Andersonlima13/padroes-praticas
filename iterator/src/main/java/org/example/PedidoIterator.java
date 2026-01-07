package org.example;

public class PedidoIterator implements Iterator<Pedido> {

    private PedidoRepositorio repositorio;
    private int posicao = 0;

    public PedidoIterator(PedidoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public boolean hasNext() {
        while (posicao < repositorio.getPedidos().size()) {
            if (repositorio.getPedidos().get(posicao).isPago()) {
                return true;
            }
            posicao++; // pula pedidos não pagos
        }
        return false;
    }

    @Override
    public Pedido next() {
        return repositorio.getPedidos().get(posicao++);
    }
}
