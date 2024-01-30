package edu.iu.lvanjelg.c322spring2024homework2.controllers;

import edu.iu.lvanjelg.c322spring2024homework2.model.Guitar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

@RestController
public class InventoryController {
    static ArrayList<Guitar> guitars = new ArrayList<>();
    @GetMapping("/search")
    public static Guitar search(Guitar s){
        for(Guitar g: guitars){
            if(g.getSerialNumber() == s.getSerialNumber()){
                return g;
            }else if(g.getPrice() == s.getPrice()){
                return g;
            }else if(g.getBuilder() == s.getBuilder()){
                return g;
            }else if(g.getModel() == s.getModel()){
                return g;
            }else if(g.getType() == s.getType()){
                return g;
            }else if(g.getBackWood() == s.getBackWood()){
                return g;
            }else if(g.getTopWood() == s.getTopWood()){
                return g;
            }
        }
        return null;
    }
    @GetMapping("/find/{serial}")
    public static Guitar getGuitar(String serial){
        for(Guitar guitar: guitars){
            if(guitar.getSerialNumber() == serial){
                return guitar;
            }
        }
        return null;
    }
    @PostMapping("/add")
    public boolean addGuitar(@RequestBody Guitar data){
        try{
            FileWriter guitarDB = new FileWriter("guitars_database.txt");
            guitarDB.write(String.valueOf(data));
            guitarDB.close();
            guitars.add(data);
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
