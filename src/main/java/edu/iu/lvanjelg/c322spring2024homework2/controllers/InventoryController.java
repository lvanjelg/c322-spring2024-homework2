package edu.iu.lvanjelg.c322spring2024homework2.controllers;

import edu.iu.lvanjelg.c322spring2024homework2.model.Guitar;
import edu.iu.lvanjelg.c322spring2024homework2.repository.GuitarRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/guitar")
public class InventoryController {
    private GuitarRepository guitarRepository;
    public InventoryController(GuitarRepository guitarRepository){
        this.guitarRepository = guitarRepository;
    }

    @GetMapping
    public Iterable<Guitar> findAll(){
        try{
            return guitarRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @GetMapping("/search")
    public ResponseEntity<Guitar> search(@PathVariable Guitar s){
        Iterable<Guitar> list = guitarRepository.findAll();
        for(Guitar g: list){
            if(g.getSerialNumber() == s.getSerialNumber()){
                return ResponseEntity.status(HttpStatus.FOUND).body(g);
            }else if(g.getPrice() == s.getPrice()){
                return ResponseEntity.status(HttpStatus.FOUND).body(g);
            }else if(g.getBuilder() == s.getBuilder()){
                return ResponseEntity.status(HttpStatus.FOUND).body(g);
            }else if(g.getModel() == s.getModel()){
                return ResponseEntity.status(HttpStatus.FOUND).body(g);
            }else if(g.getType() == s.getType()){
                return ResponseEntity.status(HttpStatus.FOUND).body(g);
            }else if(g.getBackWood() == s.getBackWood()){
                return ResponseEntity.status(HttpStatus.FOUND).body(g);
            }else if(g.getTopWood() == s.getTopWood()){
                return ResponseEntity.status(HttpStatus.FOUND).body(g);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
    @GetMapping("/find/{serialNumber}")
    public ResponseEntity<Guitar> getGuitar(@PathVariable String serialNumber){
        try{
            Guitar guitar = guitarRepository.findBySerialNumber(serialNumber);
            if(guitar != null){
                return ResponseEntity.status(HttpStatus.FOUND).body(guitar);
            }else{
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/add")
    public String addGuitar(@RequestBody Guitar data){
        return guitarRepository.save(data).getSerialNumber();
    }
}
