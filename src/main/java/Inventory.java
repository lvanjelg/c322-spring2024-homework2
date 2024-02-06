import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;
public class Inventory {
    public static ArrayList<Guitar> guitars = new ArrayList<>();

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
    public static Guitar search(Guitar s){
        for(Guitar g: guitars){
            if(g.serialNumber == s.serialNumber){
                return g;
            }else if(g.price == s.price){
                return g;
            }else if(g.builder == s.builder){
                return g;
            }else if(g.model == s.model){
                return g;
            }else if(g.type == s.type){
                return g;
            }else if(g.backWood == s.backWood){
                return g;
            }else if(g.topWood == s.topWood){
                return g;
            }
        }
        return null;
    }

}
