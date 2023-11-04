FROM eclipse-temurin:17-jre
VOLUME /tmp
EXPOSE 82
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]