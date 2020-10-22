package lab5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class ReverseNumberTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @Test
    public void reversePos() {
        List<Integer> listOfNumbers = new ArrayList<>() {{
            add(1234);
            add(2241);
            add(33531);
            add(45531);
        }};
        ReverseNumber rev = new ReverseNumber(listOfNumbers);
        rev.getResult();
        assertEquals("1234:4321\n" +
                              "2241:1422\n" +
                              "33531:13533\n" +
                              "45531:13554\n"
                ,outputStreamCaptor.toString());
    }

    @Test
    public void reverseNeg(){
        List<Integer> listOfNumbers = new ArrayList<>() {{
            add(-1234);
            add(-2241);
            add(-33531);
            add(-45531);
        }};
        ReverseNumber rev = new ReverseNumber(listOfNumbers);
        rev.getResult();
        assertEquals("-1234:-4321\n" +
                        "-2241:-1422\n" +
                        "-33531:-13533\n" +
                        "-45531:-13554\n"
                , outputStreamCaptor.toString());
    }
    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}
