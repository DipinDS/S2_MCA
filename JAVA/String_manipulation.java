import java.util.Scanner;

 class word {
   
    Scanner sc =new Scanner(System.in);
    String s;
    word(){
        System.out.println("enter a string:");
        s=sc.nextLine();
    
    }
    
    void str_functions(){
        System.out.println("lowercase:"+s.toLowerCase());
        System.out.println("uppercase:"+s.toUpperCase());
        System.out.println("substring(2):"+s.substring(2));
        System.out.println("length:"+s.length());
    

    }
}
    class String_manipulation{

        public static void main(String[] args) {
        word w= new word();
            w.str_functions();
        }
    }
    

    

