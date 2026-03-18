package br.tasks.service;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

import br.tasks.dto.TaskDTO;
import br.tasks.entity.Task;
import br.tasks.repository.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public Task create(TaskDTO dto) {
        Task task = toEntity(dto);
        return repository.save(task);
    }

    public List<TaskDTO> list() {
        return repository.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    private Task toEntity(TaskDTO dto) {
        Task task = new Task();
        task.setTitle(dto.getTitle());
        task.setDescription(dto.getDescription());
        task.setCompleted(dto.getCompleted());
        task.setDateOfConclusion(dto.getDateOfConclusion());
        return task;
    }

    private TaskDTO toDTO(Task task) {
        TaskDTO dto = new TaskDTO();
        dto.setTitle(task.getTitle());
        dto.setDescription(task.getDescription());
        dto.setCompleted(task.getCompleted());
        dto.setDateOfConclusion(task.getDateOfConclusion());
        return dto;
    }
}