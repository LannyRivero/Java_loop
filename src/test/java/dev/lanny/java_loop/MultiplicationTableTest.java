package dev.lanny.java_loop;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultiplicationTableTest {

    @Test
    @DisplayName("Generate multiplication table correctly for a given number")
    void test_Generate_Table(){
        MultiplicationTable table = new MultiplicationTable();

        List<String> result = table.generateTable(5);

        assertEquals(10, result.size(), "The table must contains 10 elemnts");
        assertEquals("5 x 1 = 5", result.get(0), "The fisrt value should be 5 x 1 = 5");
        assertEquals("5 x 10 = 50",result.get(9), "The last value should be 5 x 10 = 50");
    }

}
