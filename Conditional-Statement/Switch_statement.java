
import java.util.*;

public class Switch_statement {

    public static void main(String[] args) {
        
        Scanner  sc = new Scanner(System.in);

        System.out.println("Enter a no btw 1 to 4");
        int A =  sc.nextInt();

        switch(A) {

            case 1:
                System.out.println("your Fav is Spiderman");
                break;

            case 2:
                System.out.println("your fav is IronMan");
                break;

            case 3:
                System.out.println("your fav is Thor");
                break;

            case 4:
                System.out.println("your fav is Captain America");
                break;
            
            default :
                System.out.println("plz enter valid no");
        }

        sc.close();

    }
    
}
