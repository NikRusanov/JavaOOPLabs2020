package lab5;

import java.util.List;
import java.util.Stack;

/**
 *5.	Пользователь вводит некоторое число.
 *  Записать его цифры в стек.
 *  Вывести число, у которого цифры идут в обратном порядке.
 *  Предусмотреть возможность введения произвольного количества чисел.
 * <p>
 * @author Nik Rusanov
 */

public class Polindrom {
    private final List<Integer> listOfNumbers;
    Stack<Character> stack = new Stack<>();
    char[] numbers;

    public Polindrom(List<Integer> inputList) {
        listOfNumbers = inputList;
    }

    public void getResult() {
        for (var item : listOfNumbers) {
            System.out.println("\nEntered: " + item);
            numbers = String.valueOf(item).toCharArray();
            for( var i : numbers ) {
                if(Character.isDigit(i)){
                    stack.push(i);
                }
            }

            System.out.print("Reversed: " );
            while( !stack.empty() ) {
                System.out.print(stack.pop());
            }
            System.out.println();
        }
    }
}
