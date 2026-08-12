public class Logical_operators {

    public static void main(String [] args) {

        int a = 7;
        int b = 8;
        int c = 9;
        int d = 5;


        // Logical Operators &&  || 

        boolean result = (a > b && b < c);
        boolean result1 = (a > b || b < c);
        boolean result2 = (b > a && a > d);

        System.out.println(result + " " + result1 + " " + result2);

        // A usecase of !

        boolean result4 = (a > b && b < c);

        System.out.println(!result4);

    }
    
}
