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

public class Polindrom {
    private final List<Integer> listOfNumbers;
    Deque<Integer> stack = new LinkedList<>();
    public Polindrom(List<Integer> inputList) {
        listOfNumbers = inputList;
    }

    public void getResult() {
        for (var item : listOfNumbers) {
            System.out.println("\nEntered: " + item);
                do {
                    stack.push(item % 10);
                }
                while (abs(item /=10 ) > 0);
            System.out.println(print());
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
