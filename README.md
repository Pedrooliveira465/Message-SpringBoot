<h1 align="center">
  Messaging Spring Boot
</h1>

System to introduce the messaging concept presented using Spring Boot and Kafka.

## Technologies
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring for Kafka](https://docs.spring.io/spring-kafka/reference/html/)
- [Kafka](https://kafka.apache.org)
- [Docker Compose](https://docs.docker.com/compose/)

## How to Run

- Running Kafka with Docker Compose:
```
$ docker-compose up
```

- Add the hostname `kafka` to /etc/hosts.
- Clone git repository
- Build the project:
```
$ ./mvnw clean package
```
- Run the application:
```
$ java -jar target/messaging-springboot-0.0.1-SNAPSHOT.jar
```

- Send a hello
```
localhost:8080/kafka/hello/pedro

HTTP/1.1 200
Connection: keep-alive
Content-Length: 2
Content-Type: text/plain;charset=UTF-8
Date: Wed, 05 Jul 2023 16:21:05 GMT
Keep-Alive: timeout=60

OK
```

- View received message in log:
```
Consumer Message: Olá, pedro
```
