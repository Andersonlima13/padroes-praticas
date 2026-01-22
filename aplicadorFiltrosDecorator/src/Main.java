// problema central -> possuimos um anuncio, e desejamos criar dinamicamente diversos filtros
// para o anuncio criado, possibilitando ao usuario filtrar a maneira o qual o anuncio em
// açao deve-se exibir , podendo acumular diversos filtros
public class Main {
    public static void main(String[] args) {
        FiltroAnuncio anuncio =
                new FiltroPorPreco(
                        new FiltroPorImovel(
                                new Anuncio("Apartamento Centro", 350000)
                        )
                );

        anuncio.aplicarFiltro();
    }
}