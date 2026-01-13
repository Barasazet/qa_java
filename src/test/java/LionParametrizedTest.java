import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(Parameterized.class)
public class LionParametrizedTest {

    private String sex;
    private boolean hasMane;
    private String expectedMessage;

    public LionParametrizedTest(String sex, boolean hasMane, String expectedMessage) {
        this.sex = sex;
        this.hasMane = hasMane;
        this.expectedMessage = expectedMessage;
    }

    @Parameterized.Parameters(name = "Пол льва:{0} Есть грива?:{1} Сообщение ошибки {2}")
    public static Collection<Object[]> getTestData() {
        return Arrays.asList(new Object[][]{
                {"Самец", true, null},
                {"Самка", false, null},
                {"Неизвестно", false, "Используйте допустимые значения пола животного - Самец или Самка"}
        });
    }


    @Test
    public void testLionHasMane() throws Exception {
        Feline mockFeline = mock(Feline.class);
        if (expectedMessage != null) {
            try {
                new Lion(mockFeline, sex);
            } catch (Exception e) {
                assertEquals(expectedMessage, e.getMessage());
            }
        }else{
            Lion lion = new Lion(mockFeline, sex);
            assertEquals(hasMane, lion.doesHaveMane());

        }
    }
}


