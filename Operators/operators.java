public class operators {

    public static void main(String[] args) {
        
        int num1 = 4;
        int num2 = 3;

        // Additon operator
        int Additon = num1 + num2;

        int substract =  num1 - num2;

        int Multilpication = num1 * num2;

        int devision = num1/num2;

        int module =  num1 % num2;

        System.out.println(Additon + " " +   substract + " "+ Multilpication + " " + devision + " " + module);

        num1++; // post increment 

        ++num2; // pre increment

        num1--; // post decrement

        --num2; // pre decrement

    }
}