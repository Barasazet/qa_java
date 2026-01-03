import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CatTest {
    private Feline mockFeline;
    private Cat cat;


    @Before
            public void initialize() {
        mockFeline = mock(Feline.class);
        cat = new Cat(mockFeline);
    }

    @Test
    public void testCatGetSound() {
        String expect = "Мяу";
        assertEquals(expect, cat.getSound());


    }

    @Test
    public void testCatGetFood() throws Exception {
        when(mockFeline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        List<String> expect = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expect, cat.getFood());
    }

    @Test
    public void testCatGetFoodCalledCorrectly() throws Exception {
        when(mockFeline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        cat.getFood();
        verify(mockFeline).eatMeat();
    }
}
