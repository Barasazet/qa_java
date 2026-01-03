import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {


    @Test
    public void testFelineEatMeatReturnsPredatorFood() throws Exception {
        Feline feline = new Feline();
        List<String> meat = List.of("Животные", "Птицы", "Рыба");
        assertEquals(meat, feline.eatMeat());
    }

    @Test
    public void testFelineGetFamilyReturns() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        assertEquals(expected, feline.getFamily());
    }

    @Test
    public void testFelineGetKittensWithoutAmount() {
        Feline feline = new Feline();
        int expected = 1;
        assertEquals(expected, feline.getKittens());
    }

    @Test
    public void testFelineGetKittensWithAmount() {
        Feline feline = new Feline();
        int actual = feline.getKittens(5);
        int expected = 5;
        assertEquals(expected, actual);
    }
}
