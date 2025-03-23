package dev.lanny.java_loop;

import org.junit.jupiter.api.Test;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    @DisplayName("Verify that App correctly prints the multiplication table")
    void test_App_Prints_Multiplication_Table() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        App.main(new String[] {});

        System.setOut(originalOut);

        String expectedOutput = """
                Multiplication Table for 5:
                5 x 1 = 5
                5 x 2 = 10
                5 x 3 = 15
                5 x 4 = 20
                5 x 5 = 25
                5 x 6 = 30
                5 x 7 = 35
                5 x 8 = 40
                5 x 9 = 45
                5 x 10 = 50
                """.stripIndent();

        String printedOutput = outputStream.toString().trim().replace("\r\n", "\n");
        String normalizedExpectedOutput = expectedOutput.trim().replace("\r\n", "\n");

        assertEquals(normalizedExpectedOutput, printedOutput, "App should correctly print the multiplication table.");
    }
}
