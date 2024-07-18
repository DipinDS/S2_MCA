import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class fcopy{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the source file path : ");
        String sourcePath = reader.readLine();
        System.out.println("Enter the destination path : ");
        String destPath = reader.readLine();
        try(FileInputStream in = new FileInputStream(sourcePath)){
            FileOutputStream out = new FileOutputStream(destPath);
            byte [] buffer = new byte[1024];
            int bytesRead;
            while((bytesRead = in.read(buffer)) != -1){
                out.write(buffer,0,bytesRead);
            } 
            System.out.println("File copied Successfully");
        }catch(IOException e){
            System.out.println("An error occurred during copy "+e.getMessage());
        }finally{
            reader.close();
 }
}
}