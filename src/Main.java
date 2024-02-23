import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
//        try {
//            FileWriter fw = new FileWriter("C:\\repos\\test12\\fisier.txt");
//            fw.write("linie 01" );
//            fw.write("\n");
//            fw.write("linie 02");
//            fw.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        try {
//            Files.write(Paths.get("xyzt.txt"),
//                    "\n2345678".getBytes(),
//                    StandardOpenOption.CREATE_NEW);
//        }catch (IOException e) {
//            System.out.println("-");
//            System.out.println(e.getMessage());
//            System.exit(-1);
//        }

//        File file = new File("HELP.txt");
//
//        try {
//            Scanner scanner = new Scanner(file);
//
//            //now read the file line by line...
//            int lineNum = 0;
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                lineNum++;
//                if(line.contains("pokemon")) {
//                    System.out.println("line " +lineNum);
//                }
//            }
//        } catch(FileNotFoundException e) {
//            //handle this
//        }
//
//    }

        int a = -10;
        int b = 3;
        System.out.println(a / b);
        System.out.println(a % b);
    }
}