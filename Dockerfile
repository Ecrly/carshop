FROM openjdk:8-jre
MAINTAINER test-name
WORKDIR /
ADD target/carshop-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar"]
CMD ["app.jar"]
