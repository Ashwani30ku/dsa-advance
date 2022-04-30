package IntroductionOOPS;

public class Example {
    static {
        System.out.println("In static");
    }
    Example(){
        System.out.println("In constructor");

        {
            System.out.println("In Instance Initializer");
        }
    }
    public static void main(String[] args) {
        System.out.println("In main()");
        Example example=new Example();
    }
}
