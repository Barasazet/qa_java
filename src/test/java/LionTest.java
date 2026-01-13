import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LionTest {
    private Feline mockFeline;
    private Lion lion;


    @Before
    public void setUp() throws Exception {
        mockFeline = mock(Feline.class);
        lion = new Lion(mockFeline, "Самка");
    }

    @Test
    public void testLionGetKittens() throws Exception {
        when(mockFeline.getKittens()).thenReturn(1);
        int expect = 1;
        assertEquals(expect, lion.getKittens());
    }

    @Test
    public void testLionGetFood() throws Exception {
        when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expect = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expect, lion.getFood());
    }
}
