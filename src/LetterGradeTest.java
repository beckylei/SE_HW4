import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.io.*;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;

public class LetterGradeTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private ByteArrayInputStream testIn;

    @Test
    public void testMain() {
        String input = "88\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);
        System.setOut(new PrintStream(outContent));

        LetterGrade.main(new String[0]);
        String expectedOutput = "Enter the score = The grade of 88 is B\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMain2() {
        String input = "a\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);
        System.setOut(new PrintStream(outContent));

        LetterGrade.main(new String[0]);
        String expectedOutput = "Enter the score = Not an integer!\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @org.junit.jupiter.api.Test
    void rangeX() {
        int actual = LetterGrade.letterGrade(108);
        Assertions.assertEquals('X', actual);
    }

    @org.junit.jupiter.api.Test
    void rangeA() {
        int actual = LetterGrade.letterGrade(98);
        Assertions.assertEquals('A', actual);
    }

    @org.junit.jupiter.api.Test
    void rangeB() {
        int actual = LetterGrade.letterGrade(88);
        Assertions.assertEquals('B', actual);
    }

    @org.junit.jupiter.api.Test
    void rangeC() {
        int actual = LetterGrade.letterGrade(78);
        Assertions.assertEquals('C', actual);
    }

    @org.junit.jupiter.api.Test
    void rangeD() {
        int actual = LetterGrade.letterGrade(68);
        Assertions.assertEquals('D', actual);
    }

    @org.junit.jupiter.api.Test
    void rangeF() {
        int actual = LetterGrade.letterGrade(58);
        Assertions.assertEquals('F', actual);
    }

    @org.junit.jupiter.api.Test
    void rangeX2() {
        int actual = LetterGrade.letterGrade(-8);
        Assertions.assertEquals('X', actual);
    }
}


