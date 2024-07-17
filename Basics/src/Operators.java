public class Operators {
    public static void main(String[] args) {
        System.out.println("Learning Operator...");
        // Unary Operators (++ , --)
        /*
        int x = 10;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);
         */

        // Unary Operators (~ and !)
        int a= 10;
        int b= -10;
        boolean c=true;
        boolean d=false;
        // The ~ operator inverts the bits of an integer, producing the negative counterpart decreased by one for positive numbers and the positive counterpart decreased by one for negative numbers.
        System.out.println(~a);//-11 (This happens because inverting the bits of a positive integer results in a negative value that is one less than the negative of the original number.)
        System.out.println(~b);//9 (This happens because inverting the bits of a negative integer results in a positive value that is one less than the positive of the original number.)
       //  The ! operator inverts the boolean value, turning true into false and false into true.
        System.out.println(!c);//false (opposite of boolean value)
        System.out.println(!d);//true

        // Arithmetic Operators
        /*
        int a=10;
        int b=5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
         */

        // Left Shift Operator
        /*
        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10<<3);//10*2^3=10*8=80
        System.out.println(20<<2);//20*2^2=20*4=80
        System.out.println(15<<4);//15*2^4=15*16=240
        */

        // Right Shift Operator
        /*
        System.out.println(10>>2);//10/2^2=10/4=2
        System.out.println(20>>2);//20/2^2=20/4=5
        System.out.println(20>>3);//20/2^3=20/8=2
         */

        // Logical && and Bitwise &
        /*
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a < b && a++ < c);//false && true = false
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a < b & a++ < c);//false && true = false
        System.out.println(a);//11 because second condition is checked
         */

        // Logical || and Bitwise |
        /*
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a>b||a<c);//true || true = true
        System.out.println(a>b|a<c);//true | true = true
        // (|| vs |)
        System.out.println(a>b||a++<c);//true || true = true
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a>b|a++<c);//true | true = true
        System.out.println(a);//11 because second condition is checked
        */

        // Ternary Operator
        /*
        int a=10;
        int b=5;
        int min=(a<b)?a:b;
        System.out.println(min);
        */

        // Assignment Operator
        /*
        int a=10;
        a+=3;//10+3
        System.out.println(a);
        a-=4;//13-4
        System.out.println(a);
        a*=2;//9*2
        System.out.println(a);
        a/=2;//18/2
        System.out.println(a);
         */
    }
}
