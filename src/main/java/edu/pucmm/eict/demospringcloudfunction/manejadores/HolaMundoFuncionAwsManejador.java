package edu.pucmm.eict.demospringcloudfunction.manejadores;

import edu.pucmm.eict.demospringcloudfunction.funciones.HolaMundoFuncion;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

/**
 * Para trabajar con el manejador las peticiones donde encapsulemos vía HolaMundoRequest y HolaMundoResponse.
 * Utilizando la variable de ambiente FUNCTION_NAME indicamos el valor de la funcion y el MAIN_CLASS.
 *
 * Formato de entarda de https://docs.aws.amazon.com/es_es/apigateway/latest/developerguide/set-up-lambda-proxy-integrations.html#api-gateway-simple-proxy-for-lambda-input-format
 */
public class HolaMundoFuncionAwsManejador extends SpringBootRequestHandler<HolaMundoFuncion.HolaMundoRequest, HolaMundoFuncion.HolaMundoResponse> {

}
