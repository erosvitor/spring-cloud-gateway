# SpringCloudGateway

## Description
Project that show how to implement a reverse proxy using the Spring Cloud Gateway.

## Technologies
The project use the following technologies:

* Java 11
* Apache Maven
* Project aggregation
* Spring Boot
* Spring Cloud Gateway
* IDE Eclipse

## Testing the project
**Step 1:** Start the microservices
* GatewayServer
* ServiceOne
* ServiceTwo

**Step 2:** Access the microservices using the reverse proxy port:

```
http://localhost:8890/serviceone
http://localhost:8891/servicetwo

  by
  
http://localhost:8800/serviceone
http://localhost:8800/servicetwo
```

**Tip:** The routes of proxy can be configured in two ways: application.properties or Java class. In this project the routes was configured in Java class named **GatewayRoutesConfig.java**.

## References
[Spring Boot](https://spring.io/projects/spring-boot)  
[Spring Cloud](https://spring.io/projects/spring-cloud)  
[Spring Cloud Gateway](https://spring.io/projects/spring-cloud-gateway)

## Release History
* 1.0.1 (2021-08-03)
    * Spring Boot updated to 2.5.3
    * Spring Cloud updated to 2020.0.3
    * Section 'references' added
* 1.0.0 (2021-05-15)
    * First version
