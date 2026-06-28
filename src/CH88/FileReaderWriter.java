/*
88. File Not Found Exception Handling
Write a program to read a filename from the user and display its
content. The program should handle the situation where the file
does not exist.
Key Points:
• Use Scanner to read the filename from the user.
• Use FileReader to read the file content.
• Implement a try-catch block to handle FileNotFoundException.
• Display a message informing the user if the file is not found.
 */
package CH88;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.exit;

public class FileReaderWriter {
    static Scanner sc = new Scanner(System.in);

    // File Writer
    static void fileWriter(){
        System.out.println("Enter the filename : ");
        String fileName = sc.nextLine();
        try(FileWriter fw = new FileWriter(fileName)){
            System.out.println("Enter the content to the file : ");
            String msg = sc.nextLine();
            fw.write(msg);
            fw.flush();
            System.out.println("File written successfully..");
        }catch(IOException e){
            System.out.println("Exception : "+e.getMessage());
        }
    }

    // File Reader
    public static void fileReader(){
        System.out.println("Enter the filename : ");
        String fileName = sc.nextLine();
        try(FileReader fr = new FileReader(fileName)){
            int read;
            System.out.println("\n--------------------");
            while((read = fr.read()) != -1){
                System.out.print((char) read);
            }
            System.out.println("\n--------------------");
        }catch(FileNotFoundException e){
            System.out.printf("%s not found",fileName);
        } catch(IOException e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to file organization");
        int ch;
        do {
            System.out.println("\n1. File Reading");
            System.out.println("2. File Writing");
            System.out.println("3. Exit");
            System.out.print("Enter your choice : ");
            ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    fileReader();
                    break;
                case 2:
                    fileWriter();
                    break;
                case 3:
                    exit(0);
            }
        } while (ch == 1 || ch == 2);
    }
}
