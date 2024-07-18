import java.util.Scanner;

class Complex {
    int real;
    int imag;
    public void readComplex(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter real part of the complex number : ");
        this.real = s.nextInt();
        System.out.println("Enter imaginary part of the complex number : ");
        this.imag = s.nextInt();
    }
    public void printComplex(){
        System.out.println(this.real+" + "+this.imag+"i");
    }
}
public class complexMain {
    public static Complex addComplex(Complex a,Complex b){
        Complex c = new Complex();
        c.real = a.real + b.real;
        c.imag = a.imag + b.imag;
        return c;
    }
    public static void main(String args[]){
        Complex a = new Complex();
        Complex b = new Complex();
        a.readComplex();
        b.readComplex();
        Complex c = addComplex(a, b);
        System.out.println("First Complex number : ");
        a.printComplex();
        System.out.println("Second Complex number : ");
        b.printComplex();
        System.out.println("Sum of the two Complex numbers : ");
        c.printComplex();
    }

}
