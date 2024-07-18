// class name{
//     public static void main(String[] args) {
//         System.out.println("<----dipinds--->");
//     }
// }

import java.util.Scanner;

public class ArraySearch {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of elements in the array: ");
    int n = scanner.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    System.out.print("Enter the element to search: ");
    int target = scanner.nextInt();

    boolean found = false;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        found = true;
        System.out.println("Element found at index " + i);
        break;
      }
    }

    if (!found) {
      System.out.println("Element not found in the array");
    }
  }
}