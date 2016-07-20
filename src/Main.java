import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String exit ="no";
        Scanner reader = new Scanner(System.in);
        while(!exit.equals("y")){
            SimpleCalc.start();
            System.out.println("Exit?(y/n)");
            exit = reader.next();
        }
    }
}
