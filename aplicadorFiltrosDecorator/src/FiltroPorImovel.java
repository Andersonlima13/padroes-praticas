public class FiltroPorImovel extends FiltroBase{

    public FiltroPorImovel(FiltroAnuncio filtroAnuncio) {
        super(filtroAnuncio);
    }

    @Override
    public void aplicarFiltro() {
        super.aplicarFiltro();
        System.out.println("→ Filtro por imóvel aplicado");
    }
}
