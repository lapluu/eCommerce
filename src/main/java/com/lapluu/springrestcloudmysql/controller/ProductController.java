package com.lapluu.springrestcloudmysql.controller;

import com.lapluu.springrestcloudmysql.model.Product;
import com.lapluu.springrestcloudmysql.repository.ProductsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/products"})
public class ProductController {
    private ProductsRepository repository;
    ProductController(ProductsRepository app_productsRepository){
        this.repository = app_productsRepository;
    }
    // CRUD methods are here
    @GetMapping
    public List findAll(){ return repository.findAll();}
    @GetMapping(path={"/{id}"})
    public ResponseEntity<Product> findById(@PathVariable long id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public Product create(@RequestBody Product product){
          return repository.save(product);
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<Product> update(@PathVariable("id") long id,
                                          @RequestBody Product product){
        return repository.findById(id)
                .map(record -> {
                    record.copy(product);
                    Product product1=repository.save(product);
                    return ResponseEntity.ok().body(product1);
                }).orElse(ResponseEntity.notFound().build());
    }
    @DeleteMapping(path={"/{id}"})
    public ResponseEntity<?> delete(@PathVariable("id") long id){
        return repository.findById(id)
                .map(record ->{
                    repository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
