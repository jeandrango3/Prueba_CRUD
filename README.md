# Prueba_CRUD
Este repositorio contiene el código fuente y los pasos necesarios para configurar un proyecto de Spring Boot que gestiona tareas utilizando una base de datos en memoria (H2) y siguiendo el patrón MVC (Modelo-Vista-Controlador).

## Paso 1: Configuración Inicial

1. Crea un nuevo proyecto Spring Boot utilizando Spring Initializr.
2. Agrega las dependencias necesarias para crear una aplicación web y acceder a una base de datos en memoria (H2).

### Configuración de la base de datos

Configura la conexión a la base de datos en el archivo `src/main/resources/application.properties`.

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.h2.console.enabled=true
