import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LionTest {

    @Test
    public void testLionGetKittens() throws Exception {
        Feline mockFeline = mock(Feline.class);
        when(mockFeline.getKittens()).thenReturn(1);
        Lion lion = new Lion(mockFeline, "Самка");
        int expect = 1;
        assertEquals(expect, lion.getKittens());
    }

    @Test
    public void testLionGetFood() throws Exception {
        Feline mockFeline = mock(Feline.class);
        Lion lion = new Lion(mockFeline, "Самка");
        when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expect = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expect, lion.getFood());
    }
}
