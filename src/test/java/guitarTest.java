import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class guitarTest {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        g.builder = "Fender";
        System.out.println(g.getBuilder());
    }
}
