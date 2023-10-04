package com.example.todo.service;

import com.example.todo.entity.Task;
import com.example.todo.repositories.TaskRepository;
import com.example.todo.utils.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;


    public List<Task> getAllTasks (){
        return taskRepository.findAll();
    }

    public Optional<Task>  getTaskById (Long id) {
        return taskRepository.findById(id);
    }

    public Task saveTask (Task task) {
        return taskRepository.save(task);
    }

    public void deleteTask (Long id) {
        if (!taskRepository.existsById(id)) {
            throw new ResourceNotFoundException("Task with ID " + id + " not found");
        }
        taskRepository.deleteById(id);
    }
}
