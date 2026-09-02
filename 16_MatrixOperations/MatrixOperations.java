import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matrix Addition
        System.out.print("Enter rows for addition: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns for addition: ");
        int columns = sc.nextInt();

        int[][] a = new int[rows][columns];
        int[][] b = new int[rows][columns];
        int[][] sum = new int[rows][columns];

        System.out.println("Enter first matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Matrix Addition:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        // Matrix Multiplication
        System.out.println("\nMatrix Multiplication");

        System.out.print("Enter rows of first matrix: ");
        int r1 = sc.nextInt();

        System.out.print("Enter columns of first matrix: ");
        int c1 = sc.nextInt();

        System.out.print("Enter rows of second matrix: ");
        int r2 = sc.nextInt();

        System.out.print("Enter columns of second matrix: ");
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible.");
        } else {
            int[][] x = new int[r1][c1];
            int[][] y = new int[r2][c2];
            int[][] product = new int[r1][c2];

            System.out.println("Enter first matrix:");

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    x[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter second matrix:");

            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    y[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        product[i][j] =
                                product[i][j] + x[i][k] * y[k][j];
                    }
                }
            }

            System.out.println("Matrix Multiplication:");

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(product[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
