package Basics;
import java.io.File;

public class Files {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            if(file.createNewFile()){
                System.out.println("File Created");
            } else {
                System.out.println("File is not created");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error in file creating "+e.getMessage());
        }
    }
}
