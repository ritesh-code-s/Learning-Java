
import java.util.*;

public class WhileLoops {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your fav number");
        int n = sc.nextInt();

        // basics while loop structure;
        int i = 1;
        while (i < n) {

            System.out.println(i + " " + "Here we know about While Loops");

            i++;
        }

        // Creating a table using a while loop;


        int j = 2;

        int k = 1;

        while(k <= 10) {

            System.out.println( j * k);

            k++;


        }
        sc.close();
    }
    
}
