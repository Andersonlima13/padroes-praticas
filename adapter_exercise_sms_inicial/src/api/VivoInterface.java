package api;

import java.time.LocalDateTime;

public interface VivoInterface {

    void enviarSMS(String origem, String destino, LocalDateTime time, String[] msgs) throws SMSException;
}
