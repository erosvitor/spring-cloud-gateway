## About
The project shows how to implement a reverse proxy using the Spring Cloud Gateway.

## Technologies
The following technologies were used in this project:

* [Java Oracle](https://www.oracle.com/java/)
* [Apache Maven](https://maven.apache.org/)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Cloud Gateway](https://spring.io/projects/spring-cloud-gateway)
* [IDE Eclipse](https://www.eclipse.org/)

## Starting the project

### Clonning the project
```
$ git clone https://github.com/erosvitor/spring-cloud-gateway.git

$ cd spring-cloud-gateway
```

### Testing the project
**Step 1:** Start the microservices using Eclipse IDE or by Maven command line
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

## License
This project is under license from MIT. For more details, see the LICENSE file.
