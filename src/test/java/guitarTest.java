import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class guitarTest {
    @Test
    public void gTest() {
        Guitar g = new Guitar();
        g.builder = "Fender";
        g.setPrice(1300);
        System.out.println(g.getPrice());
        Inventory.addGuitar("1275",1250.0,"Fender","13","Bass","Walnut","Oak");
        System.out.println(Inventory.getGuitar("1275"));
    }
}
