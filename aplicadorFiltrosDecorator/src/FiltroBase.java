public abstract class FiltroBase implements FiltroAnuncio {
    protected FiltroAnuncio filtroAnuncio;

    public FiltroBase(FiltroAnuncio filtroAnuncio){
        this.filtroAnuncio = filtroAnuncio;
    }

    @Override
    public void aplicarFiltro() {
        filtroAnuncio.aplicarFiltro();
    }
}
