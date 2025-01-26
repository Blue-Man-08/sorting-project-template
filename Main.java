import java.util.Random;
import java.util.Arrays;

public class Main {    
    public static void main(String[] args)
    {

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
