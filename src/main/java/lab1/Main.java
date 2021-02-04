package lab1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        System.out.println("Array:\n");
        for (int i = 0 ; i < arr.length ; ++i ) {
            arr[i] = i;
            System.out.print(arr[i] + "\t");
        }
        Integer[] arrInit = arr.clone();

        Shuffler<Integer> shuffler = new Shuffler<>();
        System.out.println("\nShuffled:\n");
        arrInit = shuffler.shuffle(arr);

        for (Integer integer : arrInit) {
            System.out.print(integer + "\t");
        }

    }
}
