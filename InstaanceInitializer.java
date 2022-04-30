package IntroductionOOPS;

public class InstaanceInitializer {
    int num1;
    int num2;
    InstaanceInitializer(){
        System.out.println("In default constructor");
        num1=1;
        num2=2;
    }
    // Instance initializer
    {
        System.out.println("In instance initializer");
        num1=3;
        num2=4;
    }
    public static void main(String[] args) {
        InstaanceInitializer instaanceInitializer =new InstaanceInitializer();
    }
}
