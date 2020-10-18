package lab2;

import org.junit.Test;

public class lab2Test {

    @Test
    public void filterIntegerMatrix() {

        Integer[][] matrix =  {
                {-9,1,0},
                {4,1,1},
                {-2,2,-1}
        };
        System.out.println("Input matrix:");

        printInput(matrix);

        System.out.println("Result:");
        MatrixFilter<Integer> matrixFilter = new MatrixFilter<>(matrix);
        matrixFilter.filter();

    }

    @Test
    public void filterStringMatrix() {

        String[][] matrix =  {
                {"aa","zz","ww"},
                {"xsas","x","sw"},
                {"bb","aaa","cc"}
        };
        System.out.println("Input matrix:");
        printInput(matrix);

        System.out.println("Result:");

        MatrixFilter<String> matrixFilter = new MatrixFilter<>(matrix);
        matrixFilter.filter();

    }

    private  <T> void printInput (T[][] matrix) {
        for(T[] row : matrix) {
            for (T elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

}
