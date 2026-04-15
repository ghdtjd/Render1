
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /RENDER

COPY build/libs/RENDER.jar RENDER.jar

CMD ["java", "-Xmx256m", "-jar", "RENDER.jar"]