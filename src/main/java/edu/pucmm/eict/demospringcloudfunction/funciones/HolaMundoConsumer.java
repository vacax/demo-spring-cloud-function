package edu.pucmm.eict.demospringcloudfunction.funciones;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.function.Consumer;
import java.util.logging.Logger;

/**
 * Las funciones consumer unicamente reciben información pero no responden. Ideal para recibir eventos.
 * curl -H "Content-Type: application/json" localhost:8080/holaMundoConsumer -d '{"id": 1, "latitud" : "19.123", "longitud": "69.123"}'
 * Lo vamos a utilizar para trabajar en eventos que no requieren respuesta, como Cronbjob
 */
@Component
public class HolaMundoConsumer implements Consumer<HolaMundoConsumer.NotificacionPosicion> {

    Logger logger = Logger.getLogger(this.getClass().getName());

    @Override
    public void accept(NotificacionPosicion notificacionEvento) {
        logger.info("Evento recibido: "+notificacionEvento.toString());
        //simulando que estamos almacenando en la base de datos.
    }

    /**
     * Clase para encapsular una funcionalidad.
     */
    @Data
    static class NotificacionPosicion {
        long id;
        String latitud;
        String longitud;
    }
}
