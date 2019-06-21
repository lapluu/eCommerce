package com.lapluu.springrestcloudmysql.controller;

import com.lapluu.springrestcloudmysql.model.Faq;
import com.lapluu.springrestcloudmysql.repository.FaqRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/faq"})
public class FaqController {
    private FaqRepository faqRespository;
    FaqController(FaqRepository faqRespository){
        this.faqRespository=faqRespository;
    }
    //CRUD
    @GetMapping
    public List findAll(){
        return this.faqRespository.findAll();
    }
    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Faq> findById(@PathVariable("id") long id){
        return this.faqRespository.findById(id)
                .map(record ->
                        ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public Faq create(@RequestBody Faq faq){
        return faqRespository.save(faq);
    }
    @PutMapping(value="/{id}")
    public ResponseEntity<Faq> update(@PathVariable("id") long id,
                                      @RequestBody Faq faq){
        return this.faqRespository.findById(id).map(
                record -> {
                    record.copy(faq);
                    Faq faq1=faqRespository.save(record);
                    return ResponseEntity.ok().body(faq1);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path="/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        return faqRespository.findById(id).map(record -> {
            faqRespository.deleteById(id);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
