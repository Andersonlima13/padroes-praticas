public abstract class  RelatorioFactory {
    void processarRelatorio(){
        Relatorio relatorio =  criarRelatorio();
        relatorio.gerar();
    }


    protected abstract Relatorio criarRelatorio();
}
