public class DocumentoServiceReal implements DocumentoService {
    @Override
    public byte[] baixarDocumento(String id) {
        System.out.println("baixando blabla");
        return new byte[]{1,1,3};
    }
}
