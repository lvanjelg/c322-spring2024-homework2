import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
public class Inventory {
    static ArrayList<Guitar> guitars = new ArrayList<>();

    public static void addGuitar(String serial, double price, String builder, String model, String type, String backWood, String topWood){
        try{
            FileWriter guitarDB = new FileWriter("guitars_database.txt");
            guitarDB.write(serial + ", " + price + ", " + builder + ", " + model + ", " + type + ", " + backWood + ", " + topWood);
            guitarDB.close();
            Guitar g = new Guitar();
            g.serialNumber = serial;
            g.price = price;
            g.builder = builder;
            g.model = model;
            g.type = type;
            g.backWood = backWood;
            g.topWood = topWood;
            guitars.add(g);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Guitar getGuitar(String serial){
        for(Guitar guitar: guitars){
            if(guitar.serialNumber == serial){
                return guitar;
            }
        }
        return null;
    }
    public static Guitar search(Guitar p){
        for(Guitar guitar: guitars){
            if(guitar.serialNumber == p.serialNumber){
                return guitar;
            }else if(guitar.price == p.price){
                return guitar;
            }else if(guitar.builder == p.builder){
                return guitar;
            }else if(guitar.model == p.model){
                return guitar;
            }else if(guitar.type == p.type){
                return guitar;
            }else if(guitar.backWood == p.backWood){
                return guitar;
            }else if(guitar.topWood == p.topWood){
                return guitar;
            }
        }
        return null;
    }

}
