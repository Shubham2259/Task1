package com.blog.BloggingProject.controller;

import com.blog.BloggingProject.model.Item;
import com.blog.BloggingProject.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepo repo;

    @GetMapping("/item")
    public List<Item> getAllStudent(){
        List<Item> list=repo.findAll();
        return list;
    }
    // ➕ Add
    @PostMapping("/add")
    public void addItem(@RequestBody Item item)
    {
        repo.save(item);
    }

    // 🔍 Get by ID
    @GetMapping("/{id}")
    public Item getItem(@PathVariable Integer id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found with id " + id));
    }

    // 🗑 Delete
    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Integer id) {
        repo.deleteById(id);
    }
}
