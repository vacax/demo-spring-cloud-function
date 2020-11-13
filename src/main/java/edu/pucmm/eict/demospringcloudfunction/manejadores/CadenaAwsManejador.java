package edu.pucmm.eict.demospringcloudfunction.manejadores;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

/**
 * Para trabajar con el manejador las peticiones donde encapsulemos vía String.
 * Utilizando la variable de ambiente FUNCTION_NAME indicamos el valor de la funcion y el MAIN_CLASS.
 */
public class CadenaAwsManejador extends SpringBootRequestHandler<String, String> {
}
