public class FiltroPorPreco extends FiltroBase{
    public FiltroPorPreco(FiltroAnuncio filtroAnuncio) {
        super(filtroAnuncio);
    }

    @Override
    public void aplicarFiltro() {
        super.aplicarFiltro();
        System.out.println("→ Filtro por imóvel aplicado");
    }
}
