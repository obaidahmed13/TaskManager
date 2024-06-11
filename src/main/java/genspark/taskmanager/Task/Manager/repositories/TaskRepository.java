package genspark.taskmanager.Task.Manager.repositories;

import genspark.taskmanager.Task.Manager.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
