import java.util.Scanner;

public class Product {
    private String pname;
    private double price;

    public Product(String pname, double price) {
        this.pname = pname;
        this.price = price;
    }

    public String getPname() {
        return pname;
    }

    public double getPrice() {
        return price;
    }

    public static Product comparePrice(Product product1, Product product2) {
        return product1.getPrice() < product2.getPrice()? product1 : product2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product 1 name: ");

    
        String pname1 = scanner.nextLine();
        System.out.print("Enter product 1 price: ");
        double price1 = scanner.nextDouble();
        Product product1 = new Product(pname1, price1);

        System.out.print("Enter product 2 name: ");
        String pname2 = scanner.next();
        System.out.print("Enter product 2 price: ");
        double price2 = scanner.nextDouble();
        Product product2 = new Product(pname2, price2);

        System.out.print("Enter product 3 name: ");
        String pname3 = scanner.next();
        System.out.print("Enter product 3 price: ");
        double price3 = scanner.nextDouble();
        Product product3 = new Product(pname3, price3);

        scanner.close();

        Product leastProduct = comparePrice(product1, comparePrice(product2, product3));
        System.out.println("The product with the least price is: " + leastProduct.getPname() + " with a price of $" + leastProduct.getPrice());
    }
}