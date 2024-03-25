public class ex2MatrixOperations {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {2, 3, 1},
                {7, 1, 6},
                {9, 2, 4}
        };

        int[][] matrix2 = {
                {8, 5, 3},
                {3, 9, 2},
                {2, 7, 3}
        };

        int[][] sum = new int[3][3]; //a new object
        int[][] product = new int[3][3]; // a new object

        // Calculate sum of matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Calculate product of matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Sum of the two matrices:");
        printMatrix(sum);
        System.out.println("Product of the two matrices:");
        printMatrix(product);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
