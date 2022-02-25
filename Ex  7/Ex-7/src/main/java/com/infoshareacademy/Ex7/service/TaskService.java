package com.infoshareacademy.Ex7.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.infoshareacademy.Ex7.Enum.Category;
import com.infoshareacademy.Ex7.dto.TaskDto;
import com.infoshareacademy.Ex7.entity.Task;
import com.infoshareacademy.Ex7.mappers.TaskMapper;
import com.infoshareacademy.Ex7.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {


    private final TaskRepository repository;
    private final TaskMapper mapper;
    public static Collection<TaskDto> taskDto = new ArrayList<>();

    @Autowired
    public TaskService(TaskRepository repository, TaskMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public void create(TaskDto dto) {
        Task task = mapper.toEntity(dto);
        repository.save(task);

    }

    public TaskDto find(Long id) {
        Task task = repository.findById(id);
        return mapper.toDto(task);
    }

    public List<TaskDto> findAll() {
        Collection<Task> tasks = repository.findAll();
        return tasks.stream().map(mapper::toDto).collect(Collectors.toList());
    }

    public List<TaskDto> findTheHigherPriorityTask() {
        Collection<Task> task = repository.findAll();
        return task.stream().map(mapper::toDto).filter(taskDto1 -> taskDto1.getPriority() == 1).collect(Collectors.toList());
    }

    public List<TaskDto> findNextDayTask() {
        Collection<Task> task = repository.findAll();
        LocalDate today = LocalDate.now();
        return task.stream().map(mapper::toDto).filter(taskDto1 -> taskDto1.getDueDate() == today.plusDays(1)).collect(Collectors.toList());
    }

    public List<TaskDto> descendingSortList() {
        Collection<Task> task = repository.findAll();
        return task.stream().map(mapper::toDto).sorted(Comparator.comparing(TaskDto::getPriority).reversed()).collect(Collectors.toList());
    }
    public List<TaskDto> sortedByDateList() {
        Collection<Task> task = repository.findAll();
        return task.stream().map(mapper::toDto).sorted(Comparator.comparing(TaskDto::getDueDate)).collect(Collectors.toList());
    }

    public List<TaskDto> findAllTaskInCategory(Category category) {
        Collection<Task> task = repository.findAll();
        return task.stream().map(mapper::toDto).filter(taskDto1 -> taskDto1.getCategory().equals(category)).collect(Collectors.toList());
    }
}

