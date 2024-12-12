# Stage 1: Build application
FROM openjdk:17-jdk-slim AS build

# Cài đặt các công cụ cần thiết và build ứng dụng
RUN apt-get update && apt-get install -y git curl
COPY . /app
WORKDIR /app
RUN ./gradlew bootJar --no-daemon

# Stage 2: Run application
FROM openjdk:17-jdk-slim

# Expose cổng 8080
EXPOSE 8080

# Copy file JAR từ stage build
COPY --from=build /app/build/libs/HotelProject-1.jar app.jar

# Lệnh khởi động ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]
