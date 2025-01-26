import java.util.Random;
import java.util.Arrays;

public class Main {    
    public static void main(String[] args)
    {
        // Task:
        // 1. Implement missing sorting algorithms.
        //    - InsertionSort.java
        //    - SelectionSort.java
        //
        //  2. Add a method to class Main to generate a random array.
        //  3. Provide random input to test suite and ensure your implementations
        //     of InsertionSort and Selection sort continue to work.
        //  4. Increase the loop count for TestSuite to get better performance results.
        // Increase the loop count to get better results once it works.
        TestSuite.run(randomArrayGen(1000, 1000), 10000);
    }
    public static int[] randomArrayGen(int numRandoms, int highNum){
        Random random = new Random();
        int[] returnVal = new int[numRandoms+1];
        if(highNum <= 0){
            return returnVal;
        }
        for(int i = 0; i <= numRandoms; i++){
            returnVal[i] = random.nextInt(highNum);

        }
        return returnVal;
    }
}
