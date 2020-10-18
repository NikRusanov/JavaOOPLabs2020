
package lab1;

import java.util.*;

/**
 * 1.	Дан массив без повторяющихся элементов.
 * Перемешать его элементы случайным образом так,
 * чтобы каждый элемент оказался на новом месте.
 * Вывести исходный и получившийся массивы в консоль.
 * <p>
 * @author Nik Rusanov
 */
public class Shuffler<T> {


    private  T[] shuffleArray(T[] array) {
        int index;
        T temp;
        T[] res = array.clone();
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            if (index != i)
            {
                temp = res[index];
                res[index] = res[i];
                res[i] = temp;
            }
        }
        return res;
    }

    public T[] shuffle(T[] array) {
        T[] tmp = array.clone();
        T[] res = array.clone();
        while (isEquals(res,tmp)){
            res = shuffleArray(array);
        }
        return res;
    }

    private boolean isEquals(Object[] expecteds, Object[] actuals) {
        for (int i = 0 ; i < expecteds.length; i++)  {
            if (expecteds[i].equals(actuals[i])){  return true;  }
        }
        return false;
    }


}
