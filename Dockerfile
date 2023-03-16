
FROM amazoncorretto:17-alpine-jdk

MAINTAINER javiert

COPY ProyectoFinal-Backend/target/portfolio-0.0.1-SNAPSHOT.jar portfolio-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/ProyectoFinal-Backend/portfolio-0.0.1-SNAPSHOT.jar"]
