
import java.util.*;

public class ForLoop {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();


        // single looping;

        for(int i = 0; i < n; i++) {

            System.out.println(i + " " + "Hello Ji");
        }

        // Nested Looping;

    for(int i = n; i > 0; i-- ) {

        for(int j = i; j < n;j++) {

            System.out.print("*");
        }
        System.out.println();
    }
    sc.close();
    }
}