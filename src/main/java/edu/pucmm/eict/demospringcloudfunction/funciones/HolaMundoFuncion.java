package edu.pucmm.eict.demospringcloudfunction.funciones;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.logging.Logger;

/**
 * Por el componente el nombre de la función es holaMundoFuncion
 * curl -H "Content-Type: application/json" localhost:8080/holaMundoFuncion -d '{"nombre": "Carlos Camacho"}'
 */
@Component
public class HolaMundoFuncion implements Function<HolaMundoFuncion.HolaMundoRequest, HolaMundoFuncion.HolaMundoResponse> {

    Logger logger = Logger.getLogger(this.getClass().getName());

    /**
     * Encargado de procesar la petición y retornar la respuesta.
     * @param holaMundoRequest
     * @return
     */
    @Override
    public HolaMundoResponse apply(HolaMundoRequest holaMundoRequest) {
        logger.info("Recibiendo la petición: "+holaMundoRequest.getNombre());
        HolaMundoResponse holaMundoResponse = new HolaMundoResponse();
        //
        holaMundoResponse.salida = "Hola Mundo "+holaMundoRequest.getNombre();
        holaMundoResponse.fecha  = LocalDate.now();
        //
        return holaMundoResponse;
    }

    /**
     * Clase donde encapsula petición de la llamada.
     */
    @Data
    public static class HolaMundoRequest{
        String nombre;
    }

    /**
     * Clase para encapsular la respuesta de la llamda.
     */
    @Data
    public static class HolaMundoResponse{
        String salida;
        LocalDate fecha;
    }
}
