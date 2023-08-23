//UserService
package com.example.RegistroUsuariosApplication.Tasks;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository productRepository) {
        this.taskRepository = productRepository;
    }

    public List<Tasks> getTask() {
        return taskRepository.findAll();
    }

    public ResponseEntity<Object> createTask(Tasks product) {
        Optional<Tasks> existingProduct = taskRepository.findProductsByName(product.getName());
        HashMap<String, Object> data = new HashMap<>();

        if (existingProduct.isPresent()) {
            data.put("data", false);
            data.put("message", "El producto ya existe");
            return new ResponseEntity<>(data, HttpStatus.CONFLICT);
        } else {
            Tasks savedProduct = taskRepository.save(product);
            data.put("data", savedProduct);
            data.put("message", "Tarea creada");

            return new ResponseEntity<>(data, HttpStatus.CREATED);
        }
    }
    public ResponseEntity<Object> updateTask(Tasks product) {
        Optional<Tasks> existingProduct = taskRepository.findById(product.getId());
        HashMap<String, Object> datos = new HashMap<>();

        if (existingProduct.isPresent()) {
            Tasks savedProduct =taskRepository.save(product);
            datos.put("data", savedProduct);
            datos.put("message", "Tarea actualizada");

            return new ResponseEntity<>(datos, HttpStatus.OK);
        } else {
            datos.put("data", false);
            datos.put("message", "La tarea " + product.getId() + " no existe");
            return new ResponseEntity<>(datos, HttpStatus.NOT_FOUND);
        }
    }
    public ResponseEntity<Object> deleteTask(Long productId) {
        boolean exists = taskRepository.existsById(productId);
        HashMap<String, Object> datos = new HashMap<>();

        if (!exists) {
            datos.put("data", false);
            datos.put("message", "La tarea " + productId + " no existe");
            return new ResponseEntity<>(datos, HttpStatus.NOT_FOUND);
        }

        taskRepository.deleteById(productId);
        datos.put("data", true);
        datos.put("message", "La tarea" + productId + " ha sido eliminado");
        return new ResponseEntity<>(datos, HttpStatus.OK);
    }
}