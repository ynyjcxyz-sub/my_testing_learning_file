import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class test11 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);
        int line = 0;

        while(scanner.hasNextLine()){
            line++;
        }
        System.out.println(line);
        int randomTitleNumber = (int)((line+1)*Math.random());
        System.out.println(randomTitleNumber);
    }
}
