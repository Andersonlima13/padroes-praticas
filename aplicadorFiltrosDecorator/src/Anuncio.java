public class Anuncio implements FiltroAnuncio {
    private String nome;
    private double valor;


    public Anuncio(String nome,double Valor){
        this.nome = nome;
        this.valor = valor;
    }


    @Override
    public void aplicarFiltro() {
        System.out.println("Anúncio base: " + nome + " - R$ " + valor);

    }
}
