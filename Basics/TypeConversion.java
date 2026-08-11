public class TypeConversion {

    public static void main(String[] args) {
        
        // implicit type conversion

        byte a = 50;
        int b =  a;

        System.out.println(b);

        // explicit type conversion 

        int  c = 250;
        byte d =  (byte) c;

        System.out.println(d);

        // From float to integer;
        

        float e = 875.87f;
        int g =  (int) e;

        System.out.println(g);

    }
}
