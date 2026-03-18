package br.tasks.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import br.tasks.dto.TaskDTO;
import br.tasks.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @PostMapping
    public void create(@RequestBody TaskDTO dto) {
        service.create(dto);
    }

    @GetMapping
    public List<TaskDTO> list() {
        return service.list();
    }
}