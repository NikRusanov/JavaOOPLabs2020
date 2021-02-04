package lab7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();

        for(int i =0 ; i < 10; ++i) {
            list.add(i);
        }
        list.add(9);
        System.out.println("Integer list:");
        System.out.println(list);
        System.out.println("\navg value : " + StreamUtils.avg(list));

        System.out.println("get unique square: " + StreamUtils.getSquareUniqueElements(list));
        List<String> stringList = new ArrayList<>();
        stringList.add("string1");
        stringList.add("string2");
        stringList.add("STRING3");
        System.out.println(stringList);
        System.out.println("result:");
        System.out.println(StreamUtils.toUpperCase(stringList));
    }
}
