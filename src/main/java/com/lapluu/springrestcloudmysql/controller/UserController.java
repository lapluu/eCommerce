package com.lapluu.springrestcloudmysql.controller;

import com.lapluu.springrestcloudmysql.model.User;
import com.lapluu.springrestcloudmysql.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Table;
import java.util.List;

@RestController
@RequestMapping("/users")
@Table(name="users")
public class UserController {
    private UserRepository userRepository;
    UserController(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    //CRUID methods
    @GetMapping
    public List findAll(){
        return this.userRepository.findAll();
    }
    @GetMapping(path="/{id}")
    public ResponseEntity<User> findById(@PathVariable("id") long id){
        return this.userRepository.findById(id).map(
                record ->
                    ResponseEntity.ok().body(record)
                ).orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public User create(@RequestBody User user){
        return this.userRepository.save(user);
    }
    @PutMapping(value="/{id}")
    public ResponseEntity<?> update(@PathVariable("id") long id,
                                    @RequestBody User user){
        return this.userRepository.findById(id).map(
                record -> {
                    record.copy(user);
                    User user1=this.userRepository.save(record);
                    return ResponseEntity.ok().body(user1);
                }).orElse(ResponseEntity.notFound().build());
    }
    @DeleteMapping(value="/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id){
        return this.userRepository.findById(id).map(
                record -> {
                    userRepository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }

}
