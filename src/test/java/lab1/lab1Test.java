package lab1;


import org.junit.jupiter.api.Test;

import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.assertFalse;


public class lab1Test {


    @Test
    public  void shufflerTest()  {

        Integer[] arr = new Integer[100];

        for (int i = 0 ; i < arr.length ; ++i ) {
            arr[i] = i;
        }
        Integer[] arrInit = arr.clone();


        Shuffler<Integer> shuffler = new Shuffler<>();
        for(int i = 0 ; i < 1000000; ++i) {
            Integer[] arrRes = shuffler.shuffle(arr);

            assertFalse(isEquals(arrInit, arrRes));
        }
    }



    private boolean isEquals(Object[] expecteds, Object[] actuals) {
        for (int i = 0 ; i < expecteds.length; i++)  {
            if (expecteds[i].equals(actuals[i])){
                System.out.println("expcected :" + Arrays.toString(expecteds) + "actuals = "+ Arrays.toString(actuals));
                return true;  }
        }
        return false;
    }
}
