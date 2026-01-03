import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {
    private Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }


    @Test
    public void testFelineEatMeatReturnsPredatorFood() throws Exception {
        List<String> meat = List.of("Животные", "Птицы", "Рыба");
        assertEquals(meat, feline.eatMeat());
    }

    @Test
    public void testFelineGetFamilyReturns() {
        String expected = "Кошачьи";
        assertEquals(expected, feline.getFamily());
    }

    @Test
    public void testFelineGetKittensWithoutAmount() {
        int expected = 1;
        assertEquals(expected, feline.getKittens());
    }

    @Test
    public void testFelineGetKittensWithAmount() {
        int actual = feline.getKittens(5);
        int expected = 5;
        assertEquals(expected, actual);
    }
}
