import java.io.FileWriter;
import java.util.List;
import java.io.IOException;
public class Inventory {
    static Guitar[] guitars;

    public static void addGuitar(String serial, double price, String builder, String model, String type, String backWood, String topWood){
        try{
            FileWriter guitarDB = new FileWriter("guitars_database.txt");
            guitarDB.write(serial + ", " + price + ", " + builder + ", " + model + ", " + type + ", " + backWood + ", " + topWood);
            guitarDB.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
