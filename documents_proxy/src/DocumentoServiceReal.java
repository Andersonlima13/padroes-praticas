public class DocumentoServiceReal implements DocumentoService {

// resumidamente servico real vai conter os metodos/serivco a ser executado
    @Override
    public byte[] baixarDocumento(String id) {
        System.out.println("baixando blabla");
        return new byte[]{1,1,3};
    }
}
