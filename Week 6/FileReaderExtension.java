import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExtension{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner consoleInput = new Scanner(System.in);
        System.out.print("please enter file path you want to read: ");
        String filePath = consoleInput.nextLine();

        File myFile = new File(filePath);
        if (myFile.exists()){
            Scanner fileScanner = new Scanner(myFile);
            while(fileScanner.hasNext()){
                System.out.println(fileScanner.nextLine());

            }
        }else {
            System.out.println("file not found");
        }



    }
}