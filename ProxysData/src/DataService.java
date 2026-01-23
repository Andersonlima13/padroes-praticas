public class DataService implements Data{
    @Override
    public String consultarDados(String clientId) {
        System.out.println("consultando dados .... ");
        return "dados do cliente" +clientId;
    }
}
