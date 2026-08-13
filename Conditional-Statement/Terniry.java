import java.util.*;

public class Terniry {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three no");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int result =  num1 > num2 && num1 > num3
        ? 0
        : num2 > num3 && num2 > num1 ? 1
        : 2;

        System.out.println("your resulting value is : " + result);

        sc.close();
    }

    
}
