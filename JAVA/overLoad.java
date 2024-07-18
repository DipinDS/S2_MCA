import java.util.Scanner;
public class overLoad {
    double area(int r){
        double result = r*r*3.14;
        return result;
    }
    double area(int l, int b){
        double result = l*b;
        return result; 
    }
    double perialFaham(int r){
       double peri = 3.14*2*r;
       return peri; 
    }
    double perialFaham(int l, int b){
        double peri = 2*(l + b);
        return peri;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        overLoad o = new overLoad();
        System.out.println("Enter the radius : ");
        int radius = sc.nextInt();
        System.out.println("Enter the length and breadth : ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        double circ = o.area(radius);
        System.out.println("Area of Circle : ");
        System.out.println(circ);
        double rect = o.area(length, breadth);
        System.out.println("Area of rectangle : ");
        System.out.println(rect);        
        double rectpm = o.perialFaham(2, 3);
        System.out.println("Perimeter of rectangle : ");
        System.out.println(rectpm);
        double circpm = o.perialFaham(5);
        System.out.println("Perimeter of circle : ");
        System.out.println(circpm); 
    }
}
