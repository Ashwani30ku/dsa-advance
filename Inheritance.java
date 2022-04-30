package IntroductionOOPS;
// parent class or super class
class A{
    void showA(){
        System.out.println("In class A");
    }
}
// child class or sub class
class B extends A{
    void showB(){
        System.out.println("In class B");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        B b= new B();
        b.showB();
        b.showA();
    }
}
