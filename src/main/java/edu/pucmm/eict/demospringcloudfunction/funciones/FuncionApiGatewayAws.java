package edu.pucmm.eict.demospringcloudfunction.funciones;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * Interfaz para trabajar con el caso de Api gateway Proxy de Amazon. La implementación del manejador debe ser:
 * org.springframework.cloud.function.adapter.aws.SpringBootApiGatewayRequestHandler
 */
@Component
public class FuncionApiGatewayAws implements Function<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {


    /**
     * Recibie la petición desde el API y retornando según el formato esperado.
     * @param request
     * @return
     */
    @Override
    public APIGatewayProxyResponseEvent apply(APIGatewayProxyRequestEvent request) {
        APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent();
        //
        Map<String, String> headers =  new HashMap<>();
        headers.put("Content-Type", "application/json");
        response.setHeaders(headers);
        //
        response.setStatusCode(200);
        //
        response.setBody("Hola Mundo AWS - Spring Cloud Function - Recibido: "+request.getBody());

        return response;
    }
}
