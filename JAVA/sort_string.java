import java.util.Scanner;
public class sort_string {
    Scanner sc = new Scanner(System.in);
    String s[];
    int size;
    sort_string(){
        System.out.println("enter the size of string:");
        size=sc.nextInt();
        s=new String[size];
        System.out.println("enter "+size+"string");
        for(int i=0;i<size;i++)
        s[i]=sc.next();
    }
    //     void sort() {
//         for (int i = 0; i < size; i++) {
//             for (int j = i + 1; j < size; j++) {
//                 if (s[j].compareTo(s[i]) < 0) { // Corrected the comparison
//                     String temp = s[j];
//                     s[j] = s[i];
//                     s[i] = temp;
//                 }
//             }
//         }
//     }
    void sort(){
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(s[j].compareTo(s[i])<0){
                    String temp=s[j];
                    s[j]=s[i];
                    s[i]=temp;
            
                }
            }        
        }
    }                       
                   
    void dispaly(){
        for(int i=0;i<size;i++)
            System.out.println(s[i]+"");
    }


    public static void main(String args[]){
        sort_string s1 = new sort_string();
        System.out.println("unsorted aray");
        s1.dispaly();
        s1.sort();
        System.out.println("sorted array is:");
        s1.dispaly();
    }        
}
        

    
// import java.util.Scanner;

// class SortString{
//     Scanner sc = new Scanner(System.in);
//     String s[];
//     int size;

//     SortString() {
//         System.out.println("Enter the number of strings:");
//         size = sc.nextInt();
//         s = new String[size];
//         System.out.println("Enter " + size + " strings:");
//         for (int i = 0; i < size; i++) {
//             s[i] = sc.next(); // Use next() instead of nextInt()
//         }
//     }

//     void sort() {
//         for (int i = 0; i < size; i++) {
//             for (int j = i + 1; j < size; j++) {
//                 if (s[j].compareTo(s[i]) < 0) { // Corrected the comparison
//                     String temp = s[j];
//                     s[j] = s[i];
//                     s[i] = temp;
//                 }
//             }
//         }
//     }

//     void display() { // Corrected the method name
//         for (int i = 0; i < size; i++) {
//             System.out.println(s[i]);
//         }
//     }
// public class sort_string_main{
//     public static void main(String args[]) {
//         SortString s1 = new SortString();
//         System.out.println("Sorted array:");
//         s1.sort();
//         s1.display();
//     }
// }
// }