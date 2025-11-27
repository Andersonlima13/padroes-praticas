package org.example;
//contexto
public class Pedido {
    private double valorPagamento;
    private PagamentoStrategy tipoDePagamento;

    public void Pedido(double valorPagamento){
        this.tipoDePagamento = tipoDePagamento;
    }

    public void setFormaDePagamento(PagamentoStrategy tipoDePagamento){
        this.tipoDePagamento = tipoDePagamento;
    }

    public void processarPagamento() {
        if (formaDePagamento == null) {
            System.out.println("❌ Nenhuma forma de pagamento definida!");
            return;
        }

        boolean sucesso = formaDePagamento.pagar(valorPagamento);

        if (sucesso) {
            System.out.println("🎉 Pedido pago com sucesso!");
        } else {
            System.out.println("❌ Falha ao processar pagamento!");
        }
    }

}
