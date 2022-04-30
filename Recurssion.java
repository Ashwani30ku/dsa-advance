public class Recurssion {
    public static void main(String[] args) {
        
        System.out.println(power(4, 3));
    }

    public static int power(int a, int b) {
        if (b == 0)
            return 1;
            return power(a, b - 1) * a;

    }
}

