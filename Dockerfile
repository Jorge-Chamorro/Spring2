FROM amazoncorretto:17-alpine
MAINTAINER Geo
COPY out/artifacts/prueba_con_jar_jar/prueba-con-jar.jar prueba-con-jar.jar
ENTRYPOINT ["java","-jar","/prueba-con-jar.jar"]