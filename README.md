# Proyecto Demostración Spring Cloud Function

Utiliza el framework de Spring Cloud para el manejo de funciones serverless.
Para nuestro caso estamos trabajando adaptado con AWS Lambda. Las funcionalidades disponible:

- Interfaz Function: [HolaMundoFuncion](src/main/java/edu/pucmm/eict/demospringcloudfunction/funciones/HolaMundoFuncion.java)
- Interfaz Consumer: [HolaMundoConsumer](src/main/java/edu/pucmm/eict/demospringcloudfunction/funciones/HolaMundoConsumer.java)
- Interfaz Supplier: [HolaMundoSupplier](src/main/java/edu/pucmm/eict/demospringcloudfunction/funciones/HolaMundoSupplier.java)
- Interfaz ApiGateway: [FuncionApiGateway](src/main/java/edu/pucmm/eict/demospringcloudfunction/funciones/FuncionApiGatewayAws.java)

Para compilar el proyecto:

`./gradlew shadowjar`

Para crear el servicio, realizar los siguientes pasos:

