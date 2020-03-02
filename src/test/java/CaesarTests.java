import com.company.Caesar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarTests {

    Caesar caesar;


    @BeforeEach
    void beforeInit(){
        caesar = new Caesar();
    }

    @Test
    @DisplayName("caesar test 1")
    public void test1(){
        String actual = caesar.cipher("hello WoRld", 7);
        String expected = "olssv dvysk";
        assertEquals(actual, expected, "sentence: 'hEllo WoRld' with key: '7' can't be converted");
    }

    @Test
    @DisplayName("caesar test 2")
    public void test2(){
        String actual = caesar.cipher("this is TesTing1", 5);
        String expected = "ymnx nx yjxynsl6";
        assertEquals(actual, expected, "sentence: 'this is TesTing1' with key: '5' can't be converted");
    }

    @Test
    @DisplayName("caesar test 3")
    public void test3(){
        String actual = caesar.cipher("with USING JUnit 5", 3);
        String expected = "zlwk xvlqj mxqlw 8";
        assertEquals(actual, expected, "sentence: 'with USING JUnit 5' with key: '3' can't be converted");
    }

    @Test
    @DisplayName("caesar test 4")
    public void test4(){
        String actual = caesar.cipher("and other words", 20);
        String expected = "uhx inbyl qilxm";
        assertEquals(actual, expected, "sentence: 'and other words' with key: '3' can't be converted");
    }

    @Test
    @DisplayName("caesar test 5")
    public void test5(){
        String actual = caesar.cipher("hEllo WoRld", 31);
        String expected = "Sorry, this algorithm can`t convert this";
        assertEquals(actual, expected, "sentence: 'hEllo WoRld' with key: '31' can't be converted");
    }


}
