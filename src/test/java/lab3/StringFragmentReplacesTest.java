package lab3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StringFragmentReplacesTest {

    @Test
    public void separateStringByThreeSymbols(){
        StringFragmentsReplaces fragmentsReplaces = new StringFragmentsReplaces("sadasdssss",3);
        List<String> result = fragmentsReplaces.separate();
        System.out.println(result.toString());
    }
}
