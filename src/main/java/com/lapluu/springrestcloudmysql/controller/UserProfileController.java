package com.lapluu.springrestcloudmysql.controller;

import com.lapluu.springrestcloudmysql.model.UserProfile;
import com.lapluu.springrestcloudmysql.repository.UserProfileRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/userprofiles"})
public class UserProfileController {

    private UserProfileRepository userProfileRepository;
    UserProfileController(UserProfileRepository userProfileRepository){
        this.userProfileRepository =  userProfileRepository;
    }
    // CRUD methods in here
    @GetMapping
    public List findAll(){
        return userProfileRepository.findAll();
    }
    @GetMapping(path = {"/{id}"})
    public ResponseEntity<UserProfile> findById(@PathVariable long id){
        return userProfileRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public UserProfile create(@RequestBody UserProfile userProfile){
        return userProfileRepository.save(userProfile);
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<UserProfile> update(@PathVariable("id") long id,
                                              @RequestBody UserProfile userProfile){
        return userProfileRepository.findById(id).map(record -> {
            record.copy( userProfile);
            UserProfile updated = userProfileRepository.save(record);
            return ResponseEntity.ok().body(updated);
        }).orElse(ResponseEntity.notFound().build());
    }
    @DeleteMapping(path={"/{id}"})
    public ResponseEntity< ? > delete(@PathVariable("id") long id){
        return userProfileRepository.findById(id)
                .map(record -> {
                    userProfileRepository.deleteById(id);
                  return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }

}
