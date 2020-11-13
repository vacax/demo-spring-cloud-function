package edu.pucmm.eict.demospringcloudfunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class DemoSpringCloudFunctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringCloudFunctionApplication.class, args);
    }

    /**
     * Por el metodo post puedo acceder mediante el siguiente comando.
     * curl localhost:8080/mensajeDirecto -H "Content-Type: text/plain" -d "ISC-517"
     * @return
     */
    @Bean
    public Function<String, String> mensajeDirecto() {
        return value -> "Mensaje Eco: "+value;
    }



}
