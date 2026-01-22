public class FinancerioRelatorioFactory extends RelatorioFactory{
    @Override
    protected Relatorio criarRelatorio() {
        return new FinanceiroRelatorio();
    }
}
