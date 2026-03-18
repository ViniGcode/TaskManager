package br.tasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.tasks.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> { }
