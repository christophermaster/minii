FROM openjdk:15-jdk-alpine
EXPOSE 3000
WORKDIR /microservicios
#VOLUME ../conf /conf
ARG JAR_FILE=target/minishift-0.jar
ADD ${JAR_FILE} minishift.jar
ENTRYPOINT ["java","-jar","/microservicios/minishift.jar"]
