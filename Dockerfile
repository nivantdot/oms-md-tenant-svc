FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD  build/libs/oms-md-tenant-svc-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/app.jar"]
