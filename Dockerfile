FROM eclipse-temurin:17-jre
VOLUME /tmp
EXPOSE 12702
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]