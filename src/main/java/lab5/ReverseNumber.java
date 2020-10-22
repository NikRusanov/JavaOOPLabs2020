package lab5;

import java.util.*;

import static java.lang.Math.abs;

/**
 *5.	Пользователь вводит некоторое число.
 *  Записать его цифры в стек.
 *  Вывести число, у которого цифры идут в обратном порядке.
 *  Предусмотреть возможность введения произвольного количества чисел.
 * <p>
 * @author Nik Rusanov
 */

public class ReverseNumber {
    private final List<Integer> listOfNumbers;
    private final Deque<Integer> stack = new LinkedList<>();

    public ReverseNumber(List<Integer> inputList)  {

        if(inputList.isEmpty()) {
            throw new IllegalArgumentException("empty input");
        }
        listOfNumbers = inputList;
    }

    public void getResult() {
        for (var item : listOfNumbers) {
            int digit = item;
            do {
                    stack.push(digit % 10);
                }
                while (abs(digit /=10 ) > 0);
            System.out.println(item + ":"+ print());
        }
    }

    private String print() {
        StringBuilder sb = new StringBuilder();
        int len = stack.size();
        while(!stack.isEmpty()) {
            if(stack.size() != len )
                sb.append(abs(stack.pollLast()));
            else {
                sb.append(stack.pollLast());
            }
        }
        return sb.toString();
    }
}
