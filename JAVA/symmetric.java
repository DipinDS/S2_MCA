import java.util.Scanner;

public class symmetric {
    public static void readMatrix(int a[][], int m, int n) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();
            }
        }
    }

    public static void printMatrix(int a[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrix(int a[][], int t[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = a[j][i];
            }
        }
    }

    public static boolean checkMatrix(int a[][], int m, int n) {
        boolean c = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[j][i]) {
                    c = false;
                    break;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of the matrix : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        int t[][] = new int[m][n];
        readMatrix(a, m, n);
        transposeMatrix(a, t, m, n);
        System.out.println("Entered Matrix : ");
        printMatrix(a, m, n);
        System.out.println("Transpose of the matrix : ");
        printMatrix(t, m, n);
        boolean res = checkMatrix(a, m, n);
        if (res) {
            System.out.println("The matrix is Symmetric...");
        } else {
            System.out.println("The matrix is not Symmetric...");
 }
}
}