import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CountingTheOccurrencesTest {


    @Test
    public void testSum() {
        // Create an array with 100000 values
        char[] array = new char[1000000];
        Arrays.fill(array, 'a');

        // Record the start time
        long startTime = System.nanoTime();

        // Test the method
        assertEquals(0, CountingTheOccurrences.countArray(array));

        // Record the end time
        long endTime = System.nanoTime();

        // Calculate the execution time
        long executionTime = endTime - startTime;

        // Print the execution time
        System.out.println("Execution time in nanoseconds: " + executionTime);
        System.out.println("Execution time in milliseconds: " + executionTime / 1000000);
    }
}