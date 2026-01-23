public class AuthProxy implements Data{
    private DataService service;
    private String regra;


    public AuthProxy(DataService service, String regra){
        this.service = service;
        this.regra = regra;
    }

    @Override
    public String consultarDados(String clientId) {
        if (!regra.equals("ADMIN")) {
            System.out.println("acesso negado");}
        return service.consultarDados(clientId);
        }



    // implementando a regra basica para acessar o proxy



}
