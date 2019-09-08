FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/TransactionDataService-0.0.1-SNAPSHOT.jar TransactionDataService.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/TransactionDataService.jar"]