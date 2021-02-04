package lab2;

public class Main {
    public static void main(String[] args) {
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


    private static   void printInput (Integer[][] matrix) {
       for(int j = 0 ; j< matrix.length; j++) {
           for (int i = 0 ; i < matrix.length; i++) {
               System.out.print(matrix[i][j] + "  ");
           }
           System.out.print("\n");
       }
    }
}
