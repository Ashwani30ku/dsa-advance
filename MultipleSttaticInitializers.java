package IntroductionOOPS;

public class MultipleSttaticInitializers {
    static {
        System.out.println("In first static block");
    }
    static {
        System.out.println("In second static block");
    }
    public static void main(String[] args) {
        System.out.println("In main()");
    }
    static {
        System.out.println("In third static block");
    }
}
