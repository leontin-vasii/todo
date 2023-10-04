package com.example.todo.controllers;

import com.example.todo.entity.Task;
import com.example.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List <Task> getAllTasks () {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Optional<Task> getTaskById (@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping
    public Task createTask (@RequestBody Task task) {
        return taskService.saveTask(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask (@PathVariable Long id) {
        taskService.deleteTask(id);
    }




}
