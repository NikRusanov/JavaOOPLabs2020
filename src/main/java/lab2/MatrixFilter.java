package lab2;

import java.util.*;

/**
 * 2.	Дана матрица. В каждой строке найти наибольший элемент.
 * Из этих элементов найти наименьший и удалить ту строку, которой он принадлежит.
 * Вывести исходную и получившуюся матрицы в консоль.
 * <p>
 * @author Nik Rusanov
 */
public class MatrixFilter<T extends Comparable<? super T>> {

    private  final T[][] matrix;
    private final Map<Integer,T> maxInRow = new HashMap<>();
   //TODO спросить как преобразовать обратно в T[][] для получения результата
    private final List<T[]> result;

    public MatrixFilter(T[][] matrix) {
        this.matrix = matrix;
        result = new ArrayList<>(matrix.length);
    }

    public void filter() {
        findMaxElementsInRows();
        removeRow(findMinIndexInMaxRows());
        printResult();
    }

    private void findMaxElementsInRows() {
        int maxi = 0;

        for (int i = 0; i < matrix.length; ++i) {
            T tmpElem = matrix[i][0];
            for (int j = 1; j < matrix[i].length; ++j) {
                if(matrix[i][j].compareTo(tmpElem) > 0) {
                    tmpElem = matrix[i][j];
                    maxi = i;
                }
            }
            maxInRow.put(maxi,tmpElem);
        }
    }

    private Integer findMinIndexInMaxRows() {
        Optional<Map.Entry<Integer, T>> min = maxInRow.entrySet().stream().min(Map.Entry.comparingByValue());
        if (min.isPresent()) {
            return min.get().getKey();
        }
        throw  new NullPointerException("cant find min elem");
    }

    private   void removeRow(int n){
        for (int i = 0; i < matrix.length - 1 ; i++) {
            if (i < n) {
                result.add(matrix[i]);
            }
            if (i >= n) {
                result.add(matrix[i+1]);
            }
        }
    }

    private void  printResult() {
        for(var row : result) {
            for (var elem : row) {
                System.out.print(elem + "  ");
            }
            System.out.println();
        }
    }
}

