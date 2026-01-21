//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DocumentoService service = new DocumentoServiceProxy();
        // chamando o proxy primeiro
        service.baixarDocumento("123");
        service.baixarDocumento("123"); // cache
    }
}