package lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> listOfNumbers = new ArrayList<>();
        int number;
        String input;
        System.out.println("Input number. Type \"q\"");
        do {
            try
            {
                input  = reader.readLine();
                if(input.equals("q")) {
                    break;
                }
                number = Integer.parseInt(input);
                listOfNumbers.add(number);
            }
            catch (NumberFormatException |  IOException e)
            {
                System.out.println( "Error " + e.getMessage());
            }
        }
        while ( true );
        if (!listOfNumbers.isEmpty()) {
            ReverseNumber reverseNumber = new ReverseNumber(listOfNumbers);
            reverseNumber.getResult();
        } else {
            System.out.println("you did not enter numbers");
        }
    }
}
