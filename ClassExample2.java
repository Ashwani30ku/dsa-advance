package IntroductionOOPS;

public class ClassExample2 {
    String name;
    String contactNumber;

    // create default constructor
    ClassExample2(){

    }
    // parameterized constuctor
    ClassExample2(String name, String contactNumber){
       this.name=name;
        this.contactNumber=contactNumber;
    }
    public static void main(String[] args) {
        // create an object and initialize
        ClassExample2 Ashwani=new ClassExample2();
        Ashwani.name="Ashwani";
        Ashwani.contactNumber="999999999999";

        ClassExample2 amit=new ClassExample2();
        amit.name="Amit";
        amit.contactNumber="8888888888888";
        ClassExample2 amrita=new ClassExample2("Amrita","77777777");
        System.out.println("'name' in 'amrita'object Amrita ");
    }
}
