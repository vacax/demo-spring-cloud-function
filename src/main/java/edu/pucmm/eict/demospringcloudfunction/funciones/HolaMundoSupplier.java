package edu.pucmm.eict.demospringcloudfunction.funciones;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.function.Supplier;
import java.util.logging.Logger;

/**
 * La función Supplier unicamente devuelve información por el metodo get.
 * http://localhost:8080/holaMundoSupplier
 * Si lo integramos con el Api Gateway HTTP con la función GET, podemos obtener información.
 */
@Component
public class HolaMundoSupplier implements Supplier<HolaMundoSupplier.EstatusServidor> {

    Logger logger = Logger.getLogger(this.getClass().getName());

    @Override
    public EstatusServidor get() {
        logger.info("Solicitando información del servidor...");
        return new EstatusServidor("Spring Cloud Function", LocalDate.now(), "Ok");
    }

    /**
     * Representa una clase para encapsular la salida.
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class EstatusServidor{
        String nombre;
        LocalDate fecha;
        String status;
    }
}
