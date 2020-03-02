FROM maven:3.5-jdk-8
COPY target/hanhsk-service-app-1.0-SNAPSHOT.jar /hanhsk-service.jar
EXPOSE 11080
ENTRYPOINT ["/bin/bash","-C","java -jar /hanhsk-service.jar --server.port=11080"]
