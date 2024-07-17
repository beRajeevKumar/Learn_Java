// Defining Variables.
public class Variables {
    static int m = 100;//static variable

    public static void main(String[] args) {
        int data = 50;//instance variable
    }

    void method() {
        int n = 90;//local variable
    }
}

// Narrowing (Typecasting)
class Typecasting {
    public static void main(String[] args) {
        float f = 10.5f;
//int a=f;//Compile time error
        int a = (int) f;
        System.out.println(f); // 10.5
        System.out.println(a); // 10
    }
}

// Overflow of Variables.
class Overflow {
    public static void main(String[] args) {
        //Overflow
        int a = 130;
        byte b = (byte) a;
        System.out.println(a); // 130
        System.out.println(b); // -126
    }
}

// Adding Lower Type
class AddingLowerType {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 10;
//byte c=a+b;//Compile Time Error: because a+b=20 will be int
        byte c = (byte) (a + b);
        System.out.println(c);
    }
}