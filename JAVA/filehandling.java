import java.util.*;
import java.io.*;

public class filehandling {
  public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the file name:");
    String filename=sc.nextLine();

    FileOutputStream fos = new FileOutputStream(filename);
    System.out.println("enter the text to uinsert:");
    String text =sc.nextLine();
    fos.write(text.getBytes());
    fos.close();


    FileInputStream fis=new FileInputStream(filename);
    byte[] b=new byte[fis.available()];
    fis.read(b);
    fis.close();

    
    String filecontent = new String(b);
    System.out.println("content of file"+filename+":");
    System.out.println(filecontent);
    sc.close();
    
    
    
  }   
}
