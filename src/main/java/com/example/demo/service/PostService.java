package com.example.demo.service;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post create(Post post) {
        return repo.save(post);
    }

    public List<Post> getAll() {
        return repo.findAll();
    }

    public Post getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Post not found"));
    }
}