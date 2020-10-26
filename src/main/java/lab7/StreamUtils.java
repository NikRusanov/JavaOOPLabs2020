package lab7;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUtils {
    //    a.  метод, возвращающий среднее значение списка целых чисел
    public static Double avg(List<Integer> integerList){
        return integerList.stream().mapToInt(integer -> integer).average().orElse(0);
    }
    //    b.  метод, приводящий все строки в списке в верхний регистр
    public static List<String> toUpperCase(List<String> stringList){
        if(stringList == null || stringList.isEmpty()) {
            return Collections.emptyList();
        }
        return stringList.stream().distinct().map(String::toUpperCase).collect(Collectors.toList());
    }
    //    c.  метод возвращающий список квадратов всех уникальных элементов списка
    public   static <T extends Number> List<Number> getSquareUniqueElements(List<T> numberList) throws EmptyListException {

        if(numberList== null || numberList.isEmpty()) {
            return Collections.emptyList();
        }
        return  numberList.stream().filter(number -> Collections.frequency(numberList, number) == 1)
                .map(x -> Math.pow(x.doubleValue(), 2))
                .collect(Collectors.toList());
    }
}
