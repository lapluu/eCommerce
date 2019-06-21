package com.lapluu.springrestcloudmysql.controller;

import com.lapluu.springrestcloudmysql.model.WalletCard;
import com.lapluu.springrestcloudmysql.repository.WalletRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wallets")
public class WalletController {
    private WalletRepository walletRepository;
    WalletController(WalletRepository walletRepository){
        this.walletRepository=walletRepository;
    }
    //CRUID methods
    @GetMapping
    public List findAll(){
        return this.walletRepository.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<WalletCard> findById(@PathVariable("id") long id){
        return this.walletRepository.findById(id).map(record ->
                ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public WalletCard create(@RequestBody WalletCard wallet){
        return this.walletRepository.save(wallet);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody WalletCard wallet){
        return this.walletRepository.findById(id).map(record -> {
             record.copy(wallet);
             WalletCard wallet1=walletRepository.save(record);
             return ResponseEntity.ok().body(wallet1);
        }).orElse(ResponseEntity.notFound().build());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id){
        return this.walletRepository.findById(id).map(record -> {
            walletRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }

}
