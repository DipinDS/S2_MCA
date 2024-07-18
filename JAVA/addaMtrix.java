import java.util.Scanner;
public class addaMtrix {
    public static void readMatrix(int a[][], int m, int n){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix : ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = s.nextInt();
            }
        }
    }
    public static void addMatrices(int a[][], int b[][], int c[][], int m, int n){
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                c[i][j] = a[i][j] + b[i][j]; 
            }
        }
    }
    public static void printMatrix(int a[][], int m, int n){
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j]+" ");  
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.println("Enter the rows and columns of matrices you want to add : ");
        m = sc.nextInt();
        n = sc.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int c[][] = new int[m][n];
        readMatrix(a,m,n);
        readMatrix(b,m,n);
        System.out.println("Matrix A : ");
        printMatrix(a, m, n);
        System.out.println("Matrix B : ");
        printMatrix(b, m, n);
        addMatrices(a, b, c, m, n);
        System.out.println("Sum of Matrices : ");
        printMatrix(c,m,n);
}
}