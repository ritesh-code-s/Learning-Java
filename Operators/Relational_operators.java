public class Relational_operators {
    
    public static void main(String [] args) {

        // Realtional operators

        // <,>, <= , >= ;

        int age1  = 8;
        int age2 =  9;

        boolean ans1  = age1 > age2;
        boolean ans2 = age2 > age1;
        boolean ans3 = age1 < age2;
        boolean ans4 = age2 < age1;


        System.out.println(ans1 + " " + ans2 + " " + ans3 + " " + ans4 );

        double weight1 = 12.5;
        double weight2 =  14.5;

        boolean result1 = weight1 <= weight2;
        boolean result2 = weight1 >= weight2;

        System.out.println(result1 + " " + result2);

        float height1 = 4.2f;
        float height2 = 4.2f;

        boolean comp1 = height1 == height2;
        boolean comp2 = height1 != height2;

        System.out.println(comp1 + " " + comp2);
    }
}
