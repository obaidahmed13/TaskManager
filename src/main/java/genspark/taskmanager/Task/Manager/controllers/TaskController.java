package genspark.taskmanager.Task.Manager.controllers;

import genspark.taskmanager.Task.Manager.models.Task;
import genspark.taskmanager.Task.Manager.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {
    @Autowired
    TaskService taskServ;

    @GetMapping("/task")
    public List<Task> allTasks() {
        return this.taskServ.getAllTasks();
    }

    @GetMapping("/task/{id}")
    public Optional<Task> getTaskByID(@PathVariable Long id) {
        return this.taskServ.getTaskByID(id);
    }

    @PostMapping("/task/create")
    public Task createTask(@RequestBody Task task) {
        return this.taskServ.createTask(task);
    }

    @PutMapping("/task/update")
    public Task updateTask(@RequestBody Task task) {
        return this.taskServ.updateTask(task);
    }

    @DeleteMapping("/task/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        return this.taskServ.deleteTask(id);
    }


}
