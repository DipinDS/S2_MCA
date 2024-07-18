import java.util.Scanner;

public class employee {
    int eNo;
    String eName;
    int eSalary;

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID:");
        eNo = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name:");
        eName = sc.nextLine();

        System.out.println("Enter monthly salary:");
        eSalary = Integer.parseInt(sc.nextLine());
    }

    public void display() {
        System.out.println("Name is :" + eName);
    }

    public static void main(String[] args) {
        int i, n = 3;
        int no;
        employee emp[] = new employee[n];
        for (i = 0; i < n; i++) {
            emp[i] = new employee();
            emp[i].read();
        }
        System.out.println("Search");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter ID: ");
            no = Integer.parseInt(sc.nextLine());
            boolean found = false;
            for (i = 0; i < n; i++) {
                if (emp[i].eNo == no) {
                    emp[i].display();
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Employee not found.");
            }
        }
    }
}