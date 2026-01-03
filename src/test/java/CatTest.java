import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CatTest {

    @Test
    public void testCatGetSound() {
        Feline mockFeline = mock(Feline.class);
        Cat cat = new Cat(mockFeline);
        String expect = "Мяу";
        assertEquals(expect, cat.getSound());


    }

    @Test
    public void testCatGetFood() throws Exception {
        Feline mockFeline = mock(Feline.class);
        when(mockFeline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(mockFeline);

        List<String> expect = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expect, cat.getFood());

        verify(mockFeline).eatMeat();
    }
}
