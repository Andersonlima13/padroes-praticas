package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PedidoRepositorio repo = new PedidoRepositorio();
        repo.adicionar(new Pedido("Notebook", true));
        repo.adicionar(new Pedido("Celular", false));
        repo.adicionar(new Pedido("Monitor", true));

        Iterator<Pedido> iterator = repo.criarIterator();

        while (iterator.hasNext()) {
            Pedido p = iterator.next();
            System.out.println("Pedido pago: " + p.getNome());
        }
    }
}
