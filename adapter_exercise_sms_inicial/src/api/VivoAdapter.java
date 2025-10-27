package api;

import java.time.LocalDateTime;
import model.SMS;

public class VivoAdapter implements SMSSender {

    private VivoService vivoService;

    public VivoAdapter(VivoService vivoService) {
        this.vivoService = vivoService;
    }

    @Override
    public boolean sendSMS(SMS sms) {
        try {
            String[] msgs = { sms.getTexto() };
            vivoService.enviarSMS(sms.getOrigem(), sms.getDestino(), sms.getTimestamp(), msgs);
            return true;
        } catch (SMSException e) {
            System.err.println("Falha ao enviar SMS via Vivo: " + e.getMessage());
            return false;
        }
    }
}
