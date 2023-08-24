# Prueba_CRUD
Este repositorio contiene el código fuente y los pasos necesarios para configurar un proyecto de Spring Boot que gestiona tareas utilizando una base de datos en memoria (H2) y siguiendo el patrón MVC (Modelo-Vista-Controlador).



## Paso 1: Configuración Inicial


1. Crea un nuevo proyecto Spring Boot utilizando Spring Initializr.
2. Agrega las dependencias necesarias para crear una aplicación web y acceder a una base de datos en memoria (H2).
```properties
server.port = 8090
spring.datasource.url = jdbc:postgresql://localhost:5432/H2
spring.datasource.username = postgres
spring.datasource.password = Tefa1478
spring.jpa.hibernate.ddl-auto = create-drop
spring.jpa.show-sql = true
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.format_sql = true

## Paso 2: Modelo de Datos:
1. Crea una entidad Task con atributos como id, nombre, descripcion, fecha,
estado, etc. Utiliza anotaciones de JPA para mapear la entidad a la base de datos.
Configura la conexión a la base de datos en el archivo

```properties
public class Tasks {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @Column(unique = true)
   private String name;
   private String descripcion;
   private String fecha;
   private String estado;


   public Tasks() {
   }
   public Tasks(Long id, String name, String descripcion , String fecha, String estado) {
       this.id = id;
       this.name = name;
       this.descripcion = descripcion;
       this.fecha = fecha;
       this.estado = estado;


   }
   public Long getId() {
       return id;
   }


   public void setId(Long id) {
       this.id = id;
   }


   public String getName() {
       return name;
   }


   public void setName(String name) {
       this.name = name;
   }


   public String getDescripcion() {
       return descripcion;
   }
   public void setDescripcion(String descripcion) {
       this.descripcion = descripcion;
   }


   public String getFecha() {
       return fecha;
   }


   public void setFecha(String fecha) {
       this.fecha = fecha;
   }


   public String getEstado() {
       return estado;
   }


   public void setEstado(String estado) {
       this.estado = estado;
   }
  
}

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


