import java.util.HashMap;
import java.util.Map;

public class DocumentoServiceProxy implements DocumentoService {

    private DocumentoServiceReal serviceReal;
    private Map<String, byte[]> cache = new HashMap<>();

    private boolean usuarioTemPermissao() {
        return true; // simulação
    }

    @Override
    public byte[] baixarDocumento(String id) {

        if (!usuarioTemPermissao()) {
            throw new SecurityException("Acesso negado");
        }

        if (cache.containsKey(id)) {
            System.out.println("Retornando documento do cache");
            return cache.get(id);
        }

        if (serviceReal == null) {
            serviceReal = new DocumentoServiceReal(); // lazy
        }

        byte[] documento = serviceReal.baixarDocumento(id);
        cache.put(id, documento);

        return documento;
    }
}
