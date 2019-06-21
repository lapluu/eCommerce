package com.lapluu.springrestcloudmysql.controller;

import com.lapluu.springrestcloudmysql.model.Category;
import com.lapluu.springrestcloudmysql.repository.CategoryRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/categories"})
public class CategoryController {
    private CategoryRepository repository;
    CategoryController(CategoryRepository categoryRepository){
        this.repository=categoryRepository;
    }
    //CRUD methods in here
    @GetMapping
    public List findAll(){
        return repository.findAll();
    }
    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Category> findById(@PathVariable("id")  long id){
        return repository.findById(id)
                .map( record ->
                    ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public Category create(@RequestBody Category category){
        return repository.save(category);
    }
    @PutMapping(value="/{id}")
    public ResponseEntity<Category> update(@PathVariable("id") long id ,
                                           @RequestBody Category category){
        return repository.findById(id).map(record ->{
            record.copy(category);
            Category category1=repository.save(record);
            return ResponseEntity.ok().body(category1);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<?> delete(@PathVariable("id") long id){
        return repository.findById(id).map(record -> {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }

}
