package genspark.taskmanager.Task.Manager.services;

import genspark.taskmanager.Task.Manager.models.Task;
import genspark.taskmanager.Task.Manager.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImp implements TaskService {

    @Autowired
    TaskRepository taskRepo;

    @Override
    public Task createTask(Task task) {
        return this.taskRepo.save(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return this.taskRepo.findAll();
    }

    @Override
    public Optional<Task> getTaskByID(Long id) {
        return this.taskRepo.findById(id);
    }

    @Override
    public Task updateTask(Task task) {
        return this.taskRepo.save(task);
    }

    @Override
    public String deleteTask(Long id) {
        this.taskRepo.deleteById(id);
        return "Task deleted successfully.";

    }
}
