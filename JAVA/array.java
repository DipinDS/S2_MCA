import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in the array:");
        int n=sc.nextInt();
        int[] arr =new int[n];


        System.out.println("enter the elements of the array:");
        for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }

    System.out.println("enter the elment to be searched:");
    int target =sc.nextInt();
      

    boolean found=false;
    for (int i=0;i<arr.length;i++)
    {
        if (arr[i]==target)
        {
            found=true;
            System.out.println("elemnet found at the array with index :"+ i);
            break;
        }

    }
    if(!found){
        System.out.println("element not in the array");
    }
    
    }
}


