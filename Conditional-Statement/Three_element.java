
import java.util.Scanner;

public class Three_element {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num1 = sc.nextInt();

        System.out.println("Enter second no");
        int num2 = sc.nextInt();

        System.out.println("Enter third number");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.println("num1 is greatest :-- " + num1);
        }
        else if(num2 > num3) {
            System.out.println("your lagrest no :-- " + num2);
        }

        else {
            System.out.println("Your largest no" + num3);
        }
        
        sc.close();
    }
    
}
