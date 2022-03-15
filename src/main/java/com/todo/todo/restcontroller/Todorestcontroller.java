package com.todo.todo.restcontroller;

import com.todo.todo.entity.Todo;
import com.todo.todo.service.Todoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class Todorestcontroller {
    private Todoservice todoService;

    @Autowired
    public Todorestcontroller(Todoservice theTodoService) {
        todoService = theTodoService;
    }

    @GetMapping("/todos")
    public List<Todo> findAll() {
        return todoService.findAll();
    }
}