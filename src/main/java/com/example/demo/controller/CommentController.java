package com.example.demo.controller;

import com.example.demo.model.Comment;
import com.example.demo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentRepository repo;

    @PostMapping
    public Comment create(@RequestBody Comment comment) {
        return repo.save(comment);
    }

    @GetMapping
    public List<Comment> getAll() {
        return repo.findAll();
    }
}