 import java.util.Scanner;
// public class animal {
//     int age=10;
    
//     class cat{
//         String name;
//         cat (String n){
//             name=n;
//         }
//         void display(){
//             System.out.println("age:"+age);
//             System.out.println("name:"+name);
//         }
//     }
//     static class dog{
//         String dname;
//         dog(String n){
//             dname=n;
//         }
//         void display(){
//             System.out.println("name:"+dname);
//         }
//     }
//     public static void main(String[] args) {
//         animal a1 = new animal();
//         animal.dog d1 = new animal.dog("meow");
//         animal.cat c1 = a1.new cat("bow");
//         c1.display();
//         d1.display();
//     }
// }        



class animal{
    String name;

    void eat(){
        System.out.println("this animal is eat foodd:");

    }
}
class dog extends animal{
    void bark(){
        System.out.println("barks---->");

    }
    void eat(){
        System.out.println("the dog eat food:");
    }
}
public class Main{
    public static void main(String[] args) {
        Main a=new Main();
        dog Mydog=new dog();
        Mydog.name="chikku";
        Mydog.eat();
        Mydog.bark();
        System.out.println("name"+Mydog.name);
    }
}    

  

