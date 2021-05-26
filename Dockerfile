FROM openjdk:12-jdk-alpine
ADD build/libs/quotes-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
CMD java -jar quotes-0.0.1-SNAPSHOT.jar