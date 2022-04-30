package IntroductionOOPS;

public class StaticInitializers {
    int num1;
    int num2;
    static int sum;

    // static Initializers
    static {

        System.out.println("In static initializer");
       // only static variables can be initialized in static initializer the below assignment statemnts will give errors;
        /*
        num1= 10;
        num2=20;

         */
        sum=30;
    }

    public static void main(String[] args) {
        System.out.println("Hello!");
    }
}
