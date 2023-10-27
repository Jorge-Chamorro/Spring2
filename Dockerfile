FROM amazoncorretto:17-alpine-jdk
MAINTAINER Geo
COPY "./target/prueba-con-jar-0.0.1-SNAPSHOT.jar" "app.jar"
ENTRYPOINT ["java","-jar","app.jar"]