# Utiliza una imagen base de Java
FROM openjdk:11-jre-slim

# Establece el directorio de trabajo en la imagen
WORKDIR /app

# Copia el archivo JAR generado por Maven a la imagen
COPY target/demo2-0.0.1-SNAPSHOT.war /app/demo2.war

# Expone el puerto en el que se ejecutará la aplicación
EXPOSE 8089

# Comando para ejecutar la aplicación Spring Boot
CMD ["java", "-jar", "demo2.war"]
