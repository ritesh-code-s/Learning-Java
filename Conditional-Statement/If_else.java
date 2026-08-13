
import java.util.Scanner;

public class If_else {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();

        if(age > 18) {
            System.out.println("Your can drive");
            System.out.println("you can vote now");
        }

        else {
            System.out.println("sorry,U are under age, You can`t drive");
        }
        
        sc.close();
    }

    
}
