//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class YakTest {
//    @Test
//    void equalsFive() {
//        assertEquals(3, Yak.smallestDublicate(new int[]{2, 1, 3, 5, 3, 2}));
//    }
//
//    @Test
//    public void testSum() {
//        // Create an array with 100000 values
//        int[] array = new int[100000];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i;
//        }
//
//        // Record the start time
//        long startTime = System.nanoTime();
//
//        // Test the method
//        assertEquals(-1, Yak.smallestDublicate(array));
//
//        // Record the end time
//        long endTime = System.nanoTime();
//
//        // Calculate the execution time
//        long executionTime = endTime - startTime;
//
//        // Print the execution time
//        System.out.println("Execution time in nanoseconds: " + executionTime);
//        System.out.println("Execution time in milliseconds: " + executionTime / 1000000);
//    }
//
//}