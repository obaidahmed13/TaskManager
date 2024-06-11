package genspark.taskmanager.Task.Manager.services;

import genspark.taskmanager.Task.Manager.models.Task;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface TaskService {

     Task createTask(Task task);
     List<Task> getAllTasks();
     Optional<Task> getTaskByID(Long id);
     Task updateTask(Task task);
     String deleteTask(Long id);
}
