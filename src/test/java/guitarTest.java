import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class guitarTest {
    @Test
    public void gTest() {
        Inventory.addGuitar("1275",1250.0,"Fender","13","Bass",CEDAR,CEDAR);
        Guitar g = new Guitar();
        g.serialNumber = "1350";
        g.builder = "Fender";
        g.setPrice(1300);
        g.model = "B";
        g.type = "Electric";
        g.backWood = "Cherry";
        g.topWood = "Pine";
        assertTrue(Inventory.search(g) != null);
        assertTrue(Inventory.search(g) == null);
    }
}
