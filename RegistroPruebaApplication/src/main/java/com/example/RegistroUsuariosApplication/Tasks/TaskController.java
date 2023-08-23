package com.example.RegistroUsuariosApplication.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping(path = "api/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping

    public ResponseEntity<List<Tasks>> getAllProducts() {
        List<Tasks> products = taskService.getTask();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Object> createTask(@RequestBody Tasks user) {
        return taskService.createTask(user);
    }

    @PutMapping
    public ResponseEntity<Object> updateTask(@RequestBody Tasks user) {
        return taskService.updateTask(user);
    }

    @DeleteMapping(path = "{userId}")
    public ResponseEntity<Object> deleteTask(@PathVariable("userId") Long userId) {
        return taskService.deleteTask(userId);
    }

}