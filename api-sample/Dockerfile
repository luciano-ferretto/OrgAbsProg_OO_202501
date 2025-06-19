FROM maven:eclipse-temurin AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21.0.6_7-jre-ubi9-minimal
COPY --from=build /app/target/*.jar /myapp.jar
EXPOSE 8080
CMD ["java", "-jar", "/myapp.jar"]