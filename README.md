# SpringCloudGateway

## Description
The **SpringCloudGateway** is a project that show how to implement a reverse proxy using the Spring Cloud Gateway.

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

## Release History
* 1.0.0 (2021-05-15)
    * First version
