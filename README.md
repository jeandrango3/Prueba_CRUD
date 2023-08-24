# Prueba_CRUD
Este repositorio contiene el código fuente y los pasos necesarios para configurar un proyecto de Spring Boot que gestiona tareas utilizando una base de datos en memoria (H2) y siguiendo el patrón MVC (Modelo-Vista-Controlador).

## Paso 1: Configuración Inicial

1. Crea un nuevo proyecto Spring Boot utilizando Spring Initializr.
2. Agrega las dependencias necesarias para crear una aplicación web y acceder a una base de datos en memoria (H2).

## Paso 2: Modelo de Datos:
1. Crea una entidad Task con atributos como id, nombre, descripcion, fecha,
estado, etc. Utiliza anotaciones de JPA para mapear la entidad a la base de datos.
Configura la conexión a la base de datos en el archivo

## Paso 3: Repositorio:
1. Crea un repositorio TaskRepository que extienda JpaRepository para acceder
a la base de datos y realizar operaciones CRUD sobre las tareas.
## Paso 4: Controlador:
1. Crea un controlador TaskController con rutas para cada operación CRUD
(/api/tasks). Utiliza anotaciones como @RestController, @GetMapping,
@PostMapping, @PutMapping, @DeleteMapping.

## Paso 5: Servicio:
1. Crea un servicio TaskService que utilice TaskRepository para implementar los
métodos de CRUD (createTask, getTask, updateTask, deleteTask, etc.).
## Paso 6: Pruebas:
1. Utiliza herramientas como Postman para realizar pruebas sobre la API que has
creado. Envía solicitudes POST, GET, PUT y DELETE para crear, leer, actualizar y
eliminar tareas.

`src/main/resources/application.properties`.

```properties
server.port = 8090
spring.datasource.url = jdbc:postgresql://localhost:5432/H2
spring.datasource.username = postgres
spring.datasource.password = Tefa1478
spring.jpa.hibernate.ddl-auto = create-drop
spring.jpa.show-sql = true
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.format_sql = true

