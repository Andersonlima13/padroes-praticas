package org.example;

import java.util.ArrayList;
import java.util.List;

public class PedidoRepositorio implements PedidoCollection {

    private List<Pedido> pedidos = new ArrayList<>();

    public void adicionar(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    @Override
    public Iterator<Pedido> criarIterator() {
        return new PedidoIterator(this);
    }
}
