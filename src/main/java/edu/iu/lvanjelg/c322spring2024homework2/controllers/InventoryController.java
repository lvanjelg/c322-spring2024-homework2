package edu.iu.lvanjelg.c322spring2024homework2.controllers;

import edu.iu.lvanjelg.c322spring2024homework2.model.Guitar;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@RestController
@CrossOrigin
@RequestMapping("/guitar")
public class InventoryController {
    static ArrayList<Guitar> guitars = new ArrayList<>();
    static String DATABASE_NAME = "guitars_database.txt";
    @GetMapping
    public static ArrayList<Guitar> findAll(){
        List<String> temp = null;
        try {
            temp = Files.readAllLines(new File(DATABASE_NAME).toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for(int i = 0; i < temp.size(); i++){
            String[] t = temp.get(i).split(", ");
            if(t.length > 1){
                Guitar g = new Guitar(t[0],Double.parseDouble(t[1]),t[2],t[3],t[4],t[5],t[6]);
                guitars.add(g);
            }
        }
        return guitars;
    }
    @GetMapping("/search")
    public static Guitar search(@PathVariable Guitar s){
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
    @GetMapping("/find/{serialNumber}")
    public static Guitar getGuitar(@PathVariable String serialNumber){
        for(Guitar guitar: guitars){
            if(guitar.getSerialNumber() == serialNumber){
                return guitar;
            }
        }
        return null;
    }
    @PostMapping("/add")
    public static boolean addGuitar(@RequestBody Guitar data){
        try{
            FileWriter guitarDB = new FileWriter("guitars_database.txt",true);
            guitarDB.append(data.toString()+"\n");
            guitarDB.close();
            guitars.add(data);
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
