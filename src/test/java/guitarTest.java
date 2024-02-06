import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class guitarTest {
    @Test
    public void gTest() {
        Inventory.addGuitar("1275",1250.0, Guitar.Builder.FENDER,"13", Guitar.Type.ELECTRIC, Guitar.Wood.CEDAR, Guitar.Wood.CEDAR);
        Guitar g = new Guitar();
        g.serialNumber = "1350";
        g.builder = Guitar.Builder.FENDER;
        g.setPrice(1300);
        g.model = "B";
        g.type = Guitar.Type.ELECTRIC;
        g.backWood = Guitar.Wood.ALDER;
        g.topWood = Guitar.Wood.SITKA;
        assertTrue(Inventory.search(g) != null);
        assertTrue(g.builder.toString() == "Fender");
        assertTrue(g.backWood.toString() == "Alder");
    }
}
